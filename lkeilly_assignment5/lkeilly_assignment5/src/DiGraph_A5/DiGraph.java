package DiGraph_A5;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class DiGraph implements DiGraphInterface {
	int nodeCount;
	int edgeCount;
	HashMap<Long, String> nodesIds;
	HashMap<String, Node> nodesLabels;
	HashMap<Long, Edge> edges;

	public DiGraph() { // default constructor
		// explicitly include this
		// we need to have the default constructor
		// if you then write others, this one will still be there
		
		nodeCount = 0; 
		edgeCount = 0;
		nodesIds = new HashMap<Long, String>();
		nodesLabels = new HashMap<String, Node>();
		edges = new HashMap<Long, Edge>();
	}

	// Getters
	public HashMap<Long, String> getNodesIds() {
		return nodesIds;
	}

	public HashMap<String, Node> getNodesLabels() {
		return nodesLabels;
	}

	public HashMap<Long, Edge> getEdges() {
		return edges;
	}

	// Other methods
	@Override
	public boolean addNode(long idNum, String label) {
		if (label == null) { 		
			try {
				label.compareTo(null);
			} catch (NullPointerException e) {
				System.out.println("Label cannot be null");
				
				return false;
			} 
		}
		if (idNum < 0) {
			System.out.println("Invalid ID - has to be greater or equal to zero");

			return false;
		}
		if (nodeCount == 0) {
			Node n = new Node(idNum, label);
			nodesIds.put(idNum, label);
			nodesLabels.put(label, n);
			nodeCount++;

			return true;

		} else {
			if ((nodesIds.containsKey(idNum)) || (nodesLabels.containsKey(label))) {

				return false;

			} else {
				Node n = new Node(idNum, label);
				nodesIds.put(idNum, label);
				nodesLabels.put(label, n);
				nodeCount++;

				return true;
			}
		}
	}
	@Override
	public boolean addEdge(long idNum, String sLabel, String dLabel, String eLabel) {
		return addEdge(idNum, sLabel, dLabel, 1, eLabel);
	}

	@Override
	public boolean addEdge(long idNum, String sLabel, String dLabel, long weight, String eLabel) {
		if (idNum < 0) {
			System.out.println("Invalid ID - has to be greater or equal to zero");

			return false;
		}
		
		if ((edges.containsKey(idNum)) || !(nodesLabels.containsKey(sLabel)) || !(nodesLabels.containsKey(dLabel))) {

			return false;
		}
		if (getNode(sLabel).getOutcomingEdges().containsKey(dLabel)) {
			System.out.println("There is an edge from " + sLabel + " to " + dLabel + " already");

			return false;
		}

		Edge edge = new Edge(idNum, sLabel, dLabel, weight, eLabel);
		edges.put(idNum, edge);
		getNode(sLabel).getOutcomingEdges().put(dLabel, edge);
		getNode(dLabel).getIncomingEdges().put(sLabel, edge);
		edgeCount++;

		return true;
	}
	
	@Override
	public boolean delNode(String label) {  //Removing O(E) - E: number of edges of node ************* 
		if(nodesLabels.containsKey(label)) {
			long id = -1;	
			String destLabel;
			String sourceLabel;	
			
			if(getNode(label).getIncomingEdges().containsKey(label)) {  //Deleting edge to itself
				id = getNode(label).getIncomingEdges().get(label).getId();
				getNode(label).getIncomingEdges().remove(label);
				getNode(label).getOutcomingEdges().remove(label);
				edges.remove(id);
				edgeCount--;
			}
			for (Entry<String , Edge> e : getNode(label).getOutcomingEdges().entrySet()) { //Deleting out-coming edges
				id = e.getValue().getId();
				destLabel = e.getValue().getDestNodeLabel();
				getNode(label).getOutcomingEdges().remove(destLabel);	
				getNode(destLabel).getIncomingEdges().remove(label);
				edges.remove(id);
				edgeCount--;							
			}
			for (Entry<String, Edge> e : getNode(label).getIncomingEdges().entrySet()) { //deleting in-coming edges
				id = e.getValue().getId();
				sourceLabel = e.getValue().getSourceNodeLabel();
				getNode(label).getIncomingEdges().remove(sourceLabel);
				getNode(sourceLabel).getOutcomingEdges().remove(label);
				edges.remove(id);
				edgeCount--;		
			}
		
			id = nodesLabels.get(label).getId();
			nodesIds.remove(id);
			nodesLabels.remove(label);
			nodeCount--;

			return true;

		} else {
			System.out.println("The node to remove is not in the graph");

			return false;
		}
	}
	
   /*
	@Override
	public boolean delNode(String label) { // Removing O(N) - N: number of Nodes *************
		if (nodesLabels.containsKey(label)) {
			long id1 = -1;
			long id2 = -1;
			for (Entry<String, Node> n : nodesLabels.entrySet()) {

				if (n.getValue().getIncomingEdges().containsKey(label)) {
					id1 = n.getValue().getIncomingEdges().get(label).getId();
					n.getValue().getIncomingEdges().remove(label);
					edges.remove(id1);
					edgeCount--;
				}
				if (n.getValue().getOutcomingEdges().containsKey(label)) {
					id2 = n.getValue().getOutcomingEdges().get(label).getId();
					n.getValue().getOutcomingEdges().remove(label);
					if (id1 != id2) {
						edges.remove(id2);
						edgeCount--;
					}
				}
			}

			id1 = nodesLabels.get(label).getId();
			nodesIds.remove(id1);
			nodesLabels.remove(label);
			nodeCount--;

			return true;

		} else {
			System.out.println("The node to remove is not in the graph");

			return false;
		}
	}
	
 */
	@Override
	public boolean delEdge(String sLabel, String dLabel) {
		if ((nodesLabels.containsKey(sLabel)) && (nodesLabels.containsKey(dLabel))
				&& (getNode(sLabel).getOutcomingEdges().containsKey(dLabel))) {

			long id = getNode(sLabel).getOutcomingEdges().get(dLabel).getId();
			getNode(sLabel).getOutcomingEdges().remove(dLabel);
			getNode(dLabel).getIncomingEdges().remove(sLabel);
			edges.remove(id);
			edgeCount--;

			return true;
		}

		return false;
	}

	@Override
	public long numNodes() {
		return nodeCount;
	}

	@Override
	public long numEdges() {
		return edgeCount;
	}
	
	@Override
	public ShortestPathInfo[] shortestPath(String label) {
		ShortestPathInfo[] shortestPathArray = new ShortestPathInfo[(int)numNodes()];
		int i = 0;
		if(nodesLabels.containsKey(label)) {
			HashMap<Node, String> visitedNodes = new HashMap<>();  //Checking with hashmap ******
			PriorityQueue<ShortestPathInfo> pq = new PriorityQueue<ShortestPathInfo>((int)numEdges(), new WeightedNodeComparator());
			ShortestPathInfo sPath;
			Node child;
			long currentDistance;			
			
			getNode(label).setDistance(0);
			pq.add(new ShortestPathInfo(label, 0));
			
			while(!pq.isEmpty()) {
				sPath = pq.poll();
				Node node = getNode(sPath.getDest());
				if(!visitedNodes.containsKey(node)) {
					shortestPathArray[i] = sPath;
					i++;
					visitedNodes.put(node, node.getLabel());
					for (Entry<String, Edge> e : node.getOutcomingEdges().entrySet()) { 
						child = getNode(e.getValue().getDestNodeLabel());
						currentDistance = node.getDistance() + e.getValue().getWeight();
						if(child.getDistance() > currentDistance) {
							child.setDistance(currentDistance);
							pq.add(new ShortestPathInfo(e.getValue().getDestNodeLabel(), currentDistance));
						}					
					}
				}
			}
			if(i < numNodes()) {
				for (Entry<String, Node> n : nodesLabels.entrySet()) {
					if (n.getValue().getDistance() == n.getValue().getInfinitive()) {
						shortestPathArray[i] = new ShortestPathInfo(n.getValue().getLabel(), -1);
						i++;
					}
				}
			}	
			
		} else {
			System.out.println("The node " + label + " is not in the graph");
			for (Entry<String, Node> n : nodesLabels.entrySet()) {
				shortestPathArray[i] = new ShortestPathInfo(n.getValue().getLabel(), -1);
				i++;
			}			
		}		
		return shortestPathArray;		
	}

	// rest of your code to implement the various operations
	private Node getNode(String label) {
		return nodesLabels.get(label);
	}
}
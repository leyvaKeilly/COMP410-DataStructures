package DiGraph_A5;

import java.util.HashMap;
import java.util.Map.Entry;

public class DiGraphPlayground {

	public static void main(String[] args) {

		// exTest();
		// addNodeTests();
		// addEdgesTests();
		// deleteNodeTests();
		// deleteEdgeTests(); 
		// testingShortestPath();
	    // ShortestPathTest1();
	}
	
	public static void ShortestPathTest1() {
		DiGraph d = new DiGraph();
		boolean add;
		add = d.addNode(1, "a");
		add = d.addNode(2, "b");
		add = d.addNode(3, "c");
		add = d.addEdge(0, "a", "b",3, null);
		add = d.addEdge(1, "b", "c",4, null);
		add = d.addEdge(2, "a", "c",10, null);
		for (Entry<Long, String> m : d.nodesIds.entrySet()) {
			System.out.println("NodesId: " + m.getKey() + " " + m.getValue());
		}
		for (Entry<Long, Edge> m : d.edges.entrySet()) {
			System.out.println("Edges: " + m.getKey() + " " + m.getValue().label + " " + m.getValue().sourceNodeLabel + " "
					+ m.getValue().weight + " " + m.getValue().destNodeLabel);
		}
		System.out.println("numEdges: " + d.numEdges());
		System.out.println("numNodes: " + d.numNodes());
		
		ShortestPathInfo[] array = d.shortestPath("a");
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i].getDest() + " " + array[i].getTotalWeight());
		}
		
	}
	
	public static void testingShortestPath() {
		DiGraph d = new DiGraph();
		boolean add;
		add = d.addNode(1, "Raleigh");
		add = d.addNode(2, "Durham");
		add = d.addNode(3, "Pittsboro");
		add = d.addNode(4, "Los_angeles");
		add = d.addNode(5, "Graham");
		add = d.addNode(6, "Cary");
		add = d.addNode(7, "Chapel_hill");
		add = d.addNode(8, "Hillsborough");
		add = d.addNode(9, "Carrboro");
		add = d.addNode(10, "Sanford");
		add = d.addEdge(1, "Raleigh", "Durham", 14, null);
		add = d.addEdge(2, "Durham", "Hillsborough", 9, null);
		add = d.addEdge(3, "Chapel_hill", "Graham", 25, null);
		add = d.addEdge(4, "Chapel_hill", "Carrboro", 1, null);
		add = d.addEdge(5, "Carrboro", "Cary", 32, null);
		add = d.addEdge(6, "Cary", "Raleigh", 3, null);
		add = d.addEdge(7, "Pittsboro", "Cary", 17, null);
		add = d.addEdge(8, "Pittsboro", "Sanford", 15, null);
		add = d.addEdge(9, "Sanford", "Los_angeles", 3012, null);
		
		for (Entry<Long, String> m : d.nodesIds.entrySet()) {
			System.out.println("NodesId: " + m.getKey() + " " + m.getValue());
		}
		for (Entry<Long, Edge> m : d.edges.entrySet()) {
			System.out.println("Edges: " + m.getKey() + " " + m.getValue().label + " " + m.getValue().sourceNodeLabel + " "
					+ m.getValue().weight + " " + m.getValue().destNodeLabel);
		}
		System.out.println("numEdges: " + d.numEdges());
		System.out.println("numNodes: " + d.numNodes());
		
		ShortestPathInfo[] array = d.shortestPath("Pittsboro");
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i].getDest() + " " + array[i].getTotalWeight());
		}
	}
	
	public static void deleteEdgeTests() {
		DiGraph d = new DiGraph();
		boolean deleteEdge;
				
		boolean add = d.addNode(0, "f");		
		System.out.println("Inserted 0-f? " + add);
		
		add = d.addNode(1, "d");
		System.out.println("Inserted 1-d? " + add);
		
		add = d.addEdge(0, "f", "d", 1, null);
		System.out.println("Inserted edge from f to d? " + add);
		
		add = d.addEdge(1, "d", "f", 1, null);
		System.out.println("Inserted edge from d to f? " + add);
		
		add = d.addEdge(3, "f", "f", 1, null);
		System.out.println("Inserted edge from itself to itself? " + add);
		
		deleteEdge = d.delEdge("g", "f");
		System.out.println("Delete non-existing edge: " + deleteEdge);
		
		deleteEdge = d.delEdge("d", "f");
		System.out.println("Delete d to f: " + deleteEdge);
		
		for (Entry<Long, String> m : d.nodesIds.entrySet()) {
			System.out.println("NodesId: " + m.getKey() + " " + m.getValue());
		}
		for (Entry<String, Node> m : d.nodesLabels.entrySet()) {
			System.out.println("NodesLabels: " + m.getKey() + " " + m.getValue().label + " " + m.getValue().id);
		}
		for (Entry<Long, Edge> m : d.edges.entrySet()) {
			System.out.println("Edges: " + m.getKey() + " " + m.getValue().label + " " + m.getValue().id + " "
					+ m.getValue().weight + " " + m.getValue().destNodeLabel + " " + m.getValue().sourceNodeLabel);
		}
		System.out.println("numEdges: " + d.numEdges());
		System.out.println("numNodes: " + d.numNodes());
		
		deleteEdge = d.delEdge("f", "f");
		System.out.println("Delete f to f: " + deleteEdge);
		
		for (Entry<Long, String> m : d.nodesIds.entrySet()) {
			System.out.println("NodesId: " + m.getKey() + " " + m.getValue());
		}
		for (Entry<String, Node> m : d.nodesLabels.entrySet()) {
			System.out.println("NodesLabels: " + m.getKey() + " " + m.getValue().label + " " + m.getValue().id);
		}
		for (Entry<Long, Edge> m : d.edges.entrySet()) {
			System.out.println("Edges: " + m.getKey() + " " + m.getValue().label + " " + m.getValue().id + " "
					+ m.getValue().weight + " " + m.getValue().destNodeLabel + " " + m.getValue().sourceNodeLabel);
		}
		System.out.println("numEdges: " + d.numEdges());
		System.out.println("numNodes: " + d.numNodes());
	}
	
	public static void deleteNodeTests() {
		DiGraph d = new DiGraph();
		boolean deleteNode;
				
		boolean add = d.addNode(0, "f");		
		System.out.println("Inserted 0-f? " + add);
		
		add = d.addNode(1, "d");
		System.out.println("Inserted 1-d? " + add);
		
		add = d.addEdge(0, "f", "d", 1, null);
		System.out.println("Inserted edge from f to d? " + add);
		
		add = d.addEdge(1, "d", "f", 1, null);
		System.out.println("Inserted edge from d to f? " + add);
		
		add = d.addEdge(3, "f", "f", 1, null);
		System.out.println("Inserted edge from itself to itself? " + add);
		
		deleteNode = d.delNode("g");
		System.out.println("Delete non-existing node: " + deleteNode);
		
		for (Entry<Long, String> m : d.nodesIds.entrySet()) {
			System.out.println("NodesId: " + m.getKey() + " " + m.getValue());
		}
		for (Entry<String, Node> m : d.nodesLabels.entrySet()) {
			System.out.println("NodesLabels: " + m.getKey() + " " + m.getValue().label + " " + m.getValue().id);
		}
		for (Entry<Long, Edge> m : d.edges.entrySet()) {
			System.out.println("Edges: " + m.getKey() + " " + m.getValue().label + " " + m.getValue().id + " "
					+ m.getValue().weight + " " + m.getValue().destNodeLabel + " " + m.getValue().sourceNodeLabel);
		}
		System.out.println("numEdges: " + d.numEdges());
		System.out.println("numNodes: " + d.numNodes());	
		
		deleteNode = d.delNode("d");
		System.out.println("Delete node d: " + deleteNode);
		
		for (Entry<Long, String> m : d.nodesIds.entrySet()) {
			System.out.println("NodesId: " + m.getKey() + " " + m.getValue());
		}
		for (Entry<String, Node> m : d.nodesLabels.entrySet()) {
			System.out.println("NodesLabels: " + m.getKey() + " " + m.getValue().label + " " + m.getValue().id);
		}
		for (Entry<Long, Edge> m : d.edges.entrySet()) {
			System.out.println("Edges: " + m.getKey() + " " + m.getValue().label + " " + m.getValue().id + " "
					+ m.getValue().weight + " " + m.getValue().destNodeLabel + " " + m.getValue().sourceNodeLabel);
		}
		System.out.println("numEdges: " + d.numEdges());
		System.out.println("numNodes: " + d.numNodes());	
		
		add = d.addNode(1, "d");
		System.out.println("Inserted 1-d? " + add);
		
		add = d.addEdge(0, "f", "d", 1, null);
		System.out.println("Inserted edge from f to d? " + add);
		
		add = d.addEdge(1, "d", "f", 1, null);
		System.out.println("Inserted edge from d to f? " + add);
		
		add = d.addEdge(3, "f", "f", 1, null);
		System.out.println("Inserted edge again? " + add);
		
		deleteNode = d.delNode("f");
		System.out.println("Delete node f: " + deleteNode);
		
		for (Entry<Long, String> m : d.nodesIds.entrySet()) {
			System.out.println("NodesId: " + m.getKey() + " " + m.getValue());
		}
		for (Entry<String, Node> m : d.nodesLabels.entrySet()) {
			System.out.println("NodesLabels: " + m.getKey() + " " + m.getValue().label + " " + m.getValue().id);
		}
		for (Entry<Long, Edge> m : d.edges.entrySet()) {
			System.out.println("Edges: " + m.getKey() + " " + m.getValue().label + " " + m.getValue().id + " "
					+ m.getValue().weight + " " + m.getValue().destNodeLabel + " " + m.getValue().sourceNodeLabel);
		}
		System.out.println("numEdges: " + d.numEdges());
		System.out.println("numNodes: " + d.numNodes());	
		
	}

	public static void addEdgesTests() {
		DiGraph d = new DiGraph();
		boolean add = d.addNode(0, "f");
		System.out.println("Inserted 0-f? " + add);
		add = d.addEdge(0, "f", "g", 1, null);
		System.out.println("Inserted edge with only one node? " + add);
		
		for (Entry<Long, String> m : d.nodesIds.entrySet()) {
			System.out.println("NodesId: " + m.getKey() + " " + m.getValue());
		}
		for (Entry<String, Node> m : d.nodesLabels.entrySet()) {
			System.out.println("NodesLabels: " + m.getKey() + " " + m.getValue().label + " " + m.getValue().id);
		}
		for (Entry<Long, Edge> m : d.edges.entrySet()) {
			System.out.println("Edges: " + m.getKey() + " " + m.getValue().label + " " + m.getValue().id + " "
					+ m.getValue().weight + " " + m.getValue().destNodeLabel + " " + m.getValue().sourceNodeLabel);
		}
		System.out.println("numEdges: " + d.numEdges());
		System.out.println("numNodes: " + d.numNodes());
		
		add = d.addNode(1, "d");
		System.out.println("Inserted 1-d? " + add);
		add = d.addEdge(0, "f", "d", 1, null);
		System.out.println("Inserted edge from f to d? " + add);
		
		for (Entry<Long, String> m : d.nodesIds.entrySet()) {
			System.out.println("NodesId: " + m.getKey() + " " + m.getValue());
		}
		for (Entry<String, Node> m : d.nodesLabels.entrySet()) {
			System.out.println("NodesLabels: " + m.getKey() + " " + m.getValue().label + " " + m.getValue().id);
		}
		for (Entry<Long, Edge> m : d.edges.entrySet()) {
			System.out.println("Edges: " + m.getKey() + " " + m.getValue().label + " " + m.getValue().id + " "
					+ m.getValue().weight + " " + m.getValue().destNodeLabel + " " + m.getValue().sourceNodeLabel);
		}
		System.out.println("numEdges: " + d.numEdges());
		System.out.println("numNodes: " + d.numNodes());
		
		add = d.addEdge(1, "d", "f", 1, null);
		System.out.println("Inserted edge from d to f? " + add);
		for (Entry<Long, String> m : d.nodesIds.entrySet()) {
			System.out.println("NodesId: " + m.getKey() + " " + m.getValue());
		}
		for (Entry<String, Node> m : d.nodesLabels.entrySet()) {
			System.out.println("NodesLabels: " + m.getKey() + " " + m.getValue().label + " " + m.getValue().id);
		}
		for (Entry<Long, Edge> m : d.edges.entrySet()) {
			System.out.println("Edges: " + m.getKey() + " " + m.getValue().label + " " + m.getValue().id + " "
					+ m.getValue().weight + " " + m.getValue().destNodeLabel + " " + m.getValue().sourceNodeLabel);
		}
		System.out.println("numEdges: " + d.numEdges());
		System.out.println("numNodes: " + d.numNodes());
		
		add = d.addEdge(1, "d", "f", 1, null);
		System.out.println("Inserted edge with no unique ID? " + add);
		
		add = d.addEdge(3, "d", "f", 1, null);
		System.out.println("Inserted existing edge? " + add);
		
		for (Entry<Long, String> m : d.nodesIds.entrySet()) {
			System.out.println("NodesId: " + m.getKey() + " " + m.getValue());
		}
		for (Entry<String, Node> m : d.nodesLabels.entrySet()) {
			System.out.println("NodesLabels: " + m.getKey() + " " + m.getValue().label + " " + m.getValue().id);
		}
		for (Entry<Long, Edge> m : d.edges.entrySet()) {
			System.out.println("Edges: " + m.getKey() + " " + m.getValue().label + " " + m.getValue().id + " "
					+ m.getValue().weight + " " + m.getValue().destNodeLabel + " " + m.getValue().sourceNodeLabel);
		}
		System.out.println("numEdges: " + d.numEdges());
		System.out.println("numNodes: " + d.numNodes());
		
		add = d.addEdge(3, "f", "f", 1, null);
		System.out.println("Inserted edge from itself to itself? " + add);
		
		for (Entry<Long, String> m : d.nodesIds.entrySet()) {
			System.out.println("NodesId: " + m.getKey() + " " + m.getValue());
		}
		for (Entry<String, Node> m : d.nodesLabels.entrySet()) {
			System.out.println("NodesLabels: " + m.getKey() + " " + m.getValue().label + " " + m.getValue().id);
		}
		for (Entry<Long, Edge> m : d.edges.entrySet()) {
			System.out.println("Edges: " + m.getKey() + " " + m.getValue().label + " " + m.getValue().id + " "
					+ m.getValue().weight + " " + m.getValue().destNodeLabel + " " + m.getValue().sourceNodeLabel);
		}
		System.out.println("numEdges: " + d.numEdges());
		System.out.println("numNodes: " + d.numNodes());		
	}

	public static void addNodeTests() {
		DiGraph d = new DiGraph();
		boolean add = d.addNode(0, null);
		System.out.println("Inserted null label? " + add);
		for (Entry<Long, String> m : d.nodesIds.entrySet()) {
			System.out.println("NodesId: " + m.getKey() + " " + m.getValue());
		}
		for (Entry<String, Node> m : d.nodesLabels.entrySet()) {
			System.out.println("NodesLabels: " + m.getKey() + " " + m.getValue().label + " " + m.getValue().id);
		}
		System.out.println("numEdges: " + d.numEdges());
		System.out.println("numNodes: " + d.numNodes());

		add = d.addNode(1, "f");
		System.out.println("Inserted 1-f? " + add);
		for (Entry<Long, String> m : d.nodesIds.entrySet()) {
			System.out.println("NodesId: " + m.getKey() + " " + m.getValue());
		}
		for (Entry<String, Node> m : d.nodesLabels.entrySet()) {
			System.out.println("NodesLabels: " + m.getKey() + " " + m.getValue().label + " " + m.getValue().id);
		}
		System.out.println("numEdges: " + d.numEdges());
		System.out.println("numNodes: " + d.numNodes());

		add = d.addNode(-1, "f");
		System.out.println("Inserted negative id? " + add);
		for (Entry<Long, String> m : d.nodesIds.entrySet()) {
			System.out.println("NodesId: " + m.getKey() + " " + m.getValue());
		}
		for (Entry<String, Node> m : d.nodesLabels.entrySet()) {
			System.out.println("NodesLabels: " + m.getKey() + " " + m.getValue().label + " " + m.getValue().id);
		}
		System.out.println("numEdges: " + d.numEdges());
		System.out.println("numNodes: " + d.numNodes());

		add = d.addNode(1, "d");
		System.out.println("Inserted repeated id? " + add);
		for (Entry<Long, String> m : d.nodesIds.entrySet()) {
			System.out.println("NodesId: " + m.getKey() + " " + m.getValue());
		}
		for (Entry<String, Node> m : d.nodesLabels.entrySet()) {
			System.out.println("NodesLabels: " + m.getKey() + " " + m.getValue().label + " " + m.getValue().id);
		}
		System.out.println("numEdges: " + d.numEdges());
		System.out.println("numNodes: " + d.numNodes());

		add = d.addNode(4, "f");
		System.out.println("Inserted repeated label? " + add);
		for (Entry<Long, String> m : d.nodesIds.entrySet()) {
			System.out.println("NodesId: " + m.getKey() + " " + m.getValue());
		}
		for (Entry<String, Node> m : d.nodesLabels.entrySet()) {
			System.out.println("NodesLabels: " + m.getKey() + " " + m.getValue().label + " " + m.getValue().id);
		}
		System.out.println("numEdges: " + d.numEdges());
		System.out.println("numNodes: " + d.numNodes());

		add = d.addNode(3, "d");
		System.out.println("Inserted 3-d? " + add);
		for (Entry<Long, String> m : d.nodesIds.entrySet()) {
			System.out.println("NodesId: " + m.getKey() + " " + m.getValue());
		}
		for (Entry<String, Node> m : d.nodesLabels.entrySet()) {
			System.out.println("NodesLabels: " + m.getKey() + " " + m.getValue().label + " " + m.getValue().id);
		}
		System.out.println("numEdges: " + d.numEdges());
		System.out.println("numNodes: " + d.numNodes());
	}

	public static void exTest() {
		DiGraph d = new DiGraph();
		d.addNode(1, "f");
		d.addNode(3, "s");
		d.addNode(7, "t");
		d.addNode(0, "fo");
		d.addNode(4, "fi");
		d.addNode(6, "si");
		d.addEdge(0, "f", "s", 0, null);
		d.addEdge(1, "f", "si", 0, null);
		d.addEdge(2, "s", "t", 0, null);
		d.addEdge(3, "fo", "fi", 0, null);
		d.addEdge(4, "fi", "si", 0, null);
		System.out.println("numEdges: " + d.numEdges());
		System.out.println("numNodes: " + d.numNodes());
	}	
}
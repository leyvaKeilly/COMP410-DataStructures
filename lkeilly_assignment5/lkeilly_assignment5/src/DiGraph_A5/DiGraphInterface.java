package DiGraph_A5;

public interface DiGraphInterface {
	/*
	 * Interface: A DIGRAPH will provide this collection of operations:
	 * 
	 * addNode in: unique id number of the node (0 or greater) string for name you
	 * might want to generate the unique number automatically but this operation
	 * allows you to specify any integer both id number and label must be unique
	 * return: boolean returns false if node number is not unique, or less than 0
	 * returns false if label is not unique (or is null) returns true if node is
	 * successfully added
	 */
	boolean addNode(long idNum, String label);

	/*
	 * addEdge in: unique id number for the new edge, label of source node, label of
	 * destination node, weight for new edge (use 1 by default) label for the new
	 * edge (allow null) return: boolean returns false if edge number is not unique
	 * or less than 0 returns false if source node is not in graph returns false if
	 * destination node is not in graph returns false is there already is an edge
	 * between these 2 nodes returns true if edge is successfully added
	 */
	boolean addEdge(long idNum, String sLabel, String dLabel, long weight, String eLabel);
	boolean addEdge(long idNum, String sLabel, String dLabel, String eLabel);

	/*
	 * delNode in: string label for the node to remove out: boolean return false if
	 * the node does not exist return true if the node is found and successfully
	 * removed
	 */
	boolean delNode(String label);

	/*
	 * delEdge in: string label for source node string label for destination node
	 * out: boolean return false if the edge does not exist return true if the edge
	 * is found and successfully removed
	 */
	boolean delEdge(String sLabel, String dLabel);

	/*
	 * numNodes in: nothing return: integer 0 or greater reports how many nodes are
	 * in the graph
	 */
	long numNodes();

	/*
	 * numEdges in: nothing return: integer 0 or greater reports how many edges are
	 * in the graph
	 */
	long numEdges();

	/*
	 * shortestPath: in: string label for start vertex return: array of
	 * ShortestPathInfo objects (ShortestPathInfo) length of this array should be
	 * numNodes (as you will put in all shortest paths including from source to
	 * itself) See ShortestPathInfo class for what each field of this object should
	 * contain
	 */
	ShortestPathInfo[] shortestPath(String label);
}
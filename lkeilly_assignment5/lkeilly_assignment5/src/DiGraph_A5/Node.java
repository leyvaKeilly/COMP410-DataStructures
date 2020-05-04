package DiGraph_A5;

import java.util.HashMap;

public class Node {
	long id;
	long distance;
	String label;
	double inf = Double.POSITIVE_INFINITY;
	HashMap<String, Edge> incomingEdges; 
	HashMap<String, Edge> outcomingEdges;

	public Node(long id, String label) {
		this.id = id;
		this.label = label;
		incomingEdges = new HashMap<String, Edge>();
		outcomingEdges = new HashMap<String, Edge>();
		distance = (long) inf;  
	}
	
	//Getters
	public long getId() {
		return id;
	}
	
	public String getLabel() {
		return label;
	}
	
	public HashMap<String, Edge> getIncomingEdges(){
		return incomingEdges;
	}
	
	public HashMap<String, Edge> getOutcomingEdges(){
		return outcomingEdges;
	}
	public long getDistance() {
		return distance;
	}
	public long getInfinitive() {
		return (long) inf;
	}
	//Setters
	public void setDistance(long distance) {		
		this.distance = distance;
	}
}

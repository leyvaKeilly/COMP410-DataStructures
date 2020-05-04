package DiGraph_A5;

public class Edge {
	long id;
	long weight;
	String label;
	String sourceNodeLabel;
	String destNodeLabel;

	public Edge(long id, String sourceNodeLabel, String destNodeLabel, long weight, String label) {

		this.id = id;
		this.label = label;
		this.sourceNodeLabel = sourceNodeLabel;
		this.destNodeLabel = destNodeLabel;
		this.weight = weight;
	}

	public Edge(long id, String sourceNodeLabel, String destNodeLabel, String label) { 
		this(id, sourceNodeLabel, destNodeLabel, 1, label);
	}
	
	//Getters
	public long getId() {
		return id;
	}

	public long getWeight() {
		return weight;
	}

	public String getLabel() {
		return label;
	}

	public String getSourceNodeLabel() {
		return sourceNodeLabel;
	}

	public String getDestNodeLabel() {
		return destNodeLabel;
	}
}

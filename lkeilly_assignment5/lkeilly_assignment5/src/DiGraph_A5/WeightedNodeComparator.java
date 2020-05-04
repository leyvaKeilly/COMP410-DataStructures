package DiGraph_A5;

import java.util.Comparator;

public class WeightedNodeComparator implements Comparator<ShortestPathInfo> {

	// Overriding compare()method of Comparator
	// for ascending order on weight
	public int compare(ShortestPathInfo wN1, ShortestPathInfo wN2) {
		if (wN1.getTotalWeight() < wN2.getTotalWeight())
			return -1;
		else if (wN1.getTotalWeight() > wN2.getTotalWeight())
			return 1;
		return 0;
	}
}

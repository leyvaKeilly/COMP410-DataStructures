package MinBinHeap_A3;

public class MinBinHeap_Playground {
	public static void main(String[] args) {
		// Add more tests as methods and call them here!!
		// TestBuild();
		// My tests
		// InsertBasicsTest();
		// DeleteMinTest();
		// GeneralTest();
	}

	public static void GeneralTest() {
		MinBinHeap mbh = new MinBinHeap();
		EntryPair item1 = new EntryPair("c", 3);
		EntryPair item2 = new EntryPair("g", 7);
		EntryPair item3 = new EntryPair("a", 1);
		EntryPair item4 = new EntryPair("i", 9);
		EntryPair item5 = new EntryPair("e", 5);

		mbh.insert(item1);
		System.out.println("Size: " + mbh.size());
		System.out.println("GetMin: " + mbh.getMin().getValue());
		displayMBH(mbh);
		mbh.delMin();
		System.out.println("Size: " + mbh.size());
		System.out.println("GetMin: " + mbh.getMin());
		displayMBH(mbh);
		mbh.insert(item1);
		mbh.insert(item2);
		mbh.insert(item3);
		System.out.println("Size: " + mbh.size());
		System.out.println("GetMin: " + mbh.getMin().getValue());
		displayMBH(mbh);
		mbh.delMin();
		System.out.println("Size: " + mbh.size());
		System.out.println("GetMin: " + mbh.getMin().getValue());
		displayMBH(mbh);
		mbh.delMin();
		mbh.delMin();
		System.out.println("Size: " + mbh.size());
		System.out.println("GetMin: " + mbh.getMin());
		displayMBH(mbh);
		mbh.delMin();
		mbh.delMin();
		mbh.delMin();
		mbh.delMin();
		System.out.println("Size: " + mbh.size());
		System.out.println("GetMin: " + mbh.getMin());
		displayMBH(mbh);
		mbh.insert(item1);
		mbh.insert(item2);
		mbh.insert(item3);
		mbh.insert(item4);
		mbh.insert(item5);
		System.out.println("Size: " + mbh.size());
		System.out.println("GetMin: " + mbh.getMin().getValue());
		displayMBH(mbh);
		mbh.delMin();
		System.out.println("Size: " + mbh.size());
		System.out.println("GetMin: " + mbh.getMin().getValue());
		displayMBH(mbh);
	}

	public static void DeleteMinTest() {
		MinBinHeap mbh = new MinBinHeap();
		EntryPair item1 = new EntryPair("c", 3);
		EntryPair item2 = new EntryPair("g", 7);
		EntryPair item3 = new EntryPair("a", 1);
		EntryPair item4 = new EntryPair("i", 9);
		EntryPair item5 = new EntryPair("e", 5);
		mbh.insert(item1);
		mbh.insert(item2);
		mbh.insert(item3);
		mbh.insert(item4);
		mbh.insert(item5);
		System.out.println("Size: " + mbh.size());
		System.out.println("GetMin: " + mbh.getMin().getValue());
		displayMBH(mbh);
		mbh.delMin();
		System.out.println("Size: " + mbh.size());
		System.out.println("GetMin: " + mbh.getMin().getValue());
		displayMBH(mbh);
		mbh.delMin();
		mbh.delMin();
		System.out.println("Size: " + mbh.size());
		System.out.println("GetMin: " + mbh.getMin().getValue());
		displayMBH(mbh);
	}

	public static void InsertBasicsTest() {
		MinBinHeap mbh = new MinBinHeap();
		EntryPair item1 = new EntryPair("c", 3);
		EntryPair item2 = new EntryPair("g", 7);
		EntryPair item3 = new EntryPair("a", 1);
		EntryPair item4 = new EntryPair("i", 9);
		EntryPair item5 = new EntryPair("e", 5);

		System.out.println("Size: " + mbh.size());
		System.out.println("GetMin: " + mbh.getMin());
		mbh.insert(item1);
		mbh.insert(item2);
		System.out.println("Size: " + mbh.size());
		System.out.println("GetMin: " + mbh.getMin().getValue());
		mbh.insert(item3);
		mbh.insert(item4);
		System.out.println("Size: " + mbh.size());
		System.out.println("GetMin: " + mbh.getMin().getValue());
		mbh.insert(item5);
		System.out.println("Size: " + mbh.size());
		System.out.println("GetMin: " + mbh.getMin().getValue());
		displayMBH(mbh);
		System.out.println("Size: " + mbh.size());
	}

	public static void displayMBH(MinBinHeap mbh) {
		if (mbh.size() == 0) {
			System.out.println("Entry array empty");
		}
		for (int i = 1; i <= mbh.size(); i++) {
			System.out.println("element " + i + ": " + mbh.getHeap()[i].getValue() + ", priority " + mbh.getHeap()[i].getPriority());
		}
	}

	public static void TestBuild() {
		// constructs a new minbinheap, constructs an array of EntryPair,
		// passes it into build function. Then print collection and heap.
		MinBinHeap mbh = new MinBinHeap();
		EntryPair[] collection = new EntryPair[8];
		collection[0] = new EntryPair("i", 3);
		collection[1] = new EntryPair("b", 5);
		collection[2] = new EntryPair("c", 1);
		collection[3] = new EntryPair("d", 0);
		collection[4] = new EntryPair("e", 46);
		collection[5] = new EntryPair("f", 5);
		collection[6] = new EntryPair("g", 6);
		collection[7] = new EntryPair("h", 17);
		mbh.build(collection);
		printHeapCollection(collection);
		printHeap(mbh.getHeap(), mbh.size());
	}

	public static void printHeapCollection(EntryPair[] e) {
		// this will print the entirety of an array of entry pairs you will pass
		// to your build function.
		System.out.println("Printing Collection to pass in to build function:");
		for (int i = 0; i < e.length; i++) {
			System.out.print("(" + e[i].value + "," + e[i].priority + ")\t");
		}
		System.out.print("\n");
	}

	public static void printHeap(EntryPair[] e, int len) {
		// pass in mbh.getHeap(),mbh.size()... this method skips over unused 0th
		// index....
		System.out.println("Printing Heap");
		for (int i = 1; i < len + 1; i++) {
			System.out.print("(" + e[i].value + "," + e[i].priority + ")\t");
		}
		System.out.print("\n");
	}
}
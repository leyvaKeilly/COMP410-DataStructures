package MinBinHeap_A3;

public interface Heap_Interface {
	// ADT operations
	/*
	 * Interface: The BHEAP will provide this collection of operations:
	 * 
	 * insert in: an EntryPair object, containing the priority and string, assume no
	 * duplicate priorities will be inserted return: void
	 */
	void insert(EntryPair entry);

	/*
	 * delMin in: nothing return: void
	 */
	void delMin();

	/*
	 * getMin in:nothing return: an element (an EntryPair object)
	 */
	EntryPair getMin();

	/*
	 * size in:*nothing return:integer 0 or greater
	 */
	int size();

	/*
	 * build in: array of elements that need to* be in the heap return:void(assume
	 * for a build that the bheap will start*empty)
	 */
	void build(EntryPair[] entries);

	/* Used to test your entire Heap. */
	EntryPair[] getHeap();
}
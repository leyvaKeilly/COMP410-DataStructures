package MinBinHeap_A3;

public class MinBinHeap implements Heap_Interface {
	private EntryPair[] array; // load this array
	private int size;
	private static final int arraySize = 10000; // Everything in the array will initially
												// be null. This is ok! Just build out
												// from array[1]

	public MinBinHeap() {
		this.array = new EntryPair[arraySize];
		array[0] = new EntryPair(null, -100000); // 0th will be unused for simplicity
		size = 0; // of child/parent computations...
					// the book/animation page both do this.
	}

	// Please do not remove or modify this method! Used to test your entire Heap.
	@Override
	public EntryPair[] getHeap() {
		return this.array;
	}

	@Override
	public void insert(EntryPair entry) {
		if (entry == null) {
			System.out.println("The entry is null");
		}
		if (size < arraySize - 1) {
			bubbleHoleUp(entry);
			size++;
		} else {
			System.out.println("The array is full");
		}
	}

	@Override
	public void delMin() {
		if (size == 0) {
			System.out.println("The array is empty");
		} else if (size == 1) {
			array[1] = null;
			size--;
		} else {
			array[1] = null;
			EntryPair lastElemt = array[size];
			bubbleHoleDown(lastElemt);
			size--;
		}
	}

	@Override
	public EntryPair getMin() {
		if (size == 0) {
			return null;
		}
		return array[1];
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void build(EntryPair[] entries) {
		if (entries == null) {
			System.out.println("The entry array is null");
		}
		if (entries.length <= arraySize - 1) {
			for (int i = 1; i <= entries.length; i++) {
				array[i] = entries[i - 1];
				size++;
			}
			int index = getParentIndex(size);
			EntryPair elemt = array[index];
			while (index > 0) {
				bubbleBuildDown(elemt, index);
				index = index - 1;
				elemt = array[index];
			}
		} else {
			System.out.println("The entry array is too big");
		}
	}

	private int getLeftChildIndex(int parentIndex) {
		return parentIndex * 2;
	}

	private int getRightChildIndex(int parentIndex) {
		return (parentIndex * 2) + 1;
	}

	private int getParentIndex(int childIndex) {
		return (int) (childIndex / 2);
	}

	private void bubbleHoleUp(EntryPair entry) {
		int index = size + 1;
		while ((getParentIndex(index) > 0) && (array[getParentIndex(index)].getPriority() > entry.getPriority())) {
			array[index] = array[getParentIndex(index)];
			index = getParentIndex(index);
		}
		array[index] = entry;
	}

	private void bubbleHoleDown(EntryPair lastElemt) {
		int index = 1;
		while (getLeftChildIndex(index) < size) {
			int indexToGo = getLeftChildIndex(index);
			if ((getRightChildIndex(index) < size) && (array[getRightChildIndex(index)]
					.getPriority() < array[getLeftChildIndex(index)].getPriority())) {
				indexToGo = getRightChildIndex(index);
			}
			if (lastElemt.getPriority() > array[indexToGo].getPriority()) {
				array[index] = array[indexToGo];
				index = indexToGo;
			} else {
				break;
			}
		}
		array[index] = lastElemt;
	}

	private void bubbleBuildDown(EntryPair elemt, int index) {
		int indexToGo = getLeftChildIndex(index);
		if ((getRightChildIndex(index) <= size)
				&& (array[getRightChildIndex(index)].getPriority() < array[getLeftChildIndex(index)].getPriority())) {
			indexToGo = getRightChildIndex(index);
		}
		if (elemt.getPriority() > array[indexToGo].getPriority()) {
			array[index] = array[indexToGo];
			array[indexToGo] = elemt;
			if (getLeftChildIndex(indexToGo) <= size) {
				bubbleBuildDown(array[indexToGo], indexToGo);
			}
		}
	}
}
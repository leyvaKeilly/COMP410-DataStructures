package LinkedList_A1;

public class LinkedListImpl implements LIST_Interface {
	Node sentinel; // this will be the entry point to your linked list (the head)
	Node tailSentinel;
	private int size;

	public LinkedListImpl() {// this constructor is needed for testing purposes. Please don't modify!
		sentinel = new Node(0); // Note that the root's data is not a true part of your data set!
		size = 0;
	}

	// implement all methods in interface, and include the getRoot method we made
	// for testing purposes. Feel free to implement private helper methods!

	public Node getRoot() { // leave this method as is, used by the grader to grab your linkedList easily.
		return sentinel;
	}

	public boolean insert(double elt, int index) {
		if ((index >= 0) && (index <= size)) {
			if (sentinel.next == null) {
				Node newNode = new Node(elt);
				sentinel.next = newNode;
				newNode.prev = sentinel; 
				sentinel.prev = newNode;
				newNode.next = sentinel; 
			} else if (index == 0) {
				insertAtStart(elt);
			} else if (index == size) {
				insertAtEnd(elt);
			} else {
				Node newNode = new Node(elt);
				if (index <= size() / 2) {
					Node n = sentinel;
					for (int i = 0; i <= index - 1; i++) {
						n = n.next;
					}
					newNode.next = n.next;
					n.next.prev = newNode;
					n.next = newNode;
					newNode.prev = n;
				}
				if (index > size() / 2) {
					Node n = sentinel;
					for (int i = size() - 1; i > index - 1; i--) {
						n = n.prev;
					}
					newNode.prev = n.prev;
					n.prev.next = newNode;
					n.prev = newNode;
					newNode.next = n;
				}
			}
			size++;
			return true;
		} else {
			return false;
		}
	}

	private void insertAtStart(double elt) {
		Node newNode = new Node(elt);
		newNode.next = sentinel.next;
		sentinel.next.prev = newNode;
		sentinel.next = newNode;
		newNode.prev = sentinel;
	}

	private void insertAtEnd(double elt) {
		Node newNode = new Node(elt);
		newNode.prev = sentinel.prev;
		sentinel.prev.next = newNode;
		sentinel.prev = newNode;
		newNode.next = sentinel;
	}

	public boolean remove(int index) {
		if ((index >= 0) && (index < size)) {
			Node n;
			if (index <= (size() / 2)) {
				n = sentinel;
				for (int i = 0; i <= index; i++) {
					n = n.next;
				}
				n.prev.next = n.next;
				n.next.prev = n.prev;
			} else {
				n = sentinel;
				for (int i = size() - 1; i >= index; i--) {
					n = n.prev;
				}
				n.prev.next = n.next;
				n.next.prev = n.prev;
			}

			size--;
			return true;
		}
		return false;
	}

	public double get(int index) {
		if ((index >= 0) && (index < size)) {
			Node n;
			if (index <= (size() / 2)) {
				n = sentinel;
				for (int i = 0; i <= index; i++) {
					n = n.next;
				}
			} else {
				n = sentinel;
				for (int i = size() - 1; i >= index; i--) {
					n = n.prev;
				}
			}
			return n.data;
		}
		return Double.NaN;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public void clear() {
		sentinel = new Node(0);
		size = 0;
	}

}

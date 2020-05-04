package BST_A2;

public class BST implements BST_Interface {
	public BST_Node root;
	int size;

	public BST() {
		size = 0;
		root = null;
	}

	@Override
	// used for testing, please leave as is
	public BST_Node getRoot() {
		return root;
	}

	public boolean insert(String s) {
		if (s == null) {
			try {
				s.compareTo(null);
			} catch (NullPointerException e) {
				System.out.println("Cannot insert null pointer");
				return false;
			}
		}

		if (root == null) {
			BST_Node newNode = new BST_Node(s);
			root = newNode;
			size++;
			return true;
		} else {
			boolean isInserted;
			isInserted = root.insertNode(s);
			if (isInserted) {
				size++;
			}
			return isInserted;
		}
	}

	public boolean remove(String s) {
		if (s == null) {
			try {
				s.compareTo(null);
			} catch (NullPointerException e) {
				System.out.println("Cannot remove null pointer");
				return false;
			}
		}
		if (size() == 0) {
			return false;
		}
		if (s.compareTo(root.getData()) == 0) {
			removeRoot();
			size--;
			return true;
		} else {
			boolean isRemoved;
			isRemoved = root.removeNode(s);
			if (isRemoved) {
				size--;
			}
			return isRemoved;
		}
	}

	private void removeRoot() {

		if (root.getRight() != null) {
			root.getRight().findMin().left = root.getLeft();
			root = root.getRight();
		} else {
			root = root.getLeft();
		}
	}

	public String findMin() {
		if (size() == 0) {
			return null;
		}
		return root.findMin().getData();
	}

	public String findMax() {
		if (size() == 0) {
			return null;
		}
		return root.findMax().getData();
	}

	public boolean empty() {
		return size() == 0;
	}

	public boolean contains(String s) {
		if (s == null) {
			try {
				s.compareTo(null);
			} catch (NullPointerException e) {
				System.out.println("Cannot search for null pointer");
				return false;
			}
		}
		if (size() == 0) {
			return false;
		} else if (s.compareTo(root.getData()) == 0) {
			return true;
		} else {
			return root.containsNode(s);
		}
	}

	public int size() {
		return size;
	}

	public int height() {
		if (size() == 0) {
			return -1;
		}
		return root.getHeight();
	}
}
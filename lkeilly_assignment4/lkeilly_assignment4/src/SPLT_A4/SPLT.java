package SPLT_A4;

public class SPLT implements SPLT_Interface {
	private BST_Node root;
	private int size;

	public SPLT() {
		this.size = 0;
		root = null;
	}

	public BST_Node getRoot() { // please keep this in here! I need your root node to test your tree!
		return root;
	}

	@Override
	public void insert(String s) {
		if (s == null) {
			try {
				s.compareTo(null);
			} catch (NullPointerException e) {
				System.out.println("Cannot insert null pointer");
				return;
			}
		}
		if (empty()) {
			root = new BST_Node(s);
			size += 1;
			return;
		} else {
			root = root.insertNode(s);
			if (root.justMade()) {
				size += 1;
			}
			return;
		}
	}

	@Override
	public void remove(String s) {
		if (s == null) {
			try {
				s.compareTo(null);
			} catch (NullPointerException e) {
				System.out.println("Cannot remove null pointer");
				return;
			}
		}
		if (!contains(s)) {
			return;
		} else {
			if (size == 1) {
				root = null;
				size--;
				return;
			}
			if (root.left != null) {
				if (root.right != null) {
					BST_Node rightNode = root.getRight();
					root = root.left.findMax();
					root.right = rightNode;
					rightNode.par = root;
				} else {
					root = root.left;
					root.par = null;
				}

			} else {
				root = root.getRight();
				root.par = null;
			}
			size--;
			return;
		}
	}

	@Override
	public String findMin() {
		// TODO Auto-generated method stub
		if (empty()) {
			return null;
		} else {
			root = root.findMin();
			return root.data;
		}
	}

	@Override
	public String findMax() {
		// TODO Auto-generated method stub
		if (empty()) {
			return null;
		} else {
			root = root.findMax();
			return root.data;
		}
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean contains(String s) {
		if (s == null) {
			try {
				s.compareTo(null);
			} catch (NullPointerException e) {
				System.out.println("Cannot search for null pointer");
				return false;
			}
		}
		if (empty()) {
			return false;
		} else if (s.compareTo(root.data) == 0) {
			return true;
		} else {
			root = root.containsNode(s);
			if (s.compareTo(root.data) == 0) {
				return true;
			} else {
				return false;
			}
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public int height() {
		// TODO Auto-generated method stub
		if (empty()) {
			return -1;
		} else {
			return root.getHeight();
		}
	}
}

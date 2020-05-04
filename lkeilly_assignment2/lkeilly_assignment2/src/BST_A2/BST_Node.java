package BST_A2;

public class BST_Node {

	String data;
	BST_Node left;
	BST_Node right;

	BST_Node(String data) {
		this.data = data;
	}

	// --- used for testing ----------------------------------------------
	//
	// leave these 3 methods in, as is

	public String getData() {
		return data;
	}

	public BST_Node getLeft() {
		return left;
	}

	public BST_Node getRight() {
		return right;
	}

	// --- end used for testing -------------------------------------------

	// --- fill in these methods ------------------------------------------

	/*
	 * public boolean containsNode(String s){ return false; } public boolean
	 * insertNode(String s){ return false; } public boolean removeNode(String s){
	 * return false; } public BST_Node findMin(){ return left; } public BST_Node
	 * findMax(){ return right; } public int getHeight(){ return 0; }
	 */

	public boolean containsNode(String s) {
		if (s.compareTo(data) < 0) { // String s goes before String data
			if (left == null) {
				return false;
			} else {
				return left.containsNode(s);
			}
		} else if (s.compareTo(data) > 0) { // String data goes before String s
			if (right == null) {
				return false;
			} else {
				return right.containsNode(s);
			}
		} else {
			return true;
		}
	}

	public boolean insertNode(String s) {
		if (s.compareTo(data) == 0) {
			return false;
		} else if (s.compareTo(data) < 0) {
			if (left == null) {
				left = new BST_Node(s);
			} else {
				return left.insertNode(s);
			}
		} else {
			if (right == null) {
				right = new BST_Node(s);
			} else {
				return right.insertNode(s);
			}
		}
		return true;
	}

	public boolean removeNode(String s) {

		if (s.compareTo(data) > 0) {
			if (right == null) {
				return false;
			}
			if (s.compareTo(right.data) == 0) {
				if ((right.left == null) && (right.right == null)) {
					right = null;
				} else if (right.right == null) {
					right = right.left;
				} else if (right.left == null) {
					right = right.right;
				} else {
					right.right.findMin().left = right.left;
					right = right.right;
				}
			} else {
				return right.removeNode(s);
			}
		} else {
			if (left == null) {
				return false;
			}
			if (s.compareTo(left.data) == 0) {
				if ((left.left == null) && (left.right == null)) {
					left = null;
				} else if (left.right == null) {
					left = left.left;
				} else if (left.left == null) {
					left = left.right;
				} else {
					left.right.findMin().left = left.left;
					left = left.right;
				}
			} else {
				return left.removeNode(s);
			}
		}
		return true;

	}

	public BST_Node findMin() {
		if (left == null) {
			return this;
		} else {
			return left.findMin();
		}
	}

	public BST_Node findMax() {
		if (right == null) {
			return this;
		} else {
			return right.findMax();
		}
	}

	public int getHeight() {
		int counterLeft = -1;
		int counterRight = -1;
		int height;

		if (left != null) {
			counterLeft = left.getHeight();
		}
		if (right != null) {
			counterRight = right.getHeight();
		}
		height = (counterLeft > counterRight) ? counterLeft : counterRight;
		return height + 1;
	}

	// --- end fill in these methods --------------------------------------

	// --------------------------------------------------------------------
	// you may add any other methods you want to get the job done
	// --------------------------------------------------------------------

	public String toString() {
		return "Data: " + this.data + ", Left: " + ((this.left != null) ? left.data : "null") + ", Right: "
				+ ((this.right != null) ? right.data : "null");
	}

}

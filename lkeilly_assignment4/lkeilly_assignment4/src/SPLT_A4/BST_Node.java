package SPLT_A4;

public class BST_Node { // Splay BST Node class
	String data;
	BST_Node left;
	BST_Node right;
	BST_Node par; // parent...not necessarily required, but can be useful in splay tree
	boolean justMade; // could be helpful if you change some of the return types on your BST_Node
						// insert.
	// I personally use it to indicate to my SPLT insert whether or not we increment
	// size.

	BST_Node(String data) {
		this.data = data;
		this.justMade = true;
		this.par = null;
		this.left = null;
		this.right = null;
	}

	BST_Node(String data, BST_Node left, BST_Node right, BST_Node par) { // feel free to modify this constructor to suit
																			// your needs
		this.data = data;
		this.left = left;
		this.right = right;
		this.par = par;
		this.justMade = true;
	}

	// --- used for testing ----------------------------------------------
	//
	// leave these 3 methods in, as is (meaning also make sure they do in fact
	// return data,left,right respectively)

	public String getData() {
		return data;
	}

	public BST_Node getLeft() {
		return left;
	}

	public BST_Node getRight() {
		return right;
	}

	public boolean justMade() {
		return justMade;
	}

	public BST_Node containsNode(String s) { // it was me
		if (data.equals(s)) {
			return splay(this);
		}
		if (data.compareTo(s) > 0) {// s lexiconically less than data
			if (left == null) {
				return splay(this);
			}
			return left.containsNode(s);
		}
		if (data.compareTo(s) < 0) {
			if (right == null) {
				return splay(this);
			}
			return right.containsNode(s);
		}
		return null; // shouldn't hit
	}

	public BST_Node insertNode(String s) {
		if (data.compareTo(s) > 0) {
			if (left == null) {
				left = new BST_Node(s);
				left.par = this;
				return splay(left);
			}
			left.par = this;
			return left.insertNode(s);
		} else if (data.compareTo(s) < 0) {
			if (right == null) {
				right = new BST_Node(s);
				right.par = this;
				return splay(right);
			}
			right.par = this;
			return right.insertNode(s);
		} else { // we have a duplicate
			this.justMade = false;
			return splay(this);
		}
	}

	public BST_Node findMin() {
		if (left != null) {
			return left.findMin();
		}
		return splay(this);
	}

	public BST_Node findMax() {
		if (right != null) {
			return right.findMax();
		}
		return splay(this);
	}

	public int getHeight() {
		int l = 0;
		int r = 0;
		if (left != null)
			l += left.getHeight() + 1;
		if (right != null)
			r += right.getHeight() + 1;
		return Integer.max(l, r);
	}

	public String toString() {
		return "Data: " + this.data + ", Left: " + ((this.left != null) ? left.data : "null") + ",Right: "
				+ ((this.right != null) ? right.data : "null") + ", Parent: "
				+ ((this.par != null) ? par.data : "null");
	}

	private BST_Node splay(BST_Node node) {
		if (node.par != null) {
			if (node.par.par != null) {
				BST_Node grandpa = node.par.par;
				// checking for RR
				if ((grandpa.right != null) && (grandpa.right.data.compareTo(node.par.data) == 0)) { // Node parent is
																										// the right
																										// child of the
																										// grandparent
																										// node
					if ((node.par.right != null) && (node.par.right.data.compareTo(node.data) == 0)) { // Node is the
																										// right child
						rotateCC(node.par);
						rotateCC(node);
						return splay(node);
					} else { // RL case; node parent is the right of grandpa, and node is left of parent
						rotateC(node);
						rotateCC(node);
						return splay(node);
					}
				} else { // node parent is the left child of the grandpa node
					// checking for LL
					if ((node.par.left != null) && (node.par.left.data.compareTo(node.data) == 0)) { // Node is the left
																										// child
						rotateC(node.par);
						rotateC(node);
						return splay(node);
					} else { // LR case; node parent left of grandpa and node is right of parent
						rotateCC(node);
						rotateC(node);
						return splay(node);
					}
				}
			} else if (node.par != null) {
				if ((node.par.right != null) && (node.par.right.data.compareTo(node.data) == 0)) { // Node is the right
																									// child
					rotateCC(node);
					return node;
				} else { // Node is left child
					rotateC(node);
					return node;
				}
			}
		}
		return node;
	}

	private void rotateCC(BST_Node node) { // Node is the right child, rotate left or counterclockwise
		node.par.right = node.getLeft();
		if (node.left != null) {
			node.left.par = node.par;
		}
		node.left = node.par;
		if (node.par.par != null) {
			BST_Node grandpa = node.par.par;
			if ((grandpa.right != null) && (grandpa.right.data.compareTo(node.par.data) == 0)) {
				grandpa.right = node;
				node.par.par = node;
				node.par = grandpa;
			} else {
				grandpa.left = node;
				node.par.par = node;
				node.par = grandpa;
			}
		} else {
			node.par.par = node;
			node.par = null;
		}
	}

	private void rotateC(BST_Node node) { // Node is left child, rotate right or clockwise
		node.par.left = node.getRight();
		if (node.right != null) {
			node.right.par = node.par;
		}
		node.right = node.par;
		if (node.par.par != null) {
			BST_Node grandpa = node.par.par;
			if ((grandpa.right != null) && (grandpa.right.data.compareTo(node.par.data) == 0)) {
				grandpa.right = node;
				node.par.par = node;
				node.par = grandpa;
			} else {
				grandpa.left = node;
				node.par.par = node;
				node.par = grandpa;
			}
		} else {
			node.par.par = node;
			node.par = null;
		}
	}
}

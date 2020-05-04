package SPLT_A4;

public class SPLT_Playground {
	public static void main(String[] args) {
		// genTest();
		// insertAndContainsTests();
		// findMinAndMaxTest();
		// removeTest();
		//strangerThings();
	}

	public static void strangerThings() {
		SPLT tree = new SPLT();
		tree.insert("B");
		tree.insert(null);
		System.out.println("size is " + tree.size());
		System.out.println("height is " + tree.height());
		printLevelOrder(tree);
		printInOrder(tree.getRoot());
		System.out.println("");
		tree.insert("A");
		System.out.println("size is " + tree.size());
		System.out.println("height is " + tree.height());
		printLevelOrder(tree);
		printInOrder(tree.getRoot());
		System.out.println("");
		tree.remove(null);
		System.out.println("size is " + tree.size());
		System.out.println("height is " + tree.height());
		printLevelOrder(tree);
		printInOrder(tree.getRoot());
		System.out.println("");
		tree.remove("B");
		System.out.println("size is " + tree.size());
		System.out.println("height is " + tree.height());
		printLevelOrder(tree);
		printInOrder(tree.getRoot());
		System.out.println("");

		SPLT tree2 = new SPLT();
		tree2.insert("B");
		tree2.insert("A");
		tree2.insert("D");
		tree2.insert("C");
		System.out.println("contains null: " + tree2.contains(null));
		System.out.println("size is " + tree2.size());
		System.out.println("height is " + tree2.height());
		printLevelOrder(tree2);
		printInOrder(tree2.getRoot());
		System.out.println("");
		System.out.println("contains C: " + tree2.contains("C"));
		System.out.println("size is " + tree2.size());
		System.out.println("height is " + tree2.height());
		printLevelOrder(tree2);
		printInOrder(tree2.getRoot());
		System.out.println("");
		System.out.println("contains A: " + tree2.contains("A"));
		System.out.println("size is " + tree2.size());
		System.out.println("height is " + tree2.height());
		printLevelOrder(tree2);
		printInOrder(tree2.getRoot());
		System.out.println("");
	}

	public static void removeTest() {
		SPLT tree = new SPLT();
		tree.insert("B");
		tree.insert("C");
		tree.insert("D");
		tree.insert("A");
		tree.insert("E");
		tree.insert("F");
		tree.remove("BI");
		System.out.println("size is " + tree.size());
		System.out.println("height is " + tree.height());
		printLevelOrder(tree);
		printInOrder(tree.getRoot());
		System.out.println("");
		tree.remove("A");
		System.out.println("size is " + tree.size());
		System.out.println("height is " + tree.height());
		printLevelOrder(tree);
		printInOrder(tree.getRoot());
		System.out.println("");
		tree.remove("C");
		System.out.println("size is " + tree.size());
		System.out.println("height is " + tree.height());
		printLevelOrder(tree);
		printInOrder(tree.getRoot());
		System.out.println("");

		SPLT tree2 = new SPLT();
		tree2.insert("B");
		tree2.insert("A");
		tree2.insert("C");
		System.out.println("size is " + tree2.size());
		System.out.println("height is " + tree2.height());
		printLevelOrder(tree2);
		printInOrder(tree2.getRoot());
		System.out.println("");
		tree2.remove("C");
		System.out.println("size is " + tree2.size());
		System.out.println("height is " + tree2.height());
		printLevelOrder(tree2);
		printInOrder(tree2.getRoot());
		System.out.println("");
	}

	public static void findMinAndMaxTest() {
		SPLT tree = new SPLT();
		System.out.println("Min: " + tree.findMin());
		System.out.println("Max: " + tree.findMax());
		tree.insert("B");
		tree.insert("A");
		tree.insert("D");
		tree.insert("C");
		tree.insert("E");
		tree.insert("0");
		System.out.println("size is " + tree.size());
		System.out.println("height is " + tree.height());
		printLevelOrder(tree);
		printInOrder(tree.getRoot());
		System.out.println("");
		System.out.println("Min: " + tree.findMin());
		System.out.println("size is " + tree.size());
		System.out.println("height is " + tree.height());
		printLevelOrder(tree);
		printInOrder(tree.getRoot());
		System.out.println("");
		System.out.println("Max: " + tree.findMax());
		System.out.println("size is " + tree.size());
		System.out.println("height is " + tree.height());
		printLevelOrder(tree);
		printInOrder(tree.getRoot());
		System.out.println("");
	}

	public static void insertAndContainsTests() {
		SPLT tree = new SPLT();
		tree.insert("B");
		tree.insert("A");
		tree.insert("D");
		tree.insert("C");
		tree.insert("E");
		tree.insert("0");
		System.out.println("size is " + tree.size());
		System.out.println("height is " + tree.height());
		printLevelOrder(tree);
		printInOrder(tree.getRoot());
		System.out.println("");

		SPLT tree2 = new SPLT();
		tree2.insert("E");
		tree2.insert("C");
		tree2.insert("F");
		tree2.insert("B");
		tree2.insert("D");
		System.out.println("size is " + tree2.size());
		System.out.println("height is " + tree2.height());
		printLevelOrder(tree2);
		printInOrder(tree2.getRoot());
		System.out.println("");

		SPLT tree3 = new SPLT();
		tree3.insert("A");
		tree3.insert("B");
		tree3.insert("C");
		System.out.println("size is " + tree3.size());
		System.out.println("height is " + tree3.height());
		printLevelOrder(tree3);
		printInOrder(tree3.getRoot());
		System.out.println("");
		tree3.insert("A");
		System.out.println("size is " + tree3.size());
		System.out.println("height is " + tree3.height());
		printLevelOrder(tree3);
		printInOrder(tree3.getRoot());
		System.out.println("");

		SPLT tree4 = new SPLT();
		tree4.insert("B");
		tree4.insert("A");
		tree4.insert("D");
		tree4.insert("C");
		tree4.insert("E");
		System.out.println("size is " + tree4.size());
		System.out.println("height is " + tree4.height());
		printLevelOrder(tree4);
		printInOrder(tree4.getRoot());
		System.out.println("");
		System.out.println("contains D: " + tree4.contains("D"));
		System.out.println("size is " + tree4.size());
		System.out.println("height is " + tree4.height());
		printLevelOrder(tree4);
		printInOrder(tree4.getRoot());
		System.out.println("");
		System.out.println("contains F: " + tree4.contains("F"));
		System.out.println("size is " + tree4.size());
		System.out.println("height is " + tree4.height());
		printLevelOrder(tree4);
		printInOrder(tree4.getRoot());
		System.out.println("");
		System.out.println("contains C: " + tree4.contains("C"));
		System.out.println("size is " + tree4.size());
		System.out.println("height is " + tree4.height());
		printLevelOrder(tree4);
		printInOrder(tree4.getRoot());
		System.out.println("");
		System.out.println("contains B: " + tree4.contains("B"));
		System.out.println("size is " + tree4.size());
		System.out.println("height is " + tree4.height());
		printLevelOrder(tree4);
		printInOrder(tree4.getRoot());
		System.out.println("");

		SPLT tree5 = new SPLT();
		tree5.insert("B");
		tree5.insert("C");
		System.out.println("size is " + tree5.size());
		System.out.println("height is " + tree5.height());
		printLevelOrder(tree5);
		printInOrder(tree5.getRoot());
		System.out.println("");
		System.out.println("contains A: " + tree5.contains("A"));
		System.out.println("size is " + tree5.size());
		System.out.println("height is " + tree5.height());
		printLevelOrder(tree5);
		printInOrder(tree5.getRoot());
		System.out.println("");

	}

	public static void genTest() {
		SPLT tree = new SPLT();
		tree.insert("hello");
		tree.insert("world");
		tree.insert("my");
		tree.insert("name");
		tree.insert("is");
		tree.insert("blank");
		tree.remove("hello");
		System.out.println("size is " + tree.size());

		printLevelOrder(tree);
		printInOrder(tree.getRoot());
	}

	static void printLevelOrder(SPLT tree) {
		// will print your current tree in Level-Order...Requires a correct height
		// method
		// https://en.wikipedia.org/wiki/Tree_traversal
		int h = tree.getRoot().getHeight();
		for (int i = 0; i <= h; i++) {
			System.out.print("Level " + i + ":");
			printGivenLevel(tree.getRoot(), i);
			System.out.println();
		}

	}

	static void printGivenLevel(BST_Node root, int level) {
		if (root == null)
			return;
		if (level == 0)
			System.out.print(root.data + " ");
		else if (level > 0) {
			printGivenLevel(root.left, level - 1);
			printGivenLevel(root.right, level - 1);
		}
	}

	static void printInOrder(BST_Node root) {
		if (root != null) {
			printInOrder(root.getLeft());
			System.out.print(root.getData() + " ");
			printInOrder(root.getRight());
		}
	}
}

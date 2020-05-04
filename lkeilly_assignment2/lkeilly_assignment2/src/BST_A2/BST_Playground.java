package BST_A2;

public class BST_Playground {

	public static void main(String[] args) {

		// containsTest0();
		// containsTest1();
		// emptyTest1();
		// heightTest();
		// insertAfterRemove();
		// removeTest();
		// sizeTest();
		

		// My tests
		// basicInsertAndContainsTests();
		// minMaxTests();
		// RemoveAndHeightTests();
		// nullTests();

	}

	static void containsTest0() {
		BST myTree = new BST();

		myTree.insert("B");
		myTree.insert("A");
		myTree.insert("D");
		myTree.insert("C");
		myTree.insert("E");
		System.out.println("Contains D?? " + myTree.contains("D"));

	}

	static void containsTest1() {
		BST myTree = new BST();

		myTree.insert("B");
		myTree.insert("A");
		myTree.insert("D");
		myTree.insert("C");
		myTree.insert("E");
		myTree.remove("D");
		System.out.println("Contains D?? " + myTree.contains("D"));
		System.out.println("Contains C?? " + myTree.contains("C"));
		System.out.println("Contains E?? " + myTree.contains("E"));

	}

	static void emptyTest1() {
		BST myTree = new BST();

		myTree.insert("B");
		myTree.insert("A");
		myTree.insert("D");
		myTree.insert("C");
		myTree.insert("E");
		myTree.remove("B");
		myTree.remove("A");
		myTree.remove("D");
		myTree.remove("C");
		myTree.remove("E");
		System.out.println("Contains D?? " + myTree.contains("D"));
		System.out.println("Contains C?? " + myTree.contains("C"));
		System.out.println("Contains E?? " + myTree.contains("E"));
		System.out.println("is Empty?? " + myTree.empty());
	}

	static void heightTest() {
		BST myTree = new BST();

		myTree.insert("B");
		myTree.insert("A");
		myTree.insert("D");
		myTree.insert("C");
		myTree.insert("F");
		myTree.insert("E");
		System.out.println("Height: " + myTree.height());
	}

	static void insertAfterRemove() {
		BST myTree = new BST();

		myTree.insert("B");
		myTree.insert("A");
		myTree.insert("D");
		myTree.insert("C");
		myTree.insert("E");
		myTree.remove("E");
		myTree.insert("F");
		myTree.insert("E");
		printInOrder(myTree.getRoot());
	}

	static void removeTest() {
		BST myTree = new BST();

		myTree.insert("0");
		myTree.insert("C");
		myTree.insert("A");
		myTree.insert("B");
		myTree.insert("E");
		myTree.insert("D");
		myTree.remove("C");
		printInOrder(myTree.getRoot());
		System.out.println("");
		myTree.remove("0");
		printInOrder(myTree.getRoot());
	}

	static void sizeTest() {
		BST myTree = new BST();

		System.out.println("Size: " + myTree.size());
		myTree.insert("A");
		myTree.insert("B");
		System.out.println("Size: " + myTree.size());
		myTree.remove("A");
		System.out.println("Size: " + myTree.size());
	}

	static void RemoveAndHeightTests() {

		BST myTree = new BST();

		System.out.println("delete mom: " + myTree.remove("mom"));
		System.out.println("Empty? " + myTree.empty());
		System.out.println("Height: " + myTree.height());
		System.out.println("Insert world: " + myTree.insert("world"));
		System.out.println("Height: " + myTree.height());
		System.out.println("Insert hello: " + myTree.insert("hello"));
		System.out.println("delete mom: " + myTree.remove("mom"));
		System.out.println("Insert World: " + myTree.insert("World"));
		System.out.println("Insert hillium: " + myTree.insert("hillium"));
		System.out.println("Insert wuu: " + myTree.insert("wuu"));
		System.out.println("delete hillium: " + myTree.remove("hillium"));
		System.out.println("Empty? " + myTree.empty());
		System.out.println("Size: " + myTree.size());
		printInOrder(myTree.root);
		System.out.println("");
		System.out.println("Height: " + myTree.height());
		System.out.println("Insert hillium: " + myTree.insert("hillium"));
		System.out.println("Insert hiall: " + myTree.insert("hiall"));
		System.out.println("Insert hizz: " + myTree.insert("hizz"));
		System.out.println("Size: " + myTree.size());
		System.out.println("Root: " + myTree.getRoot());
		printInOrder(myTree.root);
		System.out.println("");
		System.out.println("Height: " + myTree.height());
		System.out.println("delete hello: " + myTree.remove("hello"));
		printInOrder(myTree.root);
		System.out.println("");
		System.out.println("delete world: " + myTree.remove("world"));
		System.out.println("Size: " + myTree.size());
		System.out.println("Root: " + myTree.getRoot());
		printInOrder(myTree.root);
		System.out.println("");
		System.out.println("Height: " + myTree.height());
		System.out.println("Insert wza: " + myTree.insert("wza"));
		System.out.println("Insert wyc: " + myTree.insert("wyc"));
		System.out.println("Insert wzy: " + myTree.insert("wzy"));
		System.out.println("Insert wzb: " + myTree.insert("wzb"));
		System.out.println("Insert wyb: " + myTree.insert("wyb"));
		System.out.println("Insert wyz: " + myTree.insert("wyz"));
		System.out.println("Insert wzz: " + myTree.insert("wzz"));
		System.out.println("Size: " + myTree.size());
		printInOrder(myTree.root);
		System.out.println("");
		System.out.println("Height: " + myTree.height());
		System.out.println("delete wuu: " + myTree.remove("wuu"));
		System.out.println("Empty? " + myTree.empty());
		System.out.println("Size: " + myTree.size());
		System.out.println("Root: " + myTree.getRoot());
		System.out.println("In Order: ");
		printInOrder(myTree.root);
		System.out.println("");
		System.out.println("Min: " + myTree.findMin());
		System.out.println("Max: " + myTree.findMax());
		System.out.println("Height: " + myTree.height());
		System.out.println("Level Order: ");
		printLevelOrder(myTree);

	}

	static void minMaxTests() {

		BST myTree = new BST();

		System.out.println("Min: " + myTree.findMin());
		System.out.println("Max: " + myTree.findMax());
		System.out.println("Insert world: " + myTree.insert("world"));
		System.out.println("Min: " + myTree.findMin());
		System.out.println("Max: " + myTree.findMax());
		System.out.println("Insert world: " + myTree.insert("world"));
		System.out.println("Insert World: " + myTree.insert("World"));
		System.out.println("Insert hillium: " + myTree.insert("hillium"));
		System.out.println("Min: " + myTree.findMin());
		System.out.println("Max: " + myTree.findMax());
		System.out.println("Remove world: " + myTree.remove("world"));
		System.out.println("Min: " + myTree.findMin());
		System.out.println("Max: " + myTree.findMax());

	}

	static void basicInsertAndContainsTests() {

		BST myTree = new BST();

		System.out.println("Size: " + myTree.size());
		System.out.println("Contains Hello: " + myTree.contains("Hello"));
		System.out.println("Root: " + myTree.getRoot());
		System.out.println("Height: " + myTree.height());
		System.out.println("Insert world: " + myTree.insert("world"));
		System.out.println("Size: " + myTree.size());
		System.out.println("Contains world: " + myTree.contains("world"));
		System.out.println("Root: " + myTree.getRoot());
		System.out.println("Height: " + myTree.height());
		System.out.println("Insert hello: " + myTree.insert("hello"));
		System.out.println("Size: " + myTree.size());
		System.out.println("Contains Hello: " + myTree.contains("Hello"));
		System.out.println("Contains hello: " + myTree.contains("hello"));
		System.out.println("Root: " + myTree.getRoot());
		System.out.println("Height: " + myTree.height());
		System.out.println("Insert world: " + myTree.insert("world"));
		System.out.println("Size: " + myTree.size());
		System.out.println("Height: " + myTree.height());
		System.out.println("Insert World: " + myTree.insert("World"));
		System.out.println("Size: " + myTree.size());
		System.out.println("Insert hillium: " + myTree.insert("hillium"));
		System.out.println("Size: " + myTree.size());
		System.out.println("Contains hillium: " + myTree.contains("hillium"));
		System.out.println("Contains World: " + myTree.contains("World"));
		System.out.println("Root: " + myTree.getRoot());
		System.out.println("Height: " + myTree.height());
		System.out.println("Level Order: ");
		printLevelOrder(myTree);
		System.out.println("In order: ");
		printInOrder(myTree.getRoot());
	}
	
	static void nullTests(){
		BST myTree = new BST();

		System.out.println("Insert null: " + myTree.insert(null));
		System.out.println("Insert a number: " + myTree.insert("5"));
		System.out.println("Size: " + myTree.size());
		System.out.println("Contains Hello: " + myTree.contains("Hello"));
		System.out.println("Insert null: " + myTree.insert(null));
		System.out.println("Root: " + myTree.getRoot());
		System.out.println("Height: " + myTree.height());
		System.out.println("Insert world: " + myTree.insert("world"));
		System.out.println("Size: " + myTree.size());
		System.out.println("Root: " + myTree.getRoot());
		System.out.println("Height: " + myTree.height());
		System.out.println("Remove null: " + myTree.remove(null));
		System.out.println("Size: " + myTree.size());
		System.out.println("Root: " + myTree.getRoot());
		System.out.println("Height: " + myTree.height());
		System.out.println("Remove 5: " + myTree.remove("5"));
		System.out.println("Size: " + myTree.size());
		System.out.println("Root: " + myTree.getRoot());
		System.out.println("Height: " + myTree.height());
		System.out.println("Contains null: " + myTree.contains(null));
		System.out.println("Contains world: " + myTree.contains("world"));
	}

	static void printLevelOrder(BST tree) {
		// will print your current tree in Level-Order...
		// https://en.wikipedia.org/wiki/Tree_traversal
		int h = tree.getRoot().getHeight();
		for (int i = 0; i <= h; i++) {
			printGivenLevel(tree.getRoot(), i);
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
		// will print your current tree In-Order
		if (root != null) {
			printInOrder(root.getLeft());
			System.out.print(root.getData() + " ");
			printInOrder(root.getRight());
		}
	}

}

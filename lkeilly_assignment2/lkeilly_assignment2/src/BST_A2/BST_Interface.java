package BST_A2;

public interface BST_Interface {

	/*
	 * insert: in: a string (the element to be stored into the tree) return:
	 * boolean, return true if insert is successful, false otherwise effect: if the
	 * string is already in the tree, then there is no change to the tree state, and
	 * return false if the string is not already in the tree, then a new tree
	 * cell/node is created, the string put into it as data, the new node is linked
	 * into the tree at the proper place; size is incremented by 1, and return a
	 * true
	 */

	public boolean insert(String s);

	/*
	 * remove: in: a string (the element to be taken out of the tree) return:
	 * boolean, return true if the remove is successful, false otherwise this means
	 * return false if the tree size is 0 effect: if the element being looked for is
	 * in the tree, unlink the node containing it and return true (success); size
	 * decreases by one if the element being looked for is not in the tree, return
	 * false and make no change to the tree state
	 */

	public boolean remove(String s);

	/*
	 * findMin: in: none return: string, the element value from the tree that is
	 * smallest effect: no tree state change error: is tree size is 0, return null
	 */

	public String findMin();

	/*
	 * findMax: in: none return: string, the element value from the tree that is
	 * largest effect: no tree state change error: is tree size is 0, return null
	 */

	public String findMax();

	/*
	 * empty: in: nothing return: boolean, true if the tree has no elements in it,
	 * true if size is 0 return false otherwise effect: no change to tree state
	 */

	public boolean empty();

	/*
	 * contains: in: a string (the element to be searched for) return: boolean,
	 * return true if the string being looked for is in the tree; return false
	 * otherwise this means return false if tree size is 0 effect: no change to the
	 * state of the tree
	 */
	public boolean contains(String s);

	/*
	 * size: in: nothing return: number of elements stored in the tree effect: no
	 * change to tree state
	 */

	public int size();

	/*
	 * height: in: none return: integer, the length of the longest path in the tree
	 * from root to a leaf effect: no change in tree state error: return -1 is tree
	 * is empty (size is 0, root is null)
	 */

	public int height();

	/*
	 * getRoot: in: none return: a tree cell/node, the one that is the root of the
	 * entire tree means return a null if the tree is empty effect: no change to
	 * tree state
	 */

	public BST_Node getRoot();

}

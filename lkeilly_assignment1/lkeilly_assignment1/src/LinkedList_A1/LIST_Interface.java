package LinkedList_A1;

public interface LIST_Interface {
	/*
	 * insert in: a double (the data element), and an int (position index) return:
	 * boolean, return true if insert is successful, false otherwise effect: the
	 * list state will be altered so that the element is located at the specified
	 * index; the list has size bigger by one; all elements that were at the
	 * specified index or after have been moved down one slot error: if index is
	 * beyond list size range return false valid inserts take place either at a
	 * location where a list element already exists, or at the location that is one
	 * beyond the last element
	 */
	public boolean insert(double elt, int index);

	/*
	 * remove in: an int (the index of the element to take out of the list) return:
	 * boolean.. return true if the remove is successful, false otherwise effect:
	 * list state is altered in that the Node at the specified index is decoupled
	 * list size decreases by one errors: what if specified index is not in the
	 * list? return false
	 */
	public boolean remove(int index);

	/*
	 * get in: an int, the index of the element item to return return: double, the
	 * element stored at index, or Double.NaN effect: no change in state of the list
	 * error: what if index is not in the list? return Double.NaN
	 */
	public double get(int index);

	/*
	 * size: in: nothing return: number of elements stored in the list effect: no
	 * change to list state
	 */
	public int size();

	/*
	 * isEmpty: in: nothing return: boolean, true if the list has no elements in it,
	 * true is size is 0 effect: no change to list state
	 */
	public boolean isEmpty();

	/*
	 * clear: in: nothing return: void effect: list is left with size 0, no elements
	 * in it, consists of just the original root Node
	 */
	public void clear();

}

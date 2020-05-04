package LinkedList_A1;

public class LinkedListPlayground {

	public static void main(String[] args) {
		/*
		 * here you can instantiate your LinkedList and play around with it to check
		 * correctness. We've graciously also provided you a bit of extra test data for
		 * debugging. It doesn't matter what you have in here. We will not grade it.
		 * This is for your use in testing your implementation.
		 */
		
		//test1();
		//test2();
		//fullTest();
		//testInsert0();
		EverythingTest0();
		
		/* My tests		
		LinkedListImpl l = new LinkedListImpl();
		
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		l.insert(3, 0);
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		System.out.println(l.get(0));
		l.insert(5, 1);
		System.out.println(l.get(1));
		l.insert(6, 0);
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		l.insert(7, 3);
		l.insert(1, 2);
		System.out.println("Aki va la lista entera de size: " + l.size() + ", y esta empty?: " + l.isEmpty());
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		System.out.println(l.get(3));
		System.out.println(l.get(4));
				
		System.out.println("Insert: " + l.insert(1, -1));
		System.out.println("Insert: " + l.insert(1, 6));
		System.out.println(l.get(-1));
		System.out.println(l.get(6));
		
		System.out.println("Aki va la lista entera de size: " + l.size() + ", y esta empty?: " + l.isEmpty());
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		System.out.println(l.get(3));
		System.out.println(l.get(4));
		
		System.out.println(l.remove(1));
		System.out.println("Aki va la lista entera de size: " + l.size() + ", y esta empty?: " + l.isEmpty());
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		System.out.println(l.get(3));
		System.out.println(l.get(4));
		
		System.out.println(l.remove(6));
		System.out.println("Aki va la lista entera de size: " + l.size() + ", y esta empty?: " + l.isEmpty());
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		System.out.println(l.get(3));
		System.out.println(l.get(4));
				
		System.out.println(l.remove(0));
		System.out.println("Aki va la lista entera de size: " + l.size() + ", y esta empty?: " + l.isEmpty());
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		System.out.println(l.get(3));
		System.out.println(l.get(4));
		
		System.out.println(l.remove(2));
		System.out.println("Aki va la lista entera de size: " + l.size() + ", y esta empty?: " + l.isEmpty());
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		System.out.println(l.get(3));
		System.out.println(l.get(4));
		
		System.out.println("Insert: " + l.insert(6, 0));
		System.out.println("Insert: " + l.insert(7, 3));
		System.out.println("Insert: " + l.insert(1, 3));
		System.out.println("Insert: " + l.insert(1, -2));
		
		System.out.println("Aki va la lista entera de size: " + l.size() + ", y esta empty?: " + l.isEmpty());
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		System.out.println(l.get(3));
		System.out.println(l.get(4));
		
		
		System.out.println(l.remove(0));
		System.out.println(l.remove(3));
		System.out.println(l.remove(2));
		
		System.out.println("Aki va la lista entera de size: " + l.size() + ", y esta empty?: " + l.isEmpty());
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		System.out.println(l.get(3));
		System.out.println(l.get(4));
		
		System.out.println(l.remove(-10));
		System.out.println(l.remove(5));
		System.out.println(l.remove(1));
		
		System.out.println("Aki va la lista entera de size: " + l.size() + ", y esta empty?: " + l.isEmpty());
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		
		System.out.println(l.remove(0));
		System.out.println("Aki va la lista entera de size: " + l.size() + ", y esta empty?: " + l.isEmpty());
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		
		System.out.println("Insert: " + l.insert(6, 3));
		System.out.println("Insert: " + l.insert(7, 0));
		System.out.println("Aki va la lista entera de size: " + l.size() + ", y esta empty?: " + l.isEmpty());
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		
		System.out.println("Insert: " + l.insert(6, 0));
		System.out.println("Insert: " + l.insert(1, 2));
				
		System.out.println("Aki va la lista entera de size: " + l.size() + ", y esta empty?: " + l.isEmpty());
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		System.out.println(l.get(3));
		
		l.clear();
		System.out.println("Aki va la lista entera de size: " + l.size() + ", y esta empty?: " + l.isEmpty());
		System.out.println(l.get(0));
		System.out.println(l.get(1));
	
		System.out.println("Insert: " + l.insert(6, 0));
		System.out.println("Insert: " + l.insert(1, 2));
		System.out.println("Insert: " + l.insert(3, 0));
		System.out.println("Insert: " + l.insert(1, 2));
		System.out.println("Aki va la lista entera de size: " + l.size() + ", y esta empty?: " + l.isEmpty());
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		System.out.println(l.get(3));
		*/		
	}
	public static void testInsert0() {
		LinkedListImpl L = new LinkedListImpl();
		System.out.println(L.insert(3,0));
		System.out.println(L.insert(5,1));
		System.out.println(L.insert(6,2));
		System.out.println(L.insert(4,1));
		printList(L);
	}
	public static void  EverythingTest0() {
		LinkedListImpl L = new LinkedListImpl();
		System.out.println(L.insert(3,0));
		System.out.println(L.insert(2.0,1));
		System.out.println(L.insert(1.0,2));
		System.out.println(L.remove(0));
		L.clear();
		System.out.println(L.insert(3,0));
		System.out.println(L.insert(2,1));
		System.out.println(L.insert(1,0));
		System.out.println(L.remove(2));
        System.out.println(L.size());
        System.out.println(L.insert(3,0));
        System.out.println(L.insert(2.0,1));
        System.out.println(L.insert(1.0,2));
        System.out.println(L.remove(0));
        L.clear();
        System.out.println(L.insert(3,0));
        System.out.println(L.insert(2,1));
        System.out.println(L.insert(1,0));
        System.out.println(L.remove(2));
        printList(L);
        printBackwardList(L);
	}
	public static void fullTest() {
		LinkedListImpl L = new LinkedListImpl();
		printList(L);
		L.insert(0, 0);
		printList(L);
		L.insert(1, 0);
		printList(L);
		System.out.println(L.remove(0)); // true
		printList(L);
		System.out.println(L.remove(0)); //true
		printList(L);
		System.out.println(L.remove(0)); //false
		System.out.println(L.remove(0)); //false
		System.out.println(L.remove(0)); //false
		System.out.println (L.isEmpty());
		printList(L);		
	}

	public static void test1() {
		// example test cases
		LinkedListImpl L = new LinkedListImpl();
		System.out.println(L.isEmpty());
		printList(L);
		L.clear();
		System.out.println(L.isEmpty());
		printList(L);
		System.out.println(L.sentinel.toString());
		L.insert(3.3, 0);
		System.out.println(L.isEmpty());
		printList(L);
		System.out.println(L.sentinel.next.toString());
		L.insert(3.4, 0);
		L.insert(3.5, 0);
		L.insert(3.67, 1);
		L.insert(3.357, 0);
		L.insert(3.333, 4);
		System.out.println(L.size());
		printList(L);
		L.remove(3);
		System.out.println(L.size());
		printList(L);
		L.clear();
		L.insert(3.4, 0);
		L.insert(3.5, 0);
		L.insert(3.67, 1);
		L.insert(3.357, 0);
		L.insert(3.333, 3);
		L.remove(0);
		System.out.println(L.size());
		printList(L);
	}

	public static void test2() {
		// example test cases
		LinkedListImpl L = new LinkedListImpl();
		L.insert(3.4, 0);
		L.insert(3.5, 1);
		L.insert(3.67, 2);
		L.remove(0);
		System.out.println(L.size());
		printList(L);
	}

	public static void printList(LinkedListImpl L) {
		// note that this is a good example of how to iterate through your linked list
		// since we know how many elements are in the list we can use a for loop
		// and not worry about checking the next field to see if we hit the end sentinel
		Node curr = L.sentinel.next; // the first data node in the list is the one after sentinel.
		System.out.print("sentinel");
		for (int i = 0; i < L.size(); i++) {
			System.out.print(" --> " + curr.data);
			curr = curr.next;
		}
		System.out.println();
	}
	
	public static void printBackwardList(LinkedListImpl L) {
		Node curr = L.sentinel.prev;
		System.out.print("Sentinel");
		for (int i = L.size() - 1; i >= 0; i--) {
			System.out.print(" --> " + curr.data);
			curr = curr.prev;
		}
		System.out.println();
	}
}

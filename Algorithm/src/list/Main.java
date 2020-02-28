package list;

import list.ArrayList.Iterator;

public class Main {
	public static void main(String[] args) {
		ArrayList numbers = new ArrayList();
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		numbers.add(1, 15);
		numbers.addFirst(50);
		System.out.println(numbers);
		System.out.println(numbers.remove(1));
		System.out.println(numbers);

		Iterator it = numbers.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		LinkedList lList = new LinkedList();
		
	}
}

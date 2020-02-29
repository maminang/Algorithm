package queue;

public class Main {

	public static void main(String[] args) {
		GenericQueue<String> strQue = new GenericQueue<String>(5);

		strQue.enqueue("first");
		strQue.enqueue("second");
		strQue.enqueue("third");
		strQue.enqueue("fourth");
		strQue.enqueue("fifth");

		strQue.dump(); // [first, second, third, fourth, fifth]
		System.out.println(strQue.dequeue()); // first
		System.out.println(strQue.peek()); // second
		strQue.dump(); // [second, third, fourth, fifth]

		strQue.enqueue("sixth");

		System.out.println(strQue.indexOf("fourth")); // 2

		System.out.println(strQue.isFull()); // true
		System.out.println(strQue.isEmpty()); // false

		try {
			strQue.enqueue("seventh"); // QueueOverFlowException
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}

		strQue.dump(); // [second, third, fourth, fifth, sixth]

		strQue.clear();

		strQue.dump(); // []

		try {
			strQue.dequeue(); // EmptyQueueException
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}

		System.out.println(strQue.isFull()); // false
		System.out.println(strQue.isEmpty()); // true

		strQue.enqueue("eighth");

		System.out.println(strQue.isFull()); // false
		System.out.println(strQue.isEmpty()); // false

		System.out.println(strQue.indexOf("eighth")); // 0
	}

}

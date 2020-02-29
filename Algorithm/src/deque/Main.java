package deque;

public class Main {

	public static void main(String[] args) {
		GenericDeque<String> strDeq = new GenericDeque<String>(5);
		strDeq.addFront("가");
		strDeq.addFront("나");
		strDeq.addFront("다");
		strDeq.addFront("라");
		strDeq.addFront("마"); // 마, 라, 다, 나, 가

		try {
			strDeq.addRear("바"); // OverFlowDequeException
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(strDeq.pollFront()); // 마
		System.out.println(strDeq.pollRear()); // 가

		strDeq.addRear("사"); // 라, 다, 나, 사
		strDeq.removeFront(); // 다, 나, 사
		strDeq.removeRear(); // 다, 나

		strDeq.addRear("아"); // 다, 나, 아
		strDeq.addFront("자"); // 자, 다, 나, 아

		System.out.println(strDeq.peekFront()); // 자
		System.out.println(strDeq.peekRear()); // 아
		System.out.println(strDeq.indexOf("나")); // 2
		System.out.println(strDeq.search(1)); // 다
		System.out.println(strDeq.capacity()); // 5
		System.out.println(strDeq.size()); // 4
		System.out.println(strDeq.isEmpty()); // false
		System.out.println(strDeq.isFull()); // false

		strDeq.addRear("차"); // 자, 다, 나, 아, 차

		System.out.println(strDeq.isEmpty()); // false
		System.out.println(strDeq.isFull()); // true

		strDeq.clear();

		System.out.println(strDeq.isEmpty()); // true
		System.out.println(strDeq.isFull()); // false

		try {
			strDeq.pollFront(); // EmptyQueueException
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		strDeq.addFront("카");
		strDeq.addFront("타");
		strDeq.addFront("파");
		strDeq.addFront("하");

		int size = strDeq.size();
		for (int i = 0; i < size; i++) {
			System.out.println(strDeq.pollFront()); // 하파타카
		}
	}
}

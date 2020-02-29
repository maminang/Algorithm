package deque;

public class Main {

	public static void main(String[] args) {
		GenericDeque<String> strDeq = new GenericDeque<String>(5);
		strDeq.addFront("��");
		strDeq.addFront("��");
		strDeq.addFront("��");
		strDeq.addFront("��");
		strDeq.addFront("��"); // ��, ��, ��, ��, ��

		try {
			strDeq.addRear("��"); // OverFlowDequeException
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(strDeq.pollFront()); // ��
		System.out.println(strDeq.pollRear()); // ��

		strDeq.addRear("��"); // ��, ��, ��, ��
		strDeq.removeFront(); // ��, ��, ��
		strDeq.removeRear(); // ��, ��

		strDeq.addRear("��"); // ��, ��, ��
		strDeq.addFront("��"); // ��, ��, ��, ��

		System.out.println(strDeq.peekFront()); // ��
		System.out.println(strDeq.peekRear()); // ��
		System.out.println(strDeq.indexOf("��")); // 2
		System.out.println(strDeq.search(1)); // ��
		System.out.println(strDeq.capacity()); // 5
		System.out.println(strDeq.size()); // 4
		System.out.println(strDeq.isEmpty()); // false
		System.out.println(strDeq.isFull()); // false

		strDeq.addRear("��"); // ��, ��, ��, ��, ��

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

		strDeq.addFront("ī");
		strDeq.addFront("Ÿ");
		strDeq.addFront("��");
		strDeq.addFront("��");

		int size = strDeq.size();
		for (int i = 0; i < size; i++) {
			System.out.println(strDeq.pollFront()); // ����Ÿī
		}
	}
}

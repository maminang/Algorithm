package programmers;

import java.util.Collections;
import java.util.LinkedList;

public class StackQue1 { // �ڵ� ������ ����
	public int solution(int[] priorities, int location) {
		
		int result = 0;

		LinkedList<Integer> ll = new LinkedList<Integer>();

		for (int importance : priorities) {
			ll.add(importance);
		}

		int print = 0;
		while (ll.size() > 1) {
			System.out.println(ll);
			System.out.println("location : " + location);

			int first = ll.poll();
			System.out.println("first : " + first);
			int max = Collections.max(ll);
			System.out.println("max : " + max);

			if (first < max) {
				System.out.println("�߿䵵�� ���� ���� ����");
				ll.add(first);
				if (location == 0) {
					location = ll.size();
				}
			} else {
				System.out.println("�μ�");
				print++;
				if (location == 0) {
					result = print;
				}
			}
			location--;
			System.out.println();
		}
		if (location == 0) {
			print++;
			result = print;
		}

		return result;
	}
}

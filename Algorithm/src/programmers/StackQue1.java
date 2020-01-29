package programmers;

import java.util.Collections;
import java.util.LinkedList;

public class StackQue1 { // 코드 더러움 ㅋㅋ
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
				System.out.println("중요도가 높은 문서 있음");
				ll.add(first);
				if (location == 0) {
					location = ll.size();
				}
			} else {
				System.out.println("인쇄");
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

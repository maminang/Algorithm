package programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BinarySearch1 {
	public static void main(String[] args) {
		int[] budgets = { 120, 110, 140, 150 };
		System.out.println(solution(budgets, 485));
	}

	public static int solution(int[] budgets, int M) {
		Arrays.sort(budgets);
		int left = 0;
		int right = budgets[budgets.length - 1];
		int mid = 0;
		Set<Integer> set = new HashSet<Integer>();
		if (check(budgets, M, right)) {
			mid = right;
		} else {
			while (true) {
				mid = (left + right) / 2;
				if (set.contains(mid)) {
					break;
				} else {
					set.add(mid);
				}
				if (check(budgets, M, mid)) {
					left = mid;
				} else {
					right = mid;
				}
			}
		}
		return mid;
	}

	public static boolean check(int[] budgets, int M, int mid) {
		long sum = 0;
		for (int i : budgets) {
			sum += i < mid ? i : mid;
		}
		return sum < M ? true : false;
	}
}

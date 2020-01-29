package backjoon;

import java.util.HashMap;
import java.util.Scanner;

public class FibonacciFuntion { // 1003
	static HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			if (n > 2) {
				System.out.println(fibonacci(n-2)+" "+fibonacci(n-1));
			} else {
				if (n == 0) {
					System.out.println(1+" "+0);
				} else if (n == 1) {
					System.out.println(0+" "+1);
				} else {
					System.out.println(1+" "+1);
				}
			}
		}
		sc.close();
	}

	public static int fibonacci(int n) {
		if (!memo.containsKey(n)) {
			if (n > 2) {
				memo.put(n, fibonacci(n - 1) + fibonacci(n - 2));
			} else {
				memo.put(n, n);
			}
		}
		return memo.get(n);
	}

}

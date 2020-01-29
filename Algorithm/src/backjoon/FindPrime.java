package backjoon;

import java.util.Scanner;

public class FindPrime { // 1978

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int cnt = 0;
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (check(sc.nextInt())) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

	private static boolean check(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}

package backjoon;

import java.util.Scanner;

public class ChocolateSplit { // 2163
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int m = sc.nextInt(), n = sc.nextInt();
		System.out.println((n - 1) + n * (m - 1));
	}

}

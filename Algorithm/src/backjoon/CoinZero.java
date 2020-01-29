package backjoon;

import java.util.Scanner;

public class CoinZero { //11047
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] coins = new int[n];
		for (int i = coins.length - 1; i > -1; i--) {
			coins[i] = sc.nextInt();
		}
		sc.close();

		System.out.println(zero(k, coins, 0));
	}

	public static int zero(int k, int[] coins, int min) {
		for (int coin : coins) {
			if (k >= coin) {
				int cnt = k/coin;
				return zero(k-coin*cnt, coins, min+cnt);
			}
		}
		return min;
	}
}

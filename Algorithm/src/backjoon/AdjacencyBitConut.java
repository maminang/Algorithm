package backjoon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class AdjacencyBitConut { // 2698
	// 메모이제이션으로 최적화
	// arr -> str로 변경후 key와 갯수 저장
	static Scanner sc = new Scanner(System.in);
	static int n, k, sum;
	static HashMap<String, Integer> memo = new HashMap<String, Integer>();

	public static void main(String[] args) {
		memo.put("0", 0);
		memo.put("1", 0);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			n = sc.nextInt();
			k = sc.nextInt();
			sum = 0;
			foo(new int[n], 0);
			System.out.println(sum);
		}
	}

	private static void foo(int[] arr, int idx) {
		if (idx == arr.length) {
			if (memo(arr) == k) {
				sum++;
			}
		} else {
			arr[idx] = 0;
			foo(arr, idx + 1);
			arr[idx] = 1;
			foo(arr, idx + 1);
		}
	}

	private static int memo(int[] arr) {
		String key = "";
		for (int i : arr) {
			key += i;
		}
		if (!memo.containsKey(key)) {
			int result = memo(Arrays.copyOfRange(arr, 0, arr.length - 1));
			if (arr[arr.length - 1] == 1 && arr[arr.length - 2] == 1) {
				memo.put(key, result + 1);
			} else {
				memo.put(key, result);
			}
		}
		return memo.get(key);
	}
}

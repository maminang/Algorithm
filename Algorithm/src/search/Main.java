package search;

import java.util.Arrays;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		int[] nums = new int[123456789];
		Random rand = new Random();
		for (int i = 0; i < nums.length; i++) {
			nums[i] = rand.nextInt(10000000);
		}
		Arrays.sort(nums);

		Search sc = new Search();

		int key = rand.nextInt(10000000);
		System.out.println("key : " + key);
		System.out.println();

		long start = System.currentTimeMillis();
		System.out.println("순차 탐색 시작");
		System.out.println("index : " + sc.linearSearch(nums, key));
		long end = System.currentTimeMillis();
		System.out.println("실행 시간 : " + (end - start));

		System.out.println();

		start = System.currentTimeMillis();
		System.out.println("이진 탐색 시작");
		System.out.println("index : " + sc.binarySearch(nums, key));
		end = System.currentTimeMillis();
		System.out.println("실행 시간 : " + (end - start));
	}
}

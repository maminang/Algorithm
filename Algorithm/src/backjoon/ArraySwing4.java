package backjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ArraySwing4 { //17406
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		StringTokenizer st = new StringTokenizer(line);
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		int k = Integer.valueOf(st.nextToken());

		int[][] array = new int[n][m];
		for (int i = 0; i < n; i++) {
			line = sc.nextLine();
			st = new StringTokenizer(line);

			int idx = 0;
			while (st.hasMoreElements()) {
				array[i][idx] = Integer.valueOf(st.nextToken());
				idx++;
			}
		}

		int[][] swings = new int[k][3];
		for (int i = 0; i < k; i++) {
			line = sc.nextLine();
			st = new StringTokenizer(line);

			int idx = 0;
			while (st.hasMoreElements()) {
				swings[i][idx] = Integer.valueOf(st.nextToken());
				idx++;
			}
		}
		sc.close();
	}

	public static int[][] swing(int[][] array, int[] swing) {
		// i 는 중심에서 벗어나는 거리
		// 2i+1 = 바뀌는 인덱스 한 줄
		// 
		for (int i = 1; i <= swing[2]; i++) {
		}

		return array;
	}
}

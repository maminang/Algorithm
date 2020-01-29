package backjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class IntTriangle { // 1932

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();

		int[][] tri = new int[n][n];
		for (int i = 0; i < n; i++) {
			String line = sc.nextLine();
			StringTokenizer st = new StringTokenizer(line);
			int cnt = st.countTokens();
			for (int j = 0; j < cnt; j++) {
				tri[i][j] = Integer.valueOf(st.nextToken());
			}
		}
		sc.close();
		
		bottomUp(tri, n-1);
		System.out.println(tri[0][0]);
	}

	public static void bottomUp(int[][] tri, int floor) {
		for (int i = 0; i < tri[floor].length-1; i++) {
			if (tri[floor][i] > tri[floor][i+1]) {
				tri[floor-1][i] += tri[floor][i];
			}else {
				tri[floor-1][i] += tri[floor][i+1];
			}
		}
		if (floor > 1) {
			bottomUp(tri, floor-1);
		}
	}
}

package backjoon;

import java.util.Scanner;

public class StairClimbing { // 2579
	static Scanner sc = new Scanner(System.in);
	static int[] stairs;
	static int[][] memo; // [][0] == 1 : �� ��� ����, [][1] : �ִ�����
	
	// ������ ��� ��ƾ� �ϴ� �ؿ��� �������½�����

	public static void main(String[] args) {
		stairs = new int[sc.nextInt()];
		for (int i = 0; i < stairs.length; i++) {
			stairs[i] = sc.nextInt();
		}
		
		memo = new int[stairs.length][2];
		
		memo[0][0] = 0;
		memo[0][1] = stairs[0];

	}

}

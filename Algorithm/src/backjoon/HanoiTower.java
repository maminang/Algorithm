package backjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class HanoiTower { // 11729
	static Scanner sc = new Scanner(System.in);
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) {
		int n = sc.nextInt();

		try {
			bw.write((int) Math.pow(2, n) - 1);
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static long move(int n, int from, int by, int to) { // n개의 원반을 from 장대에서 by 장대를 거쳐 to 장대로 옮기고 몇번 옮겼는지 반환
		long cnt = 0;
		if (n > 1) {
			cnt += move(n - 1, from, to, by); // n-1 개를 by에 옮기고
			cnt += move(1, from, by, to); // 맨밑에 있던 원반 하나를 to로 옮기고
			cnt += move(n - 1, by, from, to); // by에 있던 n-1개의 원반을 to로 옮긴다
		} else {
			try {
				bw.write((from + 1) + " " + (to + 1) + "\n");
				cnt++;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return cnt;
	}
}

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

		System.out.println(move(n, 0, 1, 2));
		try {
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static int move(int n, int from, int by, int to) { // n개의 원반을 from 장대에서 by 장대를 거쳐 to 장대로 cnt번 옮김
		int cnt = 0;
		if (n > 1) {
			cnt += move(n - 1, from, to, by);
			cnt += move(1, from, by, to);
			cnt += move(n - 1, by, from, to);
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

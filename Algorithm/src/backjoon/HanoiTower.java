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

	static long move(int n, int from, int by, int to) { // n���� ������ from ��뿡�� by ��븦 ���� to ���� �ű�� ��� �Ű���� ��ȯ
		long cnt = 0;
		if (n > 1) {
			cnt += move(n - 1, from, to, by); // n-1 ���� by�� �ű��
			cnt += move(1, from, by, to); // �ǹؿ� �ִ� ���� �ϳ��� to�� �ű��
			cnt += move(n - 1, by, from, to); // by�� �ִ� n-1���� ������ to�� �ű��
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

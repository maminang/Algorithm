package backjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class PrintStar10 {

	static Scanner sc = new Scanner(System.in);
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static String[][] pos;

	public static void main(String[] args) {
		while (true) {
			int n = sc.nextInt();
			pos = new String[n][n];
			for (String[] row : pos) {
				Arrays.fill(row, " ");
			}

			stars(log3(n), 0, 0);

			try {
				for (String[] row : pos) {
					for (String str : row) {
						bw.write(str);
					}
					bw.write("\n");
				}
				bw.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		}
	}

	public static void stars(int square, int y, int x) {
		if (square == 0) {
			pos[y][x] = "*";
		} else {
			square--;
			int n = (int) Math.pow(3, square);

			for (int i = 0; i < 3; i++) {
				stars(square, y, x + i * n);
			}

			stars(square, y + n, x);
			stars(square, y + n, x + 2 * n);

			for (int i = 0; i < 3; i++) {
				stars(square, y + 2 * n, x + i * n);
			}
		}
	}

	public static int log3(int n) {
		int exponent = 0;
		while (n >= 3) {
			n /= 3;
			exponent++;
		}
		return exponent;
	}
}

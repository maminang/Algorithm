package etc;

import java.util.HashMap;
import java.util.Scanner;

public class SudokuSolver {
	static int[][] sudoku = new int[9][9];
	static HashMap<Integer, int[]> blankMap = new HashMap<Integer, int[]>();

	public static void main(String[] args) {
		// 殮溘
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				sudoku[i][j] = sc.nextInt();
			}
		}
		sc.close();

		// 綴蘊 嬪纂 盪濰
		int key = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (sudoku[i][j] == 0) {
					blankMap.put(key++, new int[] { i, j });
				}
			}
		}
		// dfs
		solve(0);
	}

	private static void solve(int depth) {
		if (depth == blankMap.size()) {
			printSudoku();
			System.exit(0);
		} else {
			int x = blankMap.get(depth)[0];
			int y = blankMap.get(depth)[1];
			for (int i = 1; i < 10; i++) {
				if (isValid(x, y, i)) {
					sudoku[x][y] = i;
					solve(depth + 1);
					sudoku[x][y] = 0;
				}
			}
		}
	}

	private static boolean isValid(int x, int y, int i) {
		for (int n = 0; n < 9; n++) {
			if (sudoku[x][n] == i) { // 陛煎
				return false;
			} else if (sudoku[n][y] == i) { // 撮煎
				return false;
			} else if (sudoku[(x / 3) * 3 + n / 3][(y / 3) * 3 + n % 3] == i) { // 3*3蘊
				return false;
			}
		}
		return true;
	}

	private static void printSudoku() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (j > 0 && j % 3 == 0) {
					System.out.print("弛");
				}
				System.out.print(sudoku[i][j] + " ");
			}
			if (i % 3 == 2 && i < 8) {
				System.out.println();
				System.out.print("式式式式式式式式式式式式式式式式式式式");
			}
			System.out.println();
		}
	}
}

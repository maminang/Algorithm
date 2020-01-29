package backjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApartLease { // 5615
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		sc.close();

		int cnt = 0;
		for (Integer integer : list) {
			int x = 1;
			while (true) {
				int y = x;
				if (boom(x, y) > integer) {
					break;
				}
				while (true) {
					if (boom(x, y) > integer) {
						break;
					} else if (boom(x, y) == integer) {
						cnt++;
						break;
					}
					y++;
				}
				x++;
			}
		}

		System.out.println(list.size()-cnt);
	}

	public static int boom(int x, int y) {
		return 2 * x * y + x + y;
	}
}

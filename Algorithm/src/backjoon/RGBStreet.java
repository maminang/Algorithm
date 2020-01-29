package backjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class RGBStreet { // 1149

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		// 한줄에 r g b 가 나오고
		// 첫번째 줄은 첫번째 집의 r g b 가격
		
		// 풀긴풀었으나 날코딩 에바임 ;;
		List<Integer[]> rgbs = new ArrayList<Integer[]>();
		for (int i = 0; i < n; i++) {
			String line = sc.nextLine();
			StringTokenizer st = new StringTokenizer(line);
			Integer[] rgb = new Integer[3];
			for (int j = 0; j < rgb.length; j++) {
				rgb[j] = Integer.valueOf(st.nextToken());
			}
			rgbs.add(rgb);
		}
		sc.close();

		int price = 0;
		String beforeColor = "";
		for (Integer[] integers : rgbs) {
			if (price == 0) {
				int tmp = min(integers);
				beforeColor = colorPick(integers, tmp);
				price += tmp;
			} else {
				if (beforeColor.equals("r")) {
					Integer[] tmpArray = new Integer[2];
					tmpArray[0] = integers[1];
					tmpArray[1] = integers[2];
					int tmp = min(tmpArray);
					beforeColor = colorPick(tmpArray, tmp);
					price += tmp;
				}
				else if (beforeColor.equals("g")) {
					Integer[] tmpArray = new Integer[2];
					tmpArray[0] = integers[0];
					tmpArray[1] = integers[2];
					int tmp = min(tmpArray);
					beforeColor = colorPick(tmpArray, tmp);
					price += tmp;
				}
				else if (beforeColor.equals("b")) {
					Integer[] tmpArray = new Integer[2];
					tmpArray[0] = integers[0];
					tmpArray[1] = integers[1];
					int tmp = min(tmpArray);
					beforeColor = colorPick(tmpArray, tmp);
					price += tmp;
				}
			}
		}
		System.out.println(price);
	}

	private static int min(Integer[] rgb) {
		int value = rgb[0];
		for (int i = 1; i < rgb.length; i++) {
			value = value > rgb[i] ? rgb[i] : value;
		}
		return value;
	}

	private static String colorPick(Integer[] rgb, int value) {
		if (value == rgb[0]) {
			return "r";
		} else if (value == rgb[1]) {
			return "g";
		}
		return "b";
	}
}

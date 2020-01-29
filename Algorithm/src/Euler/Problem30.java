package Euler;

public class Problem30 {

	public static void main(String[] args) {
		int result = 0;
		for (int i = 2; i < 1000000; i++) {
			int sum = 0;
			int temp = i;
			while (temp != 0) {
				sum += Math.pow(temp % 10, 5);
				temp /= 10;
			}
			if (sum == i) {
				System.out.println(i);
				result += i;
			}
		}
		System.out.println(result);
	}

}

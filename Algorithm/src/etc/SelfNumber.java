package etc;

public class SelfNumber {
	public static void main(String[] args) {
		for (int i = 1; i <= 10000; i++) {
			if (isSelfNumber(i)) {
				System.out.println(i);
			}
		}

	}

	public static int d(int n) { // generator를 String 안 쓰고 하는법
		int generated = n;

		while (n != 0) {
			generated += n % 10;
			n /= 10;
		}

		return generated;
	}

	public static boolean isSelfNumber(int n) {
		for (int i = 0; i < n; i++) {
			if (d(i) == n) {
				return false;
			}
		}
		return true;
	}
}

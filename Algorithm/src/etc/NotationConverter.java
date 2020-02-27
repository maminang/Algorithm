package etc;

public class NotationConverter {
	public String convertInt(int target, int notation) {
		String result = "";
		String chars = "0123456789ABCDEFGHIJKLMOPQRSTUVWXYZ";
		while (target != 0) {
			result = chars.charAt(target % notation) + result;
			target /= notation;
		}
		return result;
	}
}

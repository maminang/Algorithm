package Search;

public class Search {
	public int linearSearch(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public int binarySearch(int[] array, int key) {
		int left = 0;
		int right = array.length;
		while (left < right) {
			int mid = (left + right) / 2;
			int temp = array[mid];
			if (temp == key) {
				while (array[mid - 1] == key) // 중복값이 있을경우 제일 앞의 인덱스를 반환
					mid--;
				return mid;
			} else if (temp < key) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}
}

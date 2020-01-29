package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ExhaustiveSearch1 {
	public int[] solution(int[] answers) {
		int supo1, supo2, supo3;
		int[] supo2Array = { 1, 3, 4, 5 };
		int[] supo3Array = { 3, 1, 2, 4, 5 };

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < answers.length; i++) {
			supo1 = i % 5 + 1;
			supo2 = i % 2 == 0 ? 2 : supo2Array[(i - 1) / 2 % 4];
			supo3 = supo3Array[i / 2];

			if (answers[i] == supo1) {
				hm.put(1, hm.getOrDefault(1, 0) + 1);
			}
			if (answers[i] == supo2) {
				hm.put(2, hm.getOrDefault(2, 0) + 1);
			}
			if (answers[i] == supo3) {
				hm.put(3, hm.getOrDefault(3, 0) + 1);
			}
		}
		int max = hm.values().stream().max(Integer::compare).orElse(-1);

		if (max == -1 || max == 0) {
			return new int[] { 1, 2, 3 };
		} else {
			ArrayList<Integer> list = new ArrayList<Integer>();
			// value == max이면 list에 저장
			hm.forEach((key, value) -> {
				if (value == max) {
					list.add(key);
				}
			});
			int[] result = new int[list.size()];
			int idx = 0;
			for (Integer integer : list) {
				result[idx++] = integer;
			}
			Arrays.sort(result);
			return result;
		}
	}
}

package programmers;

import java.util.HashMap;

public class Hash1 {
	/*
	 * participant�� ��ҵ��� Ű�� �ؽ��ʿ� �� ���� �� ���������� ������ ������ �����Ƿ� Ű�� �̸� ����� �ο���
	 * 
	 */
		public String solution(String[] participant, String[] completion) {
			String answer = "";
			HashMap<String, Integer> hm = new HashMap<String, Integer>();
			for (String string : participant) {
				hm.put(string, hm.getOrDefault(string, 0) + 1);
			}
			for (String string : completion) {
				hm.put(string, hm.get(string) - 1);
			}
			for (String key : hm.keySet()) {
				if (hm.get(key) != 0) {
					answer = key;
				}
			}
			
			return answer;
		}
}

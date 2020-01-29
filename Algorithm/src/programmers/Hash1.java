package programmers;

import java.util.HashMap;

public class Hash1 {
	/*
	 * participant의 요소들을 키로 해쉬맵에 다 넣음 단 동명이인이 있을수 있을수 있으므로 키는 이름 밸류는 인원수
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

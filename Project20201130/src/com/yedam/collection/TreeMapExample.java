package com.yedam.collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(87, "Hong");
		scores.put(98, "Hwang");
		scores.put(75, "Choi");
		scores.put(95, "Park");
		scores.put(80, "Kim");
		Set<Integer> set = scores.keySet();
		for (Integer num : set) { // 키 부분만 담아와서 새로운 set 컬렉션에 담아주겠다는 의미.
			System.out.println(num);
		}
		for (Map.Entry<Integer, String> ent : scores.entrySet()) { // 엔트리셋 키,밸류 둘 다 담겠다
			System.out.println(ent.getKey() + ent.getValue());
		}

		Map.Entry<Integer, String> ent = scores.firstEntry();
		ent.getKey();
		ent.getValue();

		ent = scores.lastEntry();
		ent.getKey();
		ent.getValue();

	}

}

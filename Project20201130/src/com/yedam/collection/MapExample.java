package com.yedam.collection;

import java.util.HashMap;
import java.util.Map; 
import java.util.Map.Entry; // 자바 유틸 맵 클래스 밑에 엔트리 클래스. 엔트리는 중첩 클래스다.
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap <String, Integer>(); // 앞: 키 뒤: 밸류
		map.put("Hong", 15);
		map.put("Hwang", 20);
		map.put("Hong", 25); // 같은-키 다른-밸류 값이 적히니까 밸류 값이 15에서 25로 덮어씌워짐
		
		Integer val = map.get("Hong");
		System.out.println(val); 
		System.out.println();
		
	    Set<String> set1 = map.keySet(); // 키 셋 - 키 값만 가져옴
	    for(String str : set1) {
	    	System.out.println("key: " + str + ", val: " + val );
	    }
	    System.out.println();
	    Set<Entry<String, Integer>> entryset1 = map.entrySet();
	    for (Entry<String, Integer> ent1 : entryset1) {
	    	System.out.println("key: " + ent1.getKey() + ", val: " + ent1.getValue());
	    	System.out.println("=============================================");
	    }
		
		
		Map<Integer, String> mapInt =  new HashMap<>();
		mapInt.put(10, "김다현");
		mapInt.put(20, "이혜빈");
		mapInt.put(30, "이나경");
		String result = mapInt.get(10);
		System.out.println(result);
		System.out.println();
		
		
		Set<Integer> set= mapInt.keySet();
		for(Integer num : set) {
			System.out.println("key: " + num + ", val: " + mapInt.get(num));
			System.out.println("=============================================");
		}
		Set<Entry<Integer, String>> entryset = mapInt.entrySet(); // 엔트리셋 - 키 값, 밸류까지 가져옴.
		for(Entry<Integer, String> ent : entryset) {
			System.out.println("key: " + ent.getKey() + ", val: " + ent.getValue());
		}
	}
 
}

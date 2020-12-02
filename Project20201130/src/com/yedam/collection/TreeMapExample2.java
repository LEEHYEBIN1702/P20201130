package com.yedam.collection;


import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapExample2 {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(87, "Hong");
		scores.put(98, "Hwang");
		scores.put(75, "Choi");
		scores.put(95, "Park");
		scores.put(80, "Kim");
		scores.firstEntry();
		System.out.println("scores 첫번째 :" + scores.firstEntry().getKey());
		
		NavigableMap <Integer, String> navigableMap = scores.descendingMap(); //새로 배우는 인스턴스 //내림차순 (역순) 
		System.out.println("navigableMap 첫번째 :" + navigableMap.firstEntry().getKey());
		
		NavigableSet<Integer> nSet = scores.descendingKeySet();
		System.out.println("score 첫번째 키 :" + scores.firstKey());
		System.out.println("nSet 첫번째 키 :" + nSet.first());
		
		// {34, 55, 26, 48, 77} 오름차순 정렬 결과 값을 구하는 코드 구현.
		int [] intAry = {34, 55, 26, 48, 77};
		TreeSet<Integer> tSet = new TreeSet<>();
		for (int i =0; i<intAry.length; i++) {
			tSet.add(intAry[i]);
		}
		for (int i =0; i<intAry.length; i++) {
			intAry[i] = tSet.pollFirst();
		}
		for (int i =0; i<intAry.length; i++) {
			System.out.println(intAry[i]);
		}
	}

}

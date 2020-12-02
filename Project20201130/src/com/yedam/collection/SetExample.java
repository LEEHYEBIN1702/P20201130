package com.yedam.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("World1");
		set.add("World2");
		set.add("Welcome");

//		for (String str : set) {
//			System.out.println(str); // 셋은 순서가 리스트와 달리 순서가 없이 출력됨
										// 중복된 값은 출력 안 됨
//		}
		Iterator<String> iter = set.iterator(); // 요소를 반복적으로 끄집어내기 위한 반복자 메소드
		while (iter.hasNext()) { // 요소 하나를 끄집어오는 메소드 값이 참이면 요소가 있다는 뜻.
//			String str = iter.next();
			System.out.println(iter.next());
			
		}
        
		Set<Integer> numbers = new HashSet<>();
		numbers.add(13);
		numbers.add(26);
		numbers.add(26);
		numbers.add(26);
		numbers.add(38);
		
		numbers.remove(26); // 리스트는 인덱스 값으로 지우고 셋은 오브젝트 값을 넣어서 지운다.
		
		int sum = 0;
		for(Integer i : numbers) {
			sum += i;
		}
		System.out.println("numbers: " + sum); // 중복된 값은 삭제하니까 값은 77
		
	}
}
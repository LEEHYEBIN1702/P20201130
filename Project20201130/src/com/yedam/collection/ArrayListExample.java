package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("World");
		list.add("Welcome");
		list.add(1, "Nice");
		System.out.println("size: " + list.size());
		list.add(list.size(), "last"); // 제일 마지막 위치에 last를 담겠다는 뜻.

		list.remove(1); // 인덱스 1위치의 값을 지우겠다.
		for (int i = 0; i < list.size(); i++) { // 리스트에선 렝스 아니고 사이즈.
			System.out.println("index:" + i + "," + list.get(i));
		}
		List<Integer> listNum = new ArrayList<>();
		listNum.add(100);
		listNum.add(200);
		listNum.add(300);

		int sum = 0;
		for (Integer num : listNum) {
			sum += num;

		}
		System.out.println("listNum합계: " + sum);
	}

}

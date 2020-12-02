package com.yedam.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample20201130 {
	public static void main(String[] args) {
		List<Integer> listNum = new ArrayList<>();
		listNum.add(10);
		listNum.add(15);
		listNum.add(20);
		listNum.add(25);
		listNum.add(30);
		listNum.add(35);
		listNum.add(40);
		listNum.add(20);
		listNum.add(25);
		
		int sum1 = 0;
		for (Integer num : listNum) {
			sum1 += num;

		}
		System.out.println("listNum합계: " + sum1);
		
		Set<Integer> numbers = new HashSet<>();
		numbers.add(10);
		numbers.add(15);
		numbers.add(20);
		numbers.add(25);
		numbers.add(30);
		numbers.add(35);
		numbers.add(40);
		numbers.add(20);
		numbers.add(25);
		
		int sum2 = 0;
		for (Integer num : numbers) {
			sum2 += num;
        }
		System.out.println("numbers: " + sum2);
	}

}

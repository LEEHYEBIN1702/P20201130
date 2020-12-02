package com.yedam.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class ArrayListExample2 {
	public static void main(String[] args) {
		
		System.out.println("Hello".length());
		System.out.println("HelloWorld".length());
		
		List<String> olist = new ArrayList();
		olist.add("Hello");
		
		for (Object str : olist) {
			String s = (String) str;
			System.out.println(s);
		}
		
		List<String> list = new ArrayList<String>();
		list.add(new String ("Hello"));
		list.add(new String ("World"));
		list.add("welcome"); // 스트링 클래스만 뉴 인스턴스 선언 안 하고 이렇게 바로 쓰기 가능
		
		
		list.get(1);
		
		for (int i =0; i<list.size(); i++) {
//			System.out.println(list.get(i));
		}
		for (String str : list) {
//			System.out.println(str);
		}
		
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("World");
		set.add("Hello");
		
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		for (String str: set) {
//			System.out.println(str);
		}
		System.out.println("=====================");
		Set<Fruit> fruits = new HashSet<>();
		fruits.add(new Fruit ("Apple", 1000));
		fruits.add(new Fruit ("Banana", 1500));
		fruits.add(new Fruit ("Orange", 1500));
		fruits.add(new Fruit ("abcde", 1000)); // 새로운 인스턴스를 선언한 거기 때문에 글자가 같아서 똑같아 보이지만
		                                       // 다 다른 값이기 때문에 애플 1000을 또 적어도 출력되는 것.
		
		Iterator <Fruit> fiter =fruits.iterator(); //반복자를 가져오는 메소드
		while (fiter.hasNext()) {
			Fruit fruit = fiter.next();
			System.out.println(fruit.getName() + "-" + fruit.getPrice());
		}
		
		System.out.println();
		System.out.println("Apple".length());
		System.out.println("Banana".length());
		System.out.println("Orange".length());
		
		System.out.println();
		
	}

}

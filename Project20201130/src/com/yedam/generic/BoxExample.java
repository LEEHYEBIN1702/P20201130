package com.yedam.generic;

import java.util.ArrayList;
import java.util.List;

class Apple {
	
}
public class BoxExample {
	public static void main(String[] args) {
//		Box box = new Box();
//		box.set("Hello");
//		String str = (String) box.get();// 오브젝트를 스트링으로 형변환
		
//		box.set(new Integer(10));
//		Integer num1 = (Integer) box.get();// 오브젝트를 인티저로 형변환
		
//		box.set(new Apple()); 
//		Apple apple = (Apple) box.get(); // 오브젝트는 어떤 유형이든 형변환 가능 
//		str= (String) box.get(); // 박스에 애플 인스턴스가 담겨있는데 스트링 타입을 담으려 하니까 오류가 남.
		
//		System.out.println("end");
		
		Box<String> box = new Box<String> ();//스트링 타입으로 쓰겠다고 선언함. // 이게 제너릭.
		String str = box.get();
		
		Box <Apple> apple = new Box<Apple> ();
		Apple app = apple.get();
		
		System.out.println("end");
		
		List<Integer> list = new ArrayList<>();
//		list.add("Hello");
		list.add(10); // 지정한 타입이 아니면 오류가 남.
		
		List<Apple> appList = new ArrayList<>();
		appList.add(new Apple());
		
	}

}

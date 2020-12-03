package com.yedam.functional;

import java.util.function.BiConsumer;
import java.util.function.Consumer; //컨슈머는 accept라는 추상메소드를 구현해야 한다. 자바 책 690p
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> consumer = null; // 어셉트 매개 값 하나

		consumer = t -> System.out.println("Hello" + t);

		consumer.accept("Hello");
		consumer.accept("Hawng");
		

		BiConsumer<String, Integer> biCon = null; // 어셉트 매개 값이 두개라는 뜻으로 바이컨슈머
		biCon = (t, u) -> System.out.println("이름은 " + t + ", 나이는" + u);

		biCon.accept("Hong", 15);
		
//		BiConsumer<String, Integer> biCon = null; // 어셉트 매개 값이 두개라는 뜻으로 바이컨슈머
//		biCon = new BiConsumer<String, Integer>() {

//			@Override
//			public void accept(String t, Integer u) {
//				System.out.println("이름은 " + t + ", 나이는" + u);

//			}

//		};
//		biCon.accept("Hong", 15);

		
		
		ObjIntConsumer<String> objIntCon = null; //객체 t와 int 값을 받아 소비.
		objIntCon = new ObjIntConsumer<String>() {

			@Override
			public void accept(String t, int value) {
			System.out.println("이름은 " + t + ", 점수는 " + value);
				
			}
			
		};
		objIntCon.accept("Hwang", 88);
	
	}

}

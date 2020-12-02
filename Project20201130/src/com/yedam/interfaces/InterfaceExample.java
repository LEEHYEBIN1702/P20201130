package com.yedam.interfaces;

interface Runnable {
	public void run();
}

class AutoRun implements Runnable {

	@Override
	public void run() {
		System.out.println("자동실행."); // 클래스 활용

	}

}

class NewRun implements Runnable {

	@Override
	public void run() {
		System.out.println("새로운 실행."); // 클래스 활용

	}

}

public class InterfaceExample {
	public static void main(String[] args) {
		Runnable runnable = new AutoRun();
		runnable.run();
		runnable = new NewRun();
		runnable.run();

		runnable = new Runnable() { // 익명 구현 개체를 이용해서 실현한 것. 

			@Override
			public void run() {
				System.out.println("익명 실행.");

			}

		};
		runnable.run();

		runnable = () ->  // 익명 구현 개체를 이용하면 할 때마다 클래스 선언(만들) 할 필요 없음
							// public void run()를 runnable = () -> 식으로도 줄일 수 있음
							// public void run() {}도 뺄 수 있음
							// 알 수 있는 내용들은 뺀다. 람다표현식. 
		                    // 굳이 클래스 선언 할 필요 없을 때 자주 사용.
			System.out.println("익명 실행.");

		
		runnable.run();
	}

}

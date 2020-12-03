package com.yedam.interfaces;

public class InterfaceExample4 {
	public static void main(String[] args) {
		MyInterface mi = null;
		// 매개 값의 합.
		mi = (a, b) ->  a+ b;
			
		
		int result = mi.run(10, 20);
		
		mi = (num1, num2) -> num1 * num2;
		result = mi.run(5, 10);
		
		//두 개의 변수 (직사각형의 가로, 세로) -> 넓이는 기능 구현.
		
		mi = (c, d) -> c * d;
		result = mi.run(8, 5);
		
		
		mi = new MyInterface() {
			public int run(int num1, int num2) {
				return (num1 * num2); // 리턴 구문도 구문이 하나 밖에 없기 때문에 생략 가능
			}
		};
		result = mi.run(8, 5);
		System.out.println("결과값: " + result);
	}

}

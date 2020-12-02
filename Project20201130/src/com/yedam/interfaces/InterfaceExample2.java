package com.yedam.interfaces;
// 함수적 인터페이스 (Functional Interface) == 람다 표현식.

interface Cal {
	public void multi(int num); // 추상메소드
	
}

interface Calculate {
	public void sum (int num1, int num2);
}

public class InterfaceExample2 { // 구현해야 할 (인터페이스 안의) 메소드가 하나 있을 때만 란다표현식 가능 //여러개 있으면 뭘 구현해야 할지 알 수 없어서 불가능
	public static void main(String[] args) {
		Calculate calcu =
         
			(int num1, int num2) -> {
				System.out.println(num1 + num2);
		};
		calcu.sum(3, 5);
		
		
		calcu = (a,b) -> {
			System.out.println(a*b);
		};
		calcu.sum(3, 5);
		
		
		
		Cal cal = (num) -> {
					int result = num * 2; // 매개변수 *2
					System.out.println(result);

				};
		cal.multi(3);
		
		
		cal = (a) -> {
			int result = a*a;
			System.out.println(result);
		};
		cal.multi(3);

	}

}

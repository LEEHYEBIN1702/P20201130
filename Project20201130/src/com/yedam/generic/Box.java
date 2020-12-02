package com.yedam.generic;

public class Box<T> { //박스 안에 대문자를 쓰면 선언 하고 사용하는 시점에 타입을 정해주겠다는 뜻.
	                  //타입 파라메타라고 부름
	
	 T obj; //오브젝트는 최상위 클래스 모든 타입을 다 담을 수 있다.
	void set(T obj) {
		this.obj = obj;
	
		
	}
	T get() {
		return obj;
	}

}

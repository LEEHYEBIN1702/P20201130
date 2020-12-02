package com.yedam.generic;

public class Util {
	
	public static <T,M> boolean compare(Pair<T, M> p1, Pair<T, M> p2) {
		boolean k = p1.getKind().equals(p2.getKind());
		boolean m = p1.getModel().equals(p2.getModel());
		
		return k && m;
	}
	public static <T> Box<T> boxing(T t) { //boxing에서 쓰이는 타입은 제너릭 타입입니다라는 의미로 박스 앞에 꺽쇠 티 달아줌
	    Box<T> box = new Box<T>();
	    box.set(t);
		return box;
	}

}

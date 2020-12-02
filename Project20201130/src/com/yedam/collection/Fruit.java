package com.yedam.collection;

public class Fruit {
	private String name;
	private int price;

	public Fruit() {

	}

	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() { //논리적으로 동일한 객체인지 확인해주는 메소드	 // 인트 타입이 리턴됨.
//		return super.hashCode();
//		return this.name.hashCode() + this.price;
		return this.name.length() + this.price;
 	}

	@Override
	public boolean equals(Object obj) { //논리적으로 동일한 객체인지 확인해주는 메소드
//		return super.equals(obj);         // 불린 타입이 리턴됨.
//		Object obj = > Fruit 클래스로 Casting
				Fruit fruit = (Fruit) obj;
				boolean b1 = this.name.length() == fruit.name.length();
				boolean b2 = this.price == fruit.price;
				return b1 && b2;
				
//				return this.name.equals(fruit.name) && this.price == fruit.price;

	}

}

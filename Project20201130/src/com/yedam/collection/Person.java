package com.yedam.collection;

public class Person extends Object {
	private String name;
    public Person (String name) {
    	this.name = name;
    }
    public String getName() {
    	return name;
    }
	@Override
	public int hashCode() {
		return this.name.hashCode(); //인스턴스마다 독특한 해시코드 값을 보여주는 메소드
	}
	@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		boolean result = this.name.equals(p.name);
		return result;
		
	}
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
    
}

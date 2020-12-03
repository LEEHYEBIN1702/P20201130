package com.yedam.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class FunctionalExample {
	public static List<Student> list = Arrays.asList(new Student("Hong", 90, 96), new Student("Hwang", 95, 93));

	public static void printString(Function<Student, String> func) { // 펑션이라는 기능을 넣었음. // 이름만 가져오게 코드를 짰음.
		for (Student student : list) { // 스튜던트 타입의 매개 값을 받으면 스트링 타입으로 보여줌
			System.out.println(func.apply(student));
		}
	}

	// Function<Student, Integer> func을 밑처럼 쓸 수도 있다.
	// 스튜던트 타입의 매개 값을 받으면 인트 타입으로 보여줌.
	public static void printInt(ToIntFunction<Student> func) {
		for (Student student : list) {
			System.out.println(func.applyAsInt(student));
		}

	}

	public static double avg(ToDoubleFunction<Student> func) { // 평균값 구하는 메소드
		double result = 0, sum = 0;

		for (Student student : list) {
			result = func.applyAsDouble(student);
			sum += result;
		}

		return sum / list.size();

	}

	public static void main(String[] args) { // 펑션의 추상 메소드는 apply. 객체 T를 R로 매핑. // 매개 값도 있고 반환 값도 있다.
		Function<String, Integer> func = null;
		func = new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {
				return t.length(); // 입력은 스트링타입 출력은 인티져타입
			}

		};
		System.out.println(func.apply("HelloWorld"));

		System.out.println("---------------------------------------------");
		BiFunction<String, String, Integer> biFunc = null; // 입력되는 스트링 값은 두개 출력되는 인티져 값은 하나.
		System.out.println("[학생이름-영어점수]");
		printString(t -> t.getName() + "-" + t.getEngScore());

		System.out.println("---------------------------------------------");
		System.out.println("[영어점수]");
		printInt(new ToIntFunction<Student>() {

			public int applyAsInt(Student value) {
				return value.getEngScore();
			}
		});
		System.out.println("---------------------------------------------");
		System.out.println("[합계점수]");
		printInt(t -> t.getEngScore() + t.getMathScore());

		System.out.println("---------------------------------------------");
		System.out.println("[영어평균]");
		double avg = avg(new ToDoubleFunction<Student>() {

			@Override
			public double applyAsDouble(Student value) {
				return value.getEngScore(); // int 타입을 -> double 타입으로 자동 형변환 해줌.
			}

		});
		System.out.println("result: " + avg);

	}

}

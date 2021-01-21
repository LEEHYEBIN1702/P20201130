package com.yedam.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample_Students {
	private static List<Students> list = Arrays.asList(new Students("홍길동", "남자", 90), new Students("김순희", "여자", 90),
			new Students("김자바", "남자", 95), new Students("박한나", "여자", 92));

	public static double avg(Predicate<Students> predicate) {
		int count = 0, sum = 0;
		for (Students student : list) {
			if (predicate.test(student)) {
				count++; // 몇 개가 참인지 모르기 때문에 뭘로 나누어 평균을 낼지 모름
							// 그러므로 카운트라는 변수를 선언해줌.
				sum += student.getScore(); // 참인 경우 sum 값에다가 getScore로 값을 넣어준다.

			}
		}
		return (double) sum / count;
	}

	public static void main(String[] args) {
		double maleAvg = avg(new Predicate<Students>() {

			public boolean test(Students t) {

				return t.getSex().equals("남자");
			}
		});
//			t -> t.getSex().equals("남자"));
//			System.out.println("남자 평균 점수: " + maleAvg);

		double femaleAvg = avg(t -> t.getSex().equals("여자"));
		System.out.println("여자 평균 점수: " + femaleAvg);
	}
}

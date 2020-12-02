package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		map.put(new Student(101, "윤태현"), 80);
		map.put(new Student(102, "정병기"), 90);
		map.put(new Student(201, "김종인"), 70);
		map.put(new Student(201, "김종인"), 80);
		map.put(new Student(103, "정병기"), 88);

		Set<Student> set = map.keySet();
		for (Student student : set) {
			System.out.println("학번: " + student.getStudentNo() + ", 이름: " + student.getStudentName() + ", 점수: "
					+ map.get(student));
		}
		int sum = 0;
		Set<Student> set1 = map.keySet();
		for (Student student : set1) {
			sum += map.get(student);
		}
		System.out.println("평균: " + sum/map.size());
		
		Set<Entry<Student, Integer>> entryset = map.entrySet(); // 엔트리셋 - 키 값, 밸류까지 가져옴.
		for(Entry<Student, Integer> ent : entryset) {
			System.out.println("key: " + ent.getKey().getStudentNo() + ", val: " + ent.getKey().getStudentName() + ", 점수: " +  ent.getValue());

	}
}
}
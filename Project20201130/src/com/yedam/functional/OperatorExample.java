package com.yedam.functional;

import java.util.function.IntBinaryOperator;

public class OperatorExample {

	static int[] scores = { 92, 95, 87, 80, 100, 34 };

	static int maxOrMin(IntBinaryOperator oper) { // 매개 값도 인트 반환 값도 인트
		int result = scores[0];
		for (int number : scores) {
			result = oper.applyAsInt(result, number);

		}
		return result;

	}

	public static void main(String[] args) {
		int maxValue = maxOrMin(new IntBinaryOperator() {
			@Override
			public int applyAsInt(int left, int right) { // 양쪽의 매개 값을 비교한 후 연산
				System.out.println("left: " + left + ", right: " + right); // 비교 과정을 볼 수 있음.
				return left > right ? left : right; // left 값이 right 값보다 크면 left 아니면 right 출력.
			}

		});

		System.out.println("제일 큰 값: " + maxValue);

		int minValue = maxOrMin(new IntBinaryOperator() {

			@Override
			public int applyAsInt(int left, int right) {
				System.out.println("left: " + left + ", right: " + right); 
				return left < right ? left : right;
			}

		});
		System.out.println("제일 작은 값: " + minValue);
	}
}
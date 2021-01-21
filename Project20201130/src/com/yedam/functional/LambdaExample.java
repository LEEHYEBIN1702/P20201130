package com.yedam.functional;

import java.util.function.IntBinaryOperator;

public class LambdaExample {
	private static int[] scores = { 10, 50, 3 };

	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);

		}
		return result;
	}

	public static void main(String[] args) {
		// 최대값 얻기
		int max = maxOrMin((left, right) -> {
			System.out.println("left: " + left + ", right: " + right);
			// int result = 0;
			// if (left>right) {
			// result =left;
			// }else {
			// result = right;
			// }
			// return result;
			return left > right ? left : right; // 왼쪽이 오른쪽보다 클 경우 왼쪽 출력 아닐 경우 오른쪽 출력

		});
		System.out.println("최대값: " + max);

		// 최소값 얻기
		int min = maxOrMin((left, right) -> {
			System.out.println("left: " + left + ", right: " + right);
			// int result = 0;
		    // if (left<right) {
			// result =left;
		    // }else {
		    // result = right;
			// }
			// return result;
			return left < right ? left : right;

		});
		System.out.println("최소값: " + min);
	}
}

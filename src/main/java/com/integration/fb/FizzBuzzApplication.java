package com.integration.fb;

import java.util.StringJoiner;

public class FizzBuzzApplication {

	public static String traverseNumbers(Integer number) {
		StringJoiner sb = new StringJoiner(",");

		for (int i = 1; i <= number; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				sb.add("Fizz Buzz");
			} else if (i % 3 == 0) {
				sb.add("Fizz");
			} else if (i % 5 == 0) {
				sb.add("Buzz");
			} else {
				sb.add(String.valueOf(i));
			}

		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(traverseNumbers(100));

	}

}

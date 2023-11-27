package com.javabasic.lesson3.homework;

public class Task2 {

	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		int c = 2;

		double result = (double) Math.abs(a - b) / Math.pow((a + b), 3) - Math.sqrt(c);

		System.out.println(result);

	}

}

package com.javabasic.lesson3.homework;

public class Task1 {

	public static void main(String[] args) {
		double spher1 = 1;
		double spher2 = 0.5;
		double spher3 = 0.2;

		double p = 0.7;

		double v1 = (double) 4 / 3 * Math.PI * Math.pow(spher1, 3);
		double v2 = (double) 4 / 3 * Math.PI * Math.pow(spher2, 3);
		double v3 = (double) 4 / 3 * Math.PI * Math.pow(spher3, 3);

		double m1 = (double) v1 * p;
		double m2 = (double) v2 * p;
		double m3 = (double) v3 * p;

		double result = m1 + m2 + m3;
		System.out.println(result);
	}

}

package com.javabasic.lesson3.classwork;

public class Task1 {

	public static void main(String[] args) {
		int steps = 10_000;
		int time = 12;
		float perHour = (float) steps / (time * 1000);
		System.out.println(perHour);

		int min = -50;
		int max = 50;
		int r = (int) (Math.random() * (max - min) + min);
		System.out.println(r);
	}

}

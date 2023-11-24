package com.javabasic.lesson2;

public class Task1 {

	public static void main(String[] args) {
		
		Integer a = 10;
		
		Integer b = 20;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		Integer c = a;
		
		a = b;
		
		b = c;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
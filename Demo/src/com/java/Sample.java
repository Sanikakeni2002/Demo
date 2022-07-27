package com.java;

public class Sample {
	static int num1 = 99;

	public static void main(String[] args) {

		method1();
		System.out.println("num1 is: " + Sample.num1);
		System.out.println("num");
	}

	public static void method1() {
		int num2 = 69;
		System.out.println("num2 is: " + (++num2));
	}
}

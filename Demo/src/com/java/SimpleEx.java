package com.java;

import java.util.Scanner;

public class SimpleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("The maximum no is ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a > b && a > c) {
			System.out.println("a is maximum: "+a);
		} else if (b > c && b > c) {
			System.out.println("b is maximum: "+b);
		} else {
			System.out.println("c is maximum: "+c);
		}
	}
}

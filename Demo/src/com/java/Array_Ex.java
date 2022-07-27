package com.java;

import java.util.Scanner;

public class Array_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no:");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println("Elements in my array");

	}
}

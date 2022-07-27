package com.java;

import java.util.Scanner;

public class Array_Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter number of elements in array: ");
		int n = s.nextInt();
		int num[] = new int[7];
		System.out.println("The array is:");
		for (int i = 0; i < 5; i++) {
			num[i] = s.nextInt();
		}
		for (int i = 0; i < 7; i++) {
			if (num[i] > 0) {
				System.out.println("Positive number " + num[i]);
			} else if (num[i] < 0) {
				System.out.println("Negative number " + num[i]);
			} else {
				System.out.println("Zero number " + num[i]);
			}
		}
	}

}

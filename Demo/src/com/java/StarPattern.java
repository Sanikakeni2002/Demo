package com.java;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Enter input: ");
		for (int i = 0; i < n; i++) {
			for (int j = i; j<n-i; j++) {
				System.out.println(" ");
			}
			for (int k=0; k <= i; k++) {
				System.out.println(" * ");
			}
		}
		System.out.println();
	}

}

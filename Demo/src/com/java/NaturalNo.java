package com.java;

import java.util.Scanner;

public class NaturalNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no.: ");
		int sum = 0;
		int num = sc.nextInt();
		for (int i = 1; i <=num; i++) {
			sum+=i;
			System.out.println("Sum of number is: "+ sum);
			
		}
	}
}




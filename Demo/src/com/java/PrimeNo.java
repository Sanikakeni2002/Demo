package com.java;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, count = 0;
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 0; i<=n; i++) {
			if (n % i == 0){
				count++;
			}
		}
		if (count==2)
			System.out.println(n+ "Prime Number");
		else
			System.out.println(n + "Not Prime Number");
	}
}

package com.java;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i, j,count=0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Enter number: ");
		for (i =2; i <=n; i++) {
			count=0;
			for (j =2; j <=i; j++) {
				if (i % j == 0)
					count++;
			}
		}
		if (count ==2)
			System.out.println(i+" ");
	}

}

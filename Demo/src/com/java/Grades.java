package com.java;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of student:");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int total = m1 + m2 + m3;
		int avg = total / 3;
		if (avg > 90 && avg < 100) {
			System.out.println("A+ Grade");
		} else if (avg > 70 && avg <= 80) {
			System.out.println("A Grade");
		} else if (avg > 60 && avg <= 70) {
			System.out.println("B+ Grade");
		} else if (avg > 50 && avg <= 60) {
			System.out.println("B Grade");
		} else if (avg > 40 && avg <= 30) {
			System.out.println("C Grade");
		} else {
			System.out.println("Your Failed!!!");
		}
		
	}
}

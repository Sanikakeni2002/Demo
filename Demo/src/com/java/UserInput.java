package com.java;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Your full name is: ");
		String name1 = sc.nextLine();
		System.out.println("Your full name is: " + name1);

		System.out.println("Your name: ");
		String name = sc.next();
		System.out.println("Your name is: " + name);

		System.out.println("Enter your roll no: ");
		int rollNo = sc.nextInt();
		System.out.println("Roll no is: " + rollNo);
	}

}

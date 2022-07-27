package com.java;

import java.util.Scanner;

public class ArrayLinear {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the search value: ");
		int array[] = { 10, 20, 25, 63, 96, 57 };
		int size = array.length;
		int value = input.nextInt();

		for (int i = 0; i < size - 1; i++) {
			if (array[i] == value) {
				System.out.println(value + " is present at location: " + i);
				break;
			}
		}
	}

}

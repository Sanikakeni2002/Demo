package com.java;

import java.util.Arrays;

public class ArrayCloning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 6, 7 };
		// int b[]=a.clone();
		// b[0]++;
		// int c[]= Arrays.copyOf(a,3);
		int b[] = Arrays.copyOfRange(a, 0, 3);
		{
			System.out.println("Contents of a[]");
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print("Contents of b[]");
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}

}

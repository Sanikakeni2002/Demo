package com.java;

public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((5 > 3) && (8 > 5));  // true
	    System.out.println((5 > 3) && (8 < 5));  // false
	    System.out.println((5 < 3) || (8 > 5));  // true
	    System.out.println((5 < 3) || (8 < 5));  // false
	    System.out.println(!(5 == 3));  // true
	    System.out.println(!(5 > 3));  // false
	}
}

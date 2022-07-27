package com.java;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "How are you";
		String[] arrOfStr = str.split(" ", 4);
		for (String a : arrOfStr) {
			System.out.println(a);
		}
	}

}

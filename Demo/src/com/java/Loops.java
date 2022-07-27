package com.java;

import java.util.Scanner;

public class Loops {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (x == y){
			System.out.println("x is greater: "+x);
		}
			else{
				System.out.println("y is greater: "+y);
			}
		}
	}

package com.java;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int num, temp, Sum = 0, res = 0, rem;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the Number: ");
			num = sc.nextInt();

			temp = num;
			while (num > 0) {
				num /= 10;
				Sum++;
			}

			num = temp;
			while (num > 0) {
				rem = num % 10;
				res = res + (int) Math.pow(rem,Sum);// temp+temp+(rem*rem*rem)
				num /= 10;
			}
			if (res == temp)
				System.out.println("\nArmstrong Number");
			else
				System.out.println("\nNot an Armstrong Number.");
		}
	}
}
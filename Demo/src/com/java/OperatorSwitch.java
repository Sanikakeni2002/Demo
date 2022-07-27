package com.java;

import java.util.Scanner;

public class OperatorSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true){
		Scanner sc = new Scanner(System.in);
		Scanner operation = new Scanner(System.in);
		
		double num1, num2 = 0, num3;
		char Operation;
		do{
		System.out.println("***Simple Calculator***");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Modulus");
		System.out.println("6. Power");
		System.out.println("7. Square");
		System.out.println("8. Square root");
		System.out.println("9.Exit");
		

		System.out.println("Enter the operation to perform: ");
		Operation = operation.next().charAt(0);

		switch (Operation)
		 {
	case '1':
			System.out.println("Enter first number:");
			num1 = sc.nextInt();
			System.out.println("Enter second number:");
			num2 = sc.nextInt();
		
			num3 = num1 + num2;
			System.out.println(num1 + "+" + num2 + "=" + num3  + " The addition operation performed successfully!");
			break;

		case '2':
			System.out.println("Enter first number:");
			num1 = sc.nextInt();
			System.out.println("Enter second number:");
			num2 = sc.nextInt();

			num3 = num1 - num2;
			System.out.println(num1 + "-" + num2 + "=" + num3 + " The subtraction operation performed successfully!");
			break;

		case '3':
			System.out.println("Enter first number:");
			num1 = sc.nextInt();
			System.out.println("Enter second number:");
			num2 = sc.nextInt();

			num3 = num1 * num2;
			System.out.println(
					num1 + "*" + num2 + "=" + num3 + " The multiplication operation performed successfully!");
			break;

		case '4':
			System.out.println("Enter first number:");
			num1 = sc.nextInt();
			System.out.println("Enter second number:");
			num2 = sc.nextInt();
			
			num3 = num1 / num2;
			System.out.println(num1 + "/" + num2 + "=" +num3 + "The division operation performed successfully!");
			break;

		case '5':
			System.out.println("Enter first number:");
			num1 = sc.nextInt();
			System.out.println("Enter second number:");
			num2 = sc.nextInt();

			num3 = num1 % num2;
			System.out.println(num1 + "%" + num2 + "=" + num3 + " The modulus operation performed successfully!");
			break;
			
		case'6':
			System.out.println("Enter first number:");
			num1 = sc.nextInt();
			System.out.println("Enter second number:");
			num2 = sc.nextInt();
			
			num3 = Math.pow(num1, num2);
			System.out.println(num1 + "pow" + num2 + "=" + num3 + " The power operation performed successfully!");
			break;
			
		case'7':
			System.out.println("Enter first number:");
			num1 = sc.nextInt();
			
			num3 = Math.pow(num1, 2);
			System.out.println(num1 + num3 + " The square operation performed successfully!");
			break;
			
		case'8':
			System.out.println("Enter first number:");
			num1 = sc.nextInt();
			
			num3 = Math.sqrt(num1);
			System.out.println(num1 + num3 + " The square root operation performed successfully!");
			break;
			
		case '9':
			System.exit(0);
			break;

		default:
			System.out.println("Invalid Operation!!!!!");
			break;
		 }
		}while(Operation!=9);
}
	}
}
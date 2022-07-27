package com.java;

import java.util.Scanner;

public class TwoDimension_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter no:");
int [][]num = new int[2][2];
for(int i=0; i<2; i++){
	for(int j=0; j<2; j++){
		num[i][j]=sc.nextInt();
	}
}
System.out.println("Matrix: ");
for(int i=0; i<2; i++){
	for(int j=0; j<2; j++){
		System.out.print(num[i][j]+" ");
	}
}System.out.println();
	}

}

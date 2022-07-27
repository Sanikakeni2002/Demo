package com.java;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=69;  
		int y=89;  
		int z=79;  
		int largestNumber= (x > y) ? (x > z ? x : z) : (y > z ? y : z);  
		System.out.println("The largest numbers is:  "+largestNumber);  
	}

}

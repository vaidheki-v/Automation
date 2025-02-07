


package com.JavaLearning;

import java.util.Scanner;

public class reverseTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		a program to print tables
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number whose table to be printed from number 1 to 10");
		int tableValue = input.nextInt();
		System.out.println("Printing the " + tableValue + " tables from number 1 to 10");
		for(int i=10; i>0;i--) {
			System.out.println(i + "*" + tableValue + "=" + tableValue*i);
		}
	}

}

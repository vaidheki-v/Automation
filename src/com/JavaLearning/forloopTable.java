package com.JavaLearning;

import java.util.Arrays;
import java.util.Scanner;

public class forloopTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		a program to print tables
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number whose table to be printed from number 1 to 10");
		int tableValue = input.nextInt();
		System.out.println("Printing the " + tableValue + " tables from number 1 to 10");
		for(int i=1; i<=10;i++) {
			System.out.println(i + "*" + tableValue + "=" + tableValue*i);
		}
		
		//for each loop
		String[] fruits = {"Apple","Orange","Banana","Guava","Blueberry"};
		System.out.println("Printing the fruits name using for loop..");
		for(int i=0; i<fruits.length;i++)
		{
			System.out.println(fruits[i]);
		}
		System.out.println("Printing the fruits name using for each loop..");
		for(String i: fruits)
		{
			System.out.println(i);
		}
		System.out.println("Printing the fruits name using arrays.toString method..");

		System.out.println(Arrays.toString(fruits));
	}

}

package com.JavaLearning;

import java.util.Scanner;
public class DoWhileLoopExample {

	public static void main(String[] args) {
		Scanner inputValue = new Scanner(System.in);
		// TODO Auto-generated method stub
//		Example 2: Sum of Positive Numbers Only
		int PositiveNumber = 0 , sumOfPositiveNumber = 0;
		do
		{
		sumOfPositiveNumber	+=PositiveNumber;
		System.out.println("Enter a positive number");
		PositiveNumber= inputValue.nextInt();
		}while(PositiveNumber>=0);
		inputValue.close();
		System.out.println("sum of the positive numbers are \t" + sumOfPositiveNumber);

	}
}

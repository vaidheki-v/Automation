package com.JavaLearning;

import java.util.Scanner;

public class WhileLoopExample {
	public static void main(String[] args) {
		System.out.println("while loop example1...");
		Scanner inputValue = new Scanner (System.in);

		// TODO Auto-generated method stub
		int numbers = 10;
		while(numbers>0) {
			System.out.println(numbers);
			numbers--;

		}
//	while loop example 2
		while((numbers>10)){
			System.out.println("Number is present in while loop");
			System.out.println("Inside while loop...");

		}
		
//		Example 2: Sum of Positive Numbers Only
		int PositiveNumber = 0 , sumOfPositiveNumber = 0;
		while(PositiveNumber>=0)
		{
		sumOfPositiveNumber	+=PositiveNumber;
		System.out.println("Enter a positive number");
		PositiveNumber= inputValue.nextInt();
		}
		inputValue.close();
		System.out.println("sum of the positive numbers are \t" + sumOfPositiveNumber);

//		do while loop example
		do {
			System.out.println("Number is present in do while loop");
			System.out.println("Inside  do while loop...");

		}while(numbers>10);

		
		
	}

}

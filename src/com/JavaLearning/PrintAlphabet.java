package com.JavaLearning;

import java.util.Scanner;

public class PrintAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		print a to z in alphabetical order
		System.out.println("printing from a to z in alphabetical order.........");
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}
		System.out.println("   ");
//		print Z to A in reverse alphabetical order
		System.out.println("printing from Z to A in revese order......");
		for (char ch = 'Z'; ch >= 'A'; ch--) {
			System.out.println(ch);
		}
//		a program to print all even numbers between 1 to 100
		System.out.println("printing all even nos between 1 to 100");

		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}
//		a program to print all odd numbers between 1 to 100
		System.out.println("printing all odd nos between 1 to 100");

		for (int i = 0; i <= 100; i++) {
			if (i % 2 != 0)
				System.out.println(i);
		}
//	 a program to find sum of all natural numbers between 1 to n
		Scanner inputValue = new Scanner(System.in);
		System.out.println("Enter a value of N natural numbers...");
		int naturalNumber = inputValue.nextInt();
		int sumValue = 0;
		for (int i = 0; i <= naturalNumber; i++) {
			sumValue += i;
		}
		System.out.println("The sum of " + naturalNumber + " natural numbers are " + sumValue);

//program to print sum all even numbers between 1 to 100
		System.out.println("printing all even nos between 1 to 100");
		int sumofEvenNumber = 0;
		int sumofOddNumber = 0;

		for (int i = 0; i <=100; i++) {
			if (i % 2 == 0)
				sumofEvenNumber += i;
		}
		System.out.println("The sum of even natural numbers between 1 to 100 are " + sumofEvenNumber);

//a program to print all odd numbers between 1 to 100
		System.out.println("printing all odd nos between 1 to 100");

		for (int i = 0; i <= 100; i++) {
			if (i % 2 != 0)
					sumofOddNumber += i;
		}
		System.out.println("The sum of odd natural numbers between 1 to 100 are " + sumofOddNumber);

	}
}

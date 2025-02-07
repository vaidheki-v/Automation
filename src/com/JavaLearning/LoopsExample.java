package com.JavaLearning;

import java.util.Scanner;

public class LoopsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		program to print n natural numbers in reverse
		Scanner input = new Scanner(System.in);
		int sum =0;
		System.out.println("Enter a natural number less than 100: ");
		int naturalNumber = input.nextInt();
		for(int i =naturalNumber; i>0; i--)
		{
			System.out.println(i);
			sum+=i;
		}
		System.out.println("sum of n natural numbers are..." + sum);
	}

}

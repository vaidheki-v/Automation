package com.JavaLearning;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your name...");
		Scanner inputValue = new Scanner(System.in);
		String Name = inputValue.nextLine();
		System.out.println("What would you like to order " + Name + " ?");

		String orderProduct = inputValue.next();
		System.out.println("How many quantity of " + orderProduct + " you would like to buy?");
		int orderQuantity = inputValue.nextInt();
		int totalPrice = 0;
		for (int i = 1; i <= orderQuantity; i++) {
			System.out.println("Please select the price for " + orderProduct + " " + i
					+ " from below list and enter exactly..." + "\n" + "12" + "\n" + "25" + "\n" + "40");
			int orderPrice = inputValue.nextInt();
			if (orderPrice == 12) {
				totalPrice += 12;
			} else if (orderPrice == 25) {
				totalPrice += 25;
			} else if (orderPrice == 40) {
				totalPrice += 40;
			} else {
				System.out.println("Please enter correct value from the option");
			}
		}
		System.out.println("Total amount for buying " + orderQuantity + " " + orderProduct + " is " + totalPrice);
		System.out.println("Enter your mark1...");
		float mark1 = inputValue.nextFloat();
		System.out.println("Enter your mark2...");
		float mark2 = inputValue.nextFloat();
		float average = (mark1+mark2)/2;
		System.out.println("The average of your marks are " + average);

	}
}

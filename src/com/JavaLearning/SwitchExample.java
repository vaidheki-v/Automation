package com.JavaLearning;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the fruits you want to buy: ");
		Scanner input = new Scanner(System.in);
		String fruits = input.nextLine();

		switch (fruits) {
		case "apple": {
			System.out.println("Price of 1 KG " + fruits + " is Rs.200/-");
			break;
		}
		case "pome": {
			System.out.println("Price of 1 KG " + fruits + " is Rs.250/-");
			break;

		}
		case "banana": {
			System.out.println("Price of 1 KG " + fruits + " is Rs.100/-");
			break;
		}
		case "orange": {
			System.out.println("Price of 1 KG " + fruits + " is Rs.120/-");
			break;

		}
		default:
			System.out.println("Ooooops!, fruit you asked is not available in shop");
		}

	}

}

package com.JavaLearning;

public class AssignmentOperatorLearn {

	public static void main(String... args) {
		System.out.println("hello");
		byte number1 = 10;
		byte number2 = 20;
		byte number3 = 20;
		byte number4 = (byte) (number1 + number2);// by default number is int, so we need to type case from int to byte
													// to store the value in byte
		System.out.println(number4);
		System.out.println(number1 + number2);
		number3 = (byte) (number3 + 15); // by default number is int, so we need to type case from int to byte to store
											// the value in byte
		System.out.println(number3);
		System.out.println("using pre increment and post increment operations................");
		System.out.println("printing number1 before post incrementing....." + number1++);
		System.out.println("printing number1 after post incrementing......" + number1);
		System.out.println("printing number2 using pre increment..." + ++number2);
		System.out.println("printing number1 for post decrementing..." + number2--);
		System.out.println("printing number1 for pre decrementing..." + --number2 + "\t" + --number2);
		System.out.println(number1 < number2);
		System.out.println(number2 > number1);
		System.out.println(number2 == number3); // why is is coming as false?
		System.out.println(number1 <= number2);
		int num1 = 15;
		int num2 = 28;
		int num3 = num2++;
		System.out.println("printing num2 value: " + num2);
		System.out.println("pringint num3 value: " + num3);
		System.out.println(num2 -= 28);
		final int voteAge = 18;
		boolean indianCitizen = true;
		System.out.println(voteAge >= 18 || indianCitizen == true);
		System.out.println(!indianCitizen == true);
		System.out.println(number2);
		/*
		 * below line is example of ternary operator condition ? true : false EX: a>b ?
		 * a: b if condition is satisfied, it will print value after ? else it will
		 * print value after :
		 */
		System.out.println(number3 > number2 ? number3 + number2 : "false");
		String eligibleforvote = voteAge >= 18 ? "eligible for voting.." : "not eligible for voting"; // if result is
																										// string for
																										// both, we need
																										// to assign
																										// value as
																										// string
																										// datatype for
																										// ternary
																										// condition
																										// check
		System.out.println(eligibleforvote);
		System.out.println(voteAge >= 18 & indianCitizen == true ? "person is eligible for voting.."
				: "person is not eligible for voting");
		// maths class
		int celsius = 100;
		float fahrenheit = 123.49f;
		int logNum = 1;
		int sinValue = 90;
		System.out.println("abstract value of " + fahrenheit + " is \t" + Math.abs(fahrenheit));
		System.out.println("rounded value of " + fahrenheit + " is \t" + Math.round(fahrenheit));
		System.out.println("floor value of " + fahrenheit + " is \t" + Math.floor(fahrenheit));
		System.out.println("ceil value of " + fahrenheit + " is \t" + Math.ceil(fahrenheit));
		System.out.println(
				"Maximum value between " + fahrenheit + " and " + celsius + " is \t" + Math.max(fahrenheit, celsius));
		System.out.println(
				"Minimum value between " + fahrenheit + " and " + celsius + " is \t" + Math.min(fahrenheit, celsius));
		System.out.println("decremented value of " + voteAge + " is " + Math.decrementExact(voteAge));
		System.out.println("incremented value of " + voteAge + " is " + Math.incrementExact(voteAge));
		System.out.println("log value of " + logNum + " is " + Math.log(logNum));
		System.out.println("printing randon value from Math function.. " + Math.random());
		System.out.println("printing sin value of " + sinValue + "..." + Math.ceil(Math.sin(sinValue)));
	}
}

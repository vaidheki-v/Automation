import java.util.ArrayList;
import java.util.Scanner;

public class CodingExercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		exercise 1: Hello and Name Printer
		System.out.println("This is exercise 1 result...");
		System.out.println("Hello \nVaidheki");
//		exercise 2: sum of Two Numbers	
		System.out.println("This is exercise 2 result...");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number 1..");
		int number1 = input.nextInt();
		System.out.println("Enter a number 2.");
		int number2 = input.nextInt();
		System.out.println("The addition of " + number1 + " and " + number2 + " are " + Math.addExact(number1, number2));
//		exercise 3: Division of Two Numbers
		System.out.println("This is exercise 3 result...");

		System.out.println("The addition of " + number1 + " and " + number2 + " are " + Math.divideExact(number1, number2));
//		exercise 4: Arithmetic Operations
		System.out.println("This is exercise 4 result...");
		System.out.println("The arithmetic result for  -5 + 8 * 6 " + " " + (-5 + 8 * 6));
		System.out.println("The arithmetic result for  (55+9) % 9 " + " " + ((55 + 9) % 9));
		System.out.println("The arithmetic result for  20 + -3*5 / 8" + " " + (20 + -3 * 5 / 8));
		System.out.println("The arithmetic result for  5 + 15 / 3 * 2 - 8 % 3 " + " " + (5 + 15 / 3 * 2 - 8 % 3));
//		exercise 5: Product of Two Numbers
		System.out.println("Input first number:");
		int firstNumber = input.nextInt();
		System.out.println("Input second number:");
		int secondNumber = input.nextInt();
		System.out.println("This is exercise 5 result...");
		System.out.println("Product of " + firstNumber + "*" + secondNumber + "= " + firstNumber * secondNumber);
//		exercise 6:  Basic Arithmetic Operations
		System.out.println("This is exercise 6 result...");
		System.out.println("Addition: " + firstNumber + " + " + secondNumber + "= " + (firstNumber + secondNumber));
		System.out.println("Subtraction: " + firstNumber + " - " + secondNumber + "= " + (firstNumber - secondNumber));
		System.out.println("Product: " + firstNumber + " * " + secondNumber + "= " + (firstNumber * secondNumber));
		System.out.println("Division:" + firstNumber + " / " + secondNumber + "= " + (firstNumber / secondNumber));
		System.out.println("Modulus: " + firstNumber + " mod " + secondNumber + "= " + (firstNumber % secondNumber));
//		exercise 7:Multiplication Table
		System.out.println("Enter a number for printing multiplication table...");
		int tableNumber = input.nextInt();
		System.out.println("This is exercise 7 result...");
		for ( int i=1; i<11;i++)
		{
			System.out.println( tableNumber + "X" + i + "= " + tableNumber*i );

		}
//		exercise 8: Pattern Display: JAVA
		System.out.println("This is exercise 8 result...");

		System.out.println("   J    a   v     v  a ");
		System.out.println("   J   a a   v   v  a a   ");
		System.out.println("J  J  aaaaa   V V  aaaaa   ");
				
		System.out.println(" JJ  a     a   V  a     a");
//		exercise 9:Expression evaluation
		System.out.println("This is exercise 9 result...");
		System.out.println("expression evaluation of ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) is \t " + ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
//		exercise 10:Formula Computation
		System.out.println("This is exercise 10 result...");

		System.out.println("formula computation of 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)) is \t " + 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
//		exercise 11. Circle: Area and Perimeter
		System.out.println("This is exercise 11 result...");
		System.out.println("Enter the radius of the circle...");
		float radiusOfCircle = input.nextFloat();
		System.out.println("Perimeter of the circle having radius " + radiusOfCircle +" is = " + 2*Math.PI*radiusOfCircle);
		System.out.println("Area of the circle having radius " + radiusOfCircle +" is = " + Math.PI* Math.pow(radiusOfCircle,2));
//		exercise 12. Average of Three Numbers
		System.out.println("Trying different method for calculating average of n given numbers..............");
		System.out.println("For how many numbers you want to find the average? ");
		int getAverageNumber = input.nextInt();
		int sumofAverageNumber =0;
		ArrayList<Integer> numbersList= new ArrayList<Integer>();
		for(int i=0;i<getAverageNumber;i++)
		{
			System.out.println("Enter the Number " + (i+1) + " to find the average...");
			int numbersToAdd = input.nextInt();
			numbersList.add(numbersToAdd);
			sumofAverageNumber+=numbersToAdd;
		}
		System.out.println("The average of " + getAverageNumber + " numbers are " + sumofAverageNumber/getAverageNumber);
		System.out.println("The elements of array list are below firsttt..");
		for(Integer i: numbersList)
		{
			System.out.println(i + "...");
		}
		System.out.println("The elements of array list are below seconddd..");

		numbersList.forEach(num -> System.out.println(num)); // do RND
		
		System.out.println("This is exercise 12 result...");
		System.out.println("Enter the Number 1 to find average..");
		int numberOne = input.nextInt();
		System.out.println("Enter the Number 2 to find average..");
		int numberTwo = input.nextInt();
		System.out.println("Enter the Number 3 to find average..");
		int numberThree = input.nextInt();	
		System.out.println("The average of three numbers "+ numberOne + "," + numberTwo + " and " + numberThree +" = " + (numberOne+numberTwo+numberThree)/3);
	}

}

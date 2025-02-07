import java.util.ArrayList;

public class DatatypeIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 50;
		char letter = 'V';
		double experience = 3.55;
		boolean isEmployed = true;
		String str = "This is Vaidheki";
		System.out.println(number);
		System.out.println(letter);
		System.out.println(str);
		System.out.println(isEmployed);
		System.out.println(experience);

		// learning arrays:
		int[] marks = new int[5];
		marks[0] = 78;
		marks[1] = 87;
		marks[2] = 89;
		marks[3] = 68;
		marks[4] = 78;
		int total = 0;
		System.out.println(" ");

		// multiple of two's
		for (int i : marks) {
			System.out.println("The two multiples of marks array are " + 2 * i);
			if (i % 2 == 0) {
				System.out.println("This element is multiple of two " + i);
			} else {
				System.out.println("This element is not a multiple of two " + i);

			}
		}
		System.out.println(" ");

//		for loop
		System.out.println("The elements of marks array is displayed below: ");
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
			total = total + marks[i];
		}
		System.out.println("The total of all marks earned is " + total);
		System.out.println("Average of all the marks is " + total / marks.length);
		String[] friends = { "Aarthi", "Vasantha", "Dharshini", "Mom" };
		System.out.println(" ");
		System.out.println("Here is My friends list...");
		for (int i = 0; i < friends.length; i++) {
			System.out.println(i + 1 + "." + friends[i]);
		}
//		 enhanced for loop
		for (String j : friends) {
			System.out.println("Displaying values by enhanced for loop: " + j);
		}

//		if else condition

		int[] age = { 44, 89, 34, 60, 56, 17, 78 };
		for (int val : age) {
			if (val < 60) {
				System.out.println("Person of age " + val + " is not a senior citizen ");
				break;

			} else {
				System.out.println("Person of age " + val + " is a senior citizen ");

			}
		}
//		learning arraylist
		ArrayList<String> listVariable = new ArrayList<String>();
		listVariable.add("HI");
		listVariable.add("Hello");
		listVariable.add("Sriram");
		listVariable.add("Vaidheki");
		listVariable.add("nice to meet you");
// displaying the values of string array list in original order
		System.out.println("                             ...................         ");

		System.out.println("displaying the values of string array list in original order ");
		for (String i : listVariable) {
			System.out.println(i);
		}
// displaying the values of string array list in reverse order
		System.out.println("displaying the values of string array list in reverse order ");
		System.out.println(listVariable.reversed());
// displaying the values of string array list in original order after deleting last element of array list
		listVariable.removeLast();
		System.out.println("displaying the values of string array list after deleting last element in original order ");
		for (String i : listVariable) {
			System.out.println(i);
		}
// displaying the values of string array list in original order after deleting last element of array list
		listVariable.remove(1);
		System.out.println(
				"displaying the values of string array list after deleting element at 1st index in original order ");
		for (String i : listVariable) {
			System.out.println(i);
		}
		System.out.println("Is array list empty?:" + listVariable.isEmpty());

// adding element at specified index and displaying the array list
		listVariable.add(2, "Loves");
		System.out.println(
				"displaying the values of string array list after adding element at 2nd index in original order ");
		for (String i : listVariable) {
			System.out.println(i);
		}
		System.out.println("printing something...." + listVariable.get(1));
		/*
		 * 
		 * // displaying the values of string array list in original order after
		 * deleting all elements of array list
		 * System.out.println("Is array list empty before deleting all elements?: " +
		 * listVariable.isEmpty());
		 * System.out.println("deleting all the values of string array list");
		 * listVariable.removeAll(listVariable);
		 * System.out.println("Is array list empty after deleting elements?:" +
		 * listVariable.isEmpty());
		 */

		System.out.println("displaying arraylist elements at specific index............");
		System.out.println(listVariable.getFirst());
		System.out.println(listVariable.getLast());
		System.out.println(listVariable.get(2));
		System.out.println(listVariable.get(1));

//	Using for loop in array list
		System.out.println("Printing elements in array list using for loop........");
		for (int k = 0; k < listVariable.size(); k++) {
			System.out.println(listVariable.get(k));
		}
		
		String newValue = "Race car";
		String newRegex ="[\\s]";
		System.out.println(newValue.substring(5,newValue.length()));
		System.out.println(newValue.length());
	}
}

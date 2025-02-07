package com.JavaLearning;

import java.util.Arrays;

public class JavaIntroduction {

	public static void main(String[] args) {
//	primitive data types initialization
		System.out.println("Just typing..");
		byte number_byte = 127;

		short number_short = 789;
		int number_int = 33000;
		char var_char = 'A';
		String var_str = "This is value";
		boolean isempty = false;
		float number_float = 34.2344F;
		double number_double = 79283.42321244;
		long number_long = 3331203434984933L;
		System.out.println(number_byte);
		System.out.println(number_short);
		System.out.println(number_int);
		System.out.println(isempty);
		System.out.print(number_long);
		System.out.print("\t" + number_float);
		System.out.print("\t" + number_double);
		System.out.print("\n" + var_str);
		System.out.println("\n" + var_char);

// reference data type initialization
// type 1 array: assigning values after initialization
		int[] marks = new int[5];
		marks[0] = 45;
		marks[1] = 34;
		marks[2] = 48;
		marks[3] = 35;
		marks[4] = 32;
		System.out.println(marks[2]);
		System.out.println("Printing elements of marks array as: " + Arrays.toString(marks));
		System.out.println("Updatiing marks array value");
		marks[3] = 43;
		marks[4] = 39;
		System.out.println("Printing elements of marks array after updating values: " + Arrays.toString(marks));
// type 1: assigning values after initialization with empty values for array
		int[] scores = new int[5];
		scores[0] = 45;
		scores[1] = 35;
		scores[4] = 33;
//		below line is used to get particular element in an array
		System.out.println(scores[2]);
		System.out.println("Printing elements of scores array as: " + Arrays.toString(scores));
// type 2: assigning values of array during array initialization
		int[] examMarks = new int[] { 78, 63, 61, 87, 72 };
		System.out.println("\n" + "Displaying marks array as: " + examMarks[0] + "\t" + examMarks[1] + "\t"
				+ examMarks[2] + "\t" + examMarks[3] + "\t" + examMarks[4]);
		System.out.println("\n" + "printing exam marks array by converting into string: " + Arrays.toString(examMarks));
		System.out.println(" elements for exammark array: " + examMarks.length);

		examMarks[2] = 80;
		System.out.println(
				"\n" + "printing updated exam marks array by converting into string: " + Arrays.toString(examMarks));

		String Exammark_StringArray = Arrays.toString(examMarks);
		System.out.println("\n" + "printing string array: " + Exammark_StringArray);
		System.out.println(Exammark_StringArray.isBlank());

//clone array
		int[] examMarks2 = examMarks.clone();
		System.out.println("\t" + examMarks2[3]);
		// System.out.println(examMarks2[9]);
//		type 3: assigning values of array during array initialization without keyword new
		String[] employeesName = { "Aarthi", "Dharshini", "Vaidheki", "Vasantha", "Dhivya" };
		System.out.println(Arrays.toString(employeesName));
//		character array trial
		char[] letters = new char[] { 'V', 'A', 'I', 'd', 'h', 'e', 'k', 'i' };
		System.out.println(Arrays.toString(letters));
		char lettersNew[] = new char[5];
		lettersNew[1] = 'X';
		lettersNew[0] = 't';
		lettersNew[2] = 'M';
		lettersNew[4] = 'C';
//		below line is used to get all elements in the array and print
		System.out.println(Arrays.toString(lettersNew));
		System.out.println(letters.length);

//single line command

		/*
		 * multiline command this is first line this is second line this is third line
		 */
		// String trial
		String myName = "VAIDHEKI";
		String myName2 = "Vaidhe is Short Form";
		char[] destination_char = { 'S', 'R', 'I', 'R', 'A', 'M' };
		String myName3 = "vaidheki";
		String myName4 = "vaidheki";
		String shortname = "vai";
		String his_shortname = "sri";
		String end_name = "ki";
		System.out.println(myName.charAt(2)); // print the character present at the mentioned index in the string
		System.out.println(myName.codePointAt(2)); // print the ASCII value of element present at mentioned index in the
													// string
		System.out.println(myName.codePointBefore(2)); // print the ASCII value of element present before the mentioned
														// index in the string
		System.out.println(myName.codePointCount(0, 8)); // print the number of unicode element present between the
															// mentioned index in the string
		System.out.println(myName.compareTo(myName2)); // return result as '0' if both strings are equal
		System.out.println(myName.compareToIgnoreCase(myName2)); // compare two strings ignoring the case and returns
																	// '0' if it matches
		System.out.println(myName.concat(myName2)); // used to concat two string
		System.out.println(myName);
//		System.out.println(myName);
		System.out.println(myName2.toCharArray());
		char[] namesplit = myName2.toCharArray(); // converts string into character
		System.out.println(Arrays.toString(namesplit));
		System.out.println(myName2.toLowerCase());
		System.out.println(myName2.toUpperCase());
		System.out.println("printing char array before copying" + Arrays.toString(destination_char));
		myName.getChars(0, 3, destination_char, 0);
		/*
		 * the above line copy characters from string into character array where first
		 * value is source array starting index second value is source array ending
		 * index -1 third value is character array where we are copying fourth value is
		 * index from where we need to copy the characters
		 */
		System.out.println("printing char array after copying" + Arrays.toString(destination_char));
		System.out.println(myName.equalsIgnoreCase(myName3)); // returns true if both strings are equal without
																// comparing the case
		System.out.println("checking if myname3 and myname4 are equal? " + myName4.equals(myName3)); // returns true if
																										// both strings
																										// are equal by
																										// comparing the
																										// case
		String empty_string = ("      ");
		String blank_string = ("");
		String college = "      sri ramanujan centre     ..  " + " KUMBAKONAM    ";
		String school = "      sri ramanujan centre     ..  " + " KUMBAKONAM   " + " i am simly typing... "
				+ "   there is threee space before this sentence.." + "there is threee space after this sentence   ";

		System.out.println("checking the isBlank function in empty_string: " + empty_string.isBlank()); // returns true
																										// if a string
																										// is having
																										// only empty
																										// string or
																										// white spaces
																										// in it
		System.out.println("checking the isBlank function in empty_string: " + empty_string.isEmpty()); // returns true
																										// only if a
																										// length of
																										// string is
																										// equal to zero

		System.out.println("checking the isBlank function in blank_string: " + blank_string.isBlank()); // returns true
																										// if a string
																										// is having
																										// only empty
																										// string or
																										// white spaces
																										// in it
		System.out.println("checking the isEmpty function in blank_string: " + blank_string.isEmpty()); // returns true
																										// only if a
																										// length of
																										// string is
																										// equal to zero

		System.out.println("checking if myname3 starts with shortname value: " + myName3.startsWith(shortname)); // check
																													// if
																													// myname3
																													// string
																													// starts
																													// with
																													// shortname
																													// value
		System.out.println("checking if myname3 starts with his_shortname value: " + myName3.startsWith(his_shortname)); // check
																															// if
																															// myname3
																															// string
																															// starts
																															// with
																															// his_shortname
																															// value
		System.out.println("checking if myname3 ends with end_name value: " + myName3.endsWith(end_name)); // check if
																											// myname3
																											// string
																											// starts
																											// with
																											// shortname
																											// value
		System.out.println("printing the original string:" + "\n" + college);
		System.out.println("printing lowercase of the string:" + college.toLowerCase());
		System.out.println("printing trim value of the string:" + college.trim() + "hi");
		System.out.println("printing strip value of the string:" + college.strip() + "hi");
		System.out.println("using stripleading function of the string:" + "\n" + college.stripLeading() + "hi");
		System.out.println("printing striptrailing function of the string:" + "\n" + college.stripTrailing() + "hi");
		System.out.println("hi" + school.stripIndent());
		String sample_split = "booand:foo,too;far.away$hello hii&fine";
		String regex = "[\\:,\\;.\\$\\s\\&]";
		// checking the split method in string using regex
		System.out.println("trying split method using regex only...");
		String[] splitArray = sample_split.split(regex);
		for (String S : splitArray) {
			System.out.println(S + "  *");
//			System.out.print("\\n");
		}
		System.out.println("trying split method using regex and integer...");
		String sample_split2 = "geekss@for@geekss";
		// checking the split method in string using regex and int
		String[] splitArray2 = sample_split2.split("s", 5);
		for (String S2 : splitArray2) {
			System.out.println(S2 + "***");
//			System.out.print("\\n");	
		}
		String schoolName = "CTK girls school";
		System.out.println("is school name starts with CTK?..." + schoolName.startsWith("girls", 4)); // check if
																										// mentioned
																										// substring is
																										// present at
																										// the specified
																										// index
		System.out.println("is school name ends with ool?..." + schoolName.endsWith("ols")); // check if mentioned
																								// substring is present
																								// at the specified
																								// index
//	 two dimensional array example
		int twoDimensionArray[][] = { { 1, 1 }, { 1, 2 }, { 1, 3 } };
		System.out.println("printing length of 2D array.." + twoDimensionArray.length);
		twoDimensionArray[2][1] = 4;
		// below line will print all the elements in array using for loop
		for (int[] row : twoDimensionArray) {
			for (int val : row) {
				System.out.print(val + "\t");
			}
			System.out.print("\n");
		}
		final int votingAge = 18;
		System.out.println("voting age of person in India is..." + votingAge);

	}
}

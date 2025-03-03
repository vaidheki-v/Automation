package streamsLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
<<<<<<< HEAD

import org.testng.Assert;
=======
>>>>>>> 302e7257985a814b78f05401f96df882a322fb8a
import org.testng.annotations.Test;
public class streamIntroduction {
//	@Test
	public void regular() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Vaidheki");
		names.add("Aarthi");
		names.add("Dharshini");
		names.add("Dhivya");
		names.add("Atchaya");
		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).startsWith("A")) {
				System.out.println("names for this list is: " + names.get(i));
				count++;
			}
		}
		System.out.println("no of names for this list is: " + count);
	}

//	@Test
		public void streamFilter()
		{
		System.out.println("inside streamFilter method..");

			List<String> names = new ArrayList<String>();
			names.add("Vaidheki");
			names.add("Atchaya");
			names.add("Dharshini");
			names.add("Dhivya");
			names.add("Aarthi");
			//there is no life for intermediate operation if there is no terminal operation
			//terminal operation will execute only if intermediate operation(filter in below case) returns true/value
			//we can create stream directly instead of using any collection class
			long count = names.stream().filter(s->s.startsWith("A")).count();
			System.out.println(" the count is " + count);
			// creating the stream directly by passing values instead of passing from collectiont
			long count1 = Stream.of("Vaidheki","Aarthi","Dhivya","Atchaya").filter(s->
			{
				s.startsWith("A");
			return true;
			}).count();
			names.stream().filter(s->s.length()>6).forEach(s->System.out.println(s));//print all the names of the array list having lenght >5
			names.stream().filter(s->s.length()>6).limit(1).forEach(s->System.out.println(s)); //print only limited names of the array list having lenght >5	
	}
<<<<<<< HEAD
//		@Test
		public void streamMap()
		{
			System.out.println("inside streamMap method..");
			//print the names which has last letter as "A" and print with uppercase
			System.out.println("print the names which has last letter as \"A\" and print with uppercase");
			Stream.of("Vaidheki","Aarthi","Dhivya","Atchaya").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
			//print the names which has first letter as "A" and print with uppercase and sorted
			String[] nameList = {"Vaidheki","Aarthi","Dhivya","Atchaya"};
			//List<String> ListFromArrSample = Arrays.asList("Aaa","Bbb","Ccc","Ddd","Eee");
			List<String> ListFromArrays = Arrays.asList(nameList);
			System.out.println("print the names which has first letter as \"A\" and print with uppercase and sorted");
			ListFromArrays.stream().filter(s->s.startsWith("A")).map(s->s.toUpperCase()).sorted().forEach(s->System.out.println(s));
			
			List<String> girls = new ArrayList<String>(); //list having girls students
			girls.add("Vaidheki");
			girls.add("Atchaya");
			girls.add("Dharshini");
			girls.add("Dhivya");
			girls.add("Aarthi");
			String[] boys= {"Adarva","Vijay","Surya","Dulquer","Vikram"};
			List<String> boysName=	Arrays.asList(boys);
			//merging 2 different list
			System.out.println("Merging both boys and girls list of Class A in the alphabetical order..");
			Stream<String> newStream =Stream.concat(girls.stream(), boysName.stream()); // Stream have concat method that concat two streams
//			newStream.map(s->s.toUpperCase()).sorted().forEach(s->System.out.println(s));
			boolean flag =	newStream.anyMatch(s->s.equalsIgnoreCase("vaIdhekI"));
			System.out.println(flag);
			Assert.assertTrue(flag);
		}
		@Test
		public void streamCollect()
		{
			//collect method will allow us to create new list after modifying original list
		List<String> namesEndsWithLetterA =	Stream.of("Vaidheki","Aarthi","Dhivya","Atchaya").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
			.collect(Collectors.toList());
		System.out.println( "displaying name after converting filtered values from stream into list and displays last value in the list \n" + namesEndsWithLetterA.getLast());
//		System.out.println( "displaying name after filtered values from stream... ");  
		Stream.of("Vaidheki","Aarthi","Dhivya","Atchaya")
		.filter(s->s.endsWith("a"))
		.map(s->s.toUpperCase())
		.forEach(s->System.out.println("displaying name after filtered values from stream..." +s)
		);
		List<Integer> numbers = Arrays.asList(2,4,5,7,1,4,6,2,4);
		//print unique numbers from array
		//sort the arrays
		System.out.println("Printing distinct numbers");
		numbers.stream().distinct().forEach(s->System.out.println(s));
		System.out.println("Printing distinct numbers in the sorted order");
		numbers.stream().distinct().sorted().forEach(s->System.out.println(s));
		List<Integer> convertedList = numbers.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("Printing the element present at 3rd index in the sorted list " + convertedList.get(2));
}
=======
>>>>>>> 302e7257985a814b78f05401f96df882a322fb8a
}

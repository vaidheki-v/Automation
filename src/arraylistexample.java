import java.util.ArrayList;

public class arraylistexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> s = new ArrayList<>();
	        s.add("Cherry");
	        s.add("Blueberry");
	        s.add("Strawberry");

	        // Use forEach() to print each fruit
	        s.forEach(System.out::println);
	        
	        ArrayList<Integer> n = new ArrayList<>();
	        n.add(2);
	        n.add(3);
	        n.add(4);

	        // Use forEach() to print the 
	        // square of each number
	        n.forEach(num -> System.out.println(num * num));
	}

}

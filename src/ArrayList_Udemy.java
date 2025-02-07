import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_Udemy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"vaidheki","sriram","amma","appa"};
		ArrayList<String> a = new ArrayList<String>();
		a.add("first");
		a.add("second");
		a.add("third");
		System.out.println(a);	
		a.addFirst("zero");
		System.out.println("Original array list... " + a);
		System.out.println("reversed array list... " + a.reversed());
		System.out.println("printing element present at the second index in array list... " + a.get(2));
		a.remove(2);
		System.out.println("printing element present at the second index  after a removal in array list... " + a.get(2));
		System.out.println("printing using for loop.............");
		for(int i =0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("printing using enhanced for  loop...............");

		for(String i : a)
		{
			System.out.println(i);
		}
		System.out.println( "checking if the element \"first\" is present: " +a.contains("first"));
		System.out.println("Converting arrays into Array list using Aslist method..");
		String[] emptyArray = new String[5];
		System.out.println(Arrays.asList(arr));
		System.out.println("is array empty??");
		List<String> arraylistvalue = Arrays.asList(emptyArray);
		System.out.println(arraylistvalue);

	}

}

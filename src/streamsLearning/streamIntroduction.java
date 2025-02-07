package streamsLearning;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import org.testng.annotations.Test;
public class streamIntroduction {
		@Test
		public void regular()
		{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Vaidheki");
		names.add("Aarthi");
		names.add("Dharshini");
		names.add("Dhivya");
		names.add("Atchaya");
		int count =0;
		for ( int i=0; i< names.size();i++)
		{
			if (names.get(i).startsWith("A"))
			{
				System.out.println("names for this list is: " + names.get(i));
				count++;
			}
		}
		System.out.println("no of names for this list is: " + count);
		}
		@Test
		public void streamFilter()
		{
			List<String> names = new ArrayList<String>();
			names.add("Vaidheki");
			names.add("Aarthi");
			names.add("Dharshini");
			names.add("Dhivya");
			names.add("Atchaya");
			//there is no life for intermediate operation if there is no terminal operation
			//terminal operation will execute only if intermediate operation(filter in below case) returns true/value
			//we can create stream directly instead of using any collection class
			long count = names.stream().filter(s->s.startsWith("A")).count();
			System.out.println(" the count is " + count);
			
			Stream.of("Vaidheki","Aarthi","Dhivya","Atchaya"); // creating the stream directly by passing values instead of passing from collectiont
	}
}

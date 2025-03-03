package SeleniumLearning;

import org.testng.ITestListener;
import org.testng.annotations.Test;

public class testNGIntroduction implements ITestListener {

	@Test
	public void Demo()
	{
		System.out.println("hello");
	}
	@Test
	public void DemoTwo()
	{
		System.out.println("hello two");

	}
	
}

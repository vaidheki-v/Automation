
public class MethodsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsExample obj = new MethodsExample();
		obj.name();
		obj.add(78, -8);
		int additionValue = obj.add(89, -27);
		System.out.println("addition of x  and y  is " + additionValue);
		MethodTwo obj2 = new MethodTwo();
		String text = obj2.returnNAme();
		System.out.println("The text returned by methodTwo is: " + text);
	}
	public void name()
	{
		System.out.println(" welcome you to our home...");
	}
	public int add(int x, int y) 
// to access this method, we need to create object for the class and then need to call the method using the object.methodName
//	(since it is not a static method)
	{
		int sum = 0;
//		System.out.println(" addition of " + x  + " and " + y + " is " + x+y);
		sum = x+y;
		return sum;
	}
	public static int addThree(int x, int y, int z)
// to access this method, we don't need to create object for the class and then we can call the method directly without creating object
// (since it is a static method, method got created at the class level and not at the object level
	{
		int sum = 0;
//		System.out.println(" addition of " + x  + " and " + y + " is " + x+y);
		sum = x+y+z;
		return sum;
	}
}

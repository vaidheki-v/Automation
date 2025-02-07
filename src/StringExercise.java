
public class StringExercise {

	public static <Arrays> void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Vaidheki";
		String regexval = "[\\s,.,:,;]";
		String schoolName = new String("Christ;the.king matric:school");
		System.out.println("Printing splitted array using string and regex func....");
		String[] splitSchool = schoolName.split(regexval);
		for( String i : splitSchool)
		{
			System.out.println(i);
		}
		String[] splitSchool2 = schoolName.split("king");
		System.out.println("pringing using split func..." + splitSchool2[0] + "**" +  splitSchool2[1]);
		System.out.println("length of the string is: " + schoolName.length());
		System.out.println("printing the characters of the string in original order..........");
		for(int i=0;i <schoolName.length();i++)
		{
			System.out.println("character present at index " + i + " is: " +  schoolName.charAt(i));
			
		}
		System.out.println("printing the characters of the string in reverse order..........");

		for(int j=schoolName.length()-1; j>=0; j--)
		{
			System.out.println("character present at index " + j + " is: " +  schoolName.charAt(j));
		}
	}
}

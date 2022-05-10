// Java code to demonstrate the
// working of substring(int begIndex, int endIndex)
public class GF {
	public static void main(String args[])
	{

		// Initializing String
		String Str = new String("Welcome to geeksforgeeks");

		// using substring() to extract substring
		// returns geeks
		System.out.print("The extracted substring is : ");
		System.out.println(Str.substring(11, 16));
	}
}

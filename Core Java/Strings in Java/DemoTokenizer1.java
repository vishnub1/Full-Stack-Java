package maccess;
import java.util.*;

public class DemoTokenizer1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = s.nextLine();
		
		StringTokenizer st = new StringTokenizer(str,"a");
		int count = st.countTokens();
		System.out.println("count of Tokens:"+count);
		System.out.println("===Display Tokens====");
		while (st.hasMoreElements())
		{
			String tk = st.nextToken();
			System.out.println(tk.toString());
			System.out.println("Count of tokens:"+st.countTokens());
		} //end of loop
		s.close();
	}

}
//Enter the String:
//vishnu biradar
//count of Tokens:3
//===Display Tokens====
//vishnu bir
//Count of tokens:2
//d
//Count of tokens:1
//r
//Count of tokens:0

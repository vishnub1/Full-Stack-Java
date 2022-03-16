//wap to read a String and display the reverse of words in the String?

package maccess;
import java.util.*;

public class DemoTokenizer2 {
	public static void main(String[] args) {
		Scanner  s = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str= s.nextLine();
		StringTokenizer st = new StringTokenizer(str," ");
		System.out.println("count of Token :"+st.countTokens());
		System.out.println("===Worlds of string in reverse===");
		while(st.hasMoreElements()) {
			String tk=st.nextToken();
			StringBuffer sb = new StringBuffer(tk);
			System.out.println(sb.reverse()+" ");
		}//e
		s.close();		
	}
}

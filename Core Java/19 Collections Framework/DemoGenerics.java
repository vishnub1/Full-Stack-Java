package maccess;
import java.util.*;
public class DemoGenerics {
	public static void main(String[] args) {
		HashSet hs = new HashSet(); //generic class
		hs.add(new String("Programming"));
		hs.add(new Integer(12));
		hs.add(new Integer(12));
		hs.add(new String("Java"));
		System.out.println(hs.toString());
		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs2.add(new Integer(13));
		hs2.add(new Integer(14));
		hs2.add(new Integer(1));
		System.out.println(hs2.toString());
	}
}
//O/P
//[Java, Programming, 12]
//[1, 13, 14]

package maccess;
import java.util.*;
public class DemoSet {
	public static void main(String[] args) {
		System.out.println("===HashSet<E>===");
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(new Integer(123));
		hs.add(new Integer(12));
		hs.add(new Integer(13));
		hs.add(new Integer(131));
		hs.add(new Integer(150));
		hs.add(new Integer(1));
		System.out.println(hs);
		
		System.out.println("===Linked HashSet<E>====");
		LinkedHashSet<Integer> ihs = new LinkedHashSet<Integer>();
		ihs.add(new Integer(131));
		ihs.add(new Integer(12));
		ihs.add(new Integer(14));
		ihs.add(new Integer(131));
		System.out.println(ihs);
		
		System.out.println("===TreeSet<E>===");
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(new Integer(131));
		ts.add(new Integer(200));
		ts.add(new Integer(12));
		ts.add(new Integer(14));
		ts.add(new Integer(1));
		ts.add(new Integer(131));
		ts.add(new Integer(150));
		ts.add(new Integer(150));
		System.out.println(ts);
	}
}

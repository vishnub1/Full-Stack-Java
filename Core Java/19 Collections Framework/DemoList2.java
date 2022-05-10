package maccess;
import java.util.*;
public class DemoList2 {
	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(new Integer(12));
		l1.add(new Integer(13));
		l1.add(new Integer(11));
		l1.add(new Integer(13));
		l1.add(new Integer(14));
		l1.add(new Integer(15));
		System.out.println(l1.toString());
		l1.add(2,new Integer(500)); //adding element by index
		System.out.println(l1.toString());
		l1.remove(2);  //remove element by index
		System.out.println(l1.toString());
		l1.set(2,new Integer(700));//replace element by Index
		System.out.println(l1.toString());
		Integer ele = l1.get(2);  //getting the element by index value2 
		System.out.println("Element at index value 2:"+ele);
	}
}


//[12, 13, 11, 13, 14, 15]
//[12, 13, 500, 11, 13, 14, 15]
//[12, 13, 11, 13, 14, 15]
//[12, 13, 700, 13, 14, 15]
//Element at index value 2:700
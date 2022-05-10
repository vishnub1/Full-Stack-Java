package maccess;
import java.util.*;
public class DemoList1 {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(new Integer(12));
		a1.add(new Integer(13));
		a1.add(new Integer(11));
		a1.add(new Integer(14));
		a1.add(new Integer(20));
		System.out.println(a1.toString());
		a1.add(2,new Integer(500)); //Adding element by index
		System.out.println(a1.toString());
		a1.remove(2); //remove element by index
		System.out.println(a1.toString());
		a1.set(2, new Integer(700));//replace element by index
		System.out.println(a1.toString());
		Integer ele = a1.get(2); //getting element by index value
		System.out.println("Element at index value 2:"+ele);
	}
}
//[12, 13, 11, 14, 20]
//[12, 13, 500, 11, 14, 20]
//[12, 13, 11, 14, 20]
//[12, 13, 700, 14, 20]
//Element at index value 2:700


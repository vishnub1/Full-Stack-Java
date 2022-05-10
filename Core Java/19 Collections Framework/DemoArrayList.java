package array;
import java.util.*;
public class DemoArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(new Integer(12));
		al.add(new Integer(23));
		al.add(new Integer(41));
		al.add(new Integer(126));
		al.add(new Integer(5));
		al.add(new Integer(50));
		System.out.println(al.toString());
		
		al.add(2,new Integer(500));//adding element by index.
		System.out.println(al.toString());
		
		al.remove(2);//remove element by index 2
		System.out.println(al.toString());
		
		al.set(2, new Integer(700));//replace element by index
		System.out.println(al.toString());
		
		Integer ele = al.get(4);//getting elemrent bt index value
		System.out.println("Element at index value 4 :"+ele);
	}
}

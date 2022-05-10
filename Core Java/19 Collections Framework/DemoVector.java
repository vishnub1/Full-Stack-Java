package array;
import java.util.*;

public class DemoVector {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("default capacity :"+v.capacity());//default capacity of vector is 10.
		System.out.println("Size :"+v.size());
		v.addElement(new Integer(23));
		v.add(24);
		v.add(21);
		v.add(266);
		v.add(200);
		v.add(100);
		System.out.println(v.toString()); //toString no needed
		System.out.println("Capacity :"+v.capacity());//default capacity of vector is 10.
		System.out.println("Size :"+v.size());
		v.addElement(89);
		v.addElement(55);
		v.addElement(44);
		v.addElement(22);
		v.addElement(78);
		System.out.println(v.toString()); //toString no needed
		System.out.println("Capacity :"+v.capacity());//default capacity of vector is 10.
		System.out.println("Size :"+v.size());
		
		System.out.println("First Element :"+v.firstElement());
		System.out.println("Last Element :"+v.lastElement());
		System.out.println("Element at index 3 :"+v.elementAt(3));
		v.setElementAt(new Integer(500), 8);
		System.out.println();
		System.out.println("element set at 8 :500 ");
		System.out.println(v.toString());
		
		v.remove(7);
		System.out.println(v.toString());
		System.out.println("Capacity :"+v.capacity());//default capacity of vector is 10.
		System.out.println("Size :"+v.size());
		
	}
}

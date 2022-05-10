package maccess;
import java.util.*;
public class DemoVector {
	public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        System.out.println("default capacity:"+v.capacity());
        System.out.println("size:"+v.size());
        v.addElement(new Integer(11));
        v.addElement(new Integer(12));
        v.addElement(new Integer(13));
        v.addElement(new Integer(14));
        v.addElement(new Integer(15));
        v.addElement(new Integer(16));
        System.out.println(v.toString());
        System.out.println("capacity:"+v.capacity());
        System.out.println("size:"+v.size());
        v.addElement(new Integer(11));
        v.addElement(new Integer(12));
        v.addElement(new Integer(13));
        v.addElement(new Integer(14));
        System.out.println(v.toString());
        System.out.println("capacity:"+v.capacity());
        System.out.println("size:"+v.size());
        v.addElement(new Integer(11));
        System.out.println(v.toString());
        System.out.println("capacity:"+v.capacity());
        System.out.println("size:"+v.size());
        System.out.println("first element:"+v.firstElement());
        System.out.println("last element:"+v.lastElement());
        System.out.println("ele at index 9 : "+v.elementAt(9));
        v.setElementAt(new Integer(500), 9);
        System.out.println(v.toString());
        v.remove(9);
        System.out.println(v.toString());
        v.remove(new Integer(12));
        System.out.println(v.toString());
        System.out.println("capacity:"+v.capacity());
        System.out.println("size:"+v.size());
	}
}

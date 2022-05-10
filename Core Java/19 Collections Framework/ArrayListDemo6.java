package maccess;
import java.util.*;
public class ArrayListDemo6 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList(); //raw type(unsafe operation)
		al.add(12);
		al.add("Ravi");
		al.add(12);		
		al.add(0,"Hyderabad"); //add(int index, Object o)method of List interface
		al.add(1,"Naresh");
		al.add(null);
		al.add(11);
		System.out.println(al);
	}
}

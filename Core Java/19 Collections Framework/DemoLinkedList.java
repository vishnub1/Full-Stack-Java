package array;
import java.util.*;
public class DemoLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(new Integer(12));
		li.add(new Integer(22));
		li.add(new Integer(11));
		li.add(new Integer(55));
		li.add(new Integer(88));
		li.add(new Integer(44));
		li.add(new Integer(33));
		System.out.println(li.toString());
		
		li.add(2,new Integer(500));  //adding element by index
		System.out.println(li.toString());
		
		li.remove();//remove FIFO Manner first element
		System.out.println(li.toString());
		li.remove();//remove FIFO Manner first element
		System.out.println(li.toString());
		
		li.remove(3);//remove element by index 3
		System.out.println(li.toString());
		
		li.set(2, new Integer(700));//replace element by index
		System.out.println(li.toString());
		
		Integer ele = li.get(2);//getting element by index value
		System.out.println("Element at index value 2:"+ele);
		System.out.println("size :"+li.size());
	}
}

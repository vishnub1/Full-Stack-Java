package array;
import java.util.*;
public class DemoArray3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		try(scn;){
			try {
				System.out.println("Enter the number of Integer element");
				int n = scn.nextInt();
				Integer a[] = new Integer[n];  //array_object
				System.out.println("Enter the "+n+" Integer Elements");
				for(int i=0;i<a.length;i++) {
					a[i] = new Integer(scn.nextInt());
				}
				System.out.println("==Displaying using Spliterator<T>==");
				Spliterator<Integer> sp = Arrays.spliterator(a);
				sp.forEachRemaining((z)->{
					System.out.print(z.toString()+" ");
				});
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

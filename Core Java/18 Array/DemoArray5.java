package array;
import java.util.*;
public class DemoArray5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		try(scn;){
			try {
				System.out.println("Enter the size of Array ");
				int n = Integer.parseInt(scn.nextLine());
				String a[] = new String[n];
				System.out.println("Enter "+n+" String Element");
				for(int i=0;i<n;i++) {
					a[i]=new String(scn.nextLine());
				}
				System.out.println("==Display Array using for loop==");
				for(int i=0;i<a.length;i++) {
					System.out.println(a[i].toString());
				}
				System.out.println("\n==Display Array using Extended for ==");
				for(String k:a) {
					System.out.println(k.toString());
				}
				System.out.println("\n==Display Array using Spliterator<T>");
				Spliterator<String> sp = Arrays.spliterator(a);
				sp.forEachRemaining((k)->
				{
					System.out.println(k.toString());
				});
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

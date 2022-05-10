package array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Spliterator;
public class DemoArray_combine1_2_3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		try(scn;){
			try {
				System.out.println("Enter the number of integer elements");
				int n = scn.nextInt();
				Integer a[] = new Integer[n]; //array_object
				System.out.println("==Enter"+n+"integer element==");
				for(int i=0; i<a.length; i++) {
					a[i] = new Integer(scn.nextInt());
				}
				System.out.println("==Display using old-for-loop==");
				for(int i=0;i<a.length;i++) {
					System.out.print(a[i].toString()+" ");
				}
				System.out.println("\n==DISPLAYING USING EXTENDED-FOR==");
				for(Integer k: a) {
					System.out.print(k.toString()+" ");
				}
				System.out.println("\n==Displaying using Spliterator<T>==");
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

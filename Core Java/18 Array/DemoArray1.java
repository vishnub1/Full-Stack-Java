package array;
import java.util.Scanner;
public class DemoArray1 {
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
			}catch(Exception e) {
			 e.printStackTrace();
			}
		}
	}
}

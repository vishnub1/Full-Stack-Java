package array;
import java.util.Scanner;
public class DemoArray2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		try(scn;){
			try {
				System.out.println("ENTER THE NUMBER OF INTER ELEMENT");
				int n = scn.nextInt();
				Integer a[] = new Integer[n];  //array object
				System.out.println("==ENTER "+n+" INTEGER ELEMENT==");
				for(int i =0; i<a.length;i++) {
					a[i]= new Integer(scn.nextInt());
				}
				System.out.println("==DISPLAYING USING EXTENDED-FOR==");
				for(Integer k: a) {
					System.out.print(k.toString()+" ");
				}
			}catch(Exception e) {
			 e.printStackTrace();
			}
		}
	}
}

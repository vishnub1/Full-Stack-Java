package test;
import java.util.*;
public class DemoArray3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		try(scn;){
			try {
				System.out.println("===Enter the number of product==");
				int n = Integer.parseInt(scn.nextLine());
				Product a[] = new Product[n];
				System.out.println("==Enter "+n+"Product==");
				for(int i = 0;i<a.length;i++) {
					System.out.println("Enter the PCode");
					String pC = scn.nextLine();
					System.out.println("Enter the PName");
					String pN = scn.nextLine();
					System.out.println("Enter the PPrice");
					float pP = Float.parseFloat(scn.nextLine());
					System.out.println("Enter the pQty");
					int pQ = Integer.parseInt(scn.nextLine());
					a[i] = new Product(pC, pN, pP, pQ);
				}//end of loop
				System.out.println("==Display using old for Loop==");
				for(int i = 0;i<a.length;i++) {
				System.out.println(a[i].toString()+" ");
			}
			System.out.println("==Display using Extended for==");
			for(Product k :a) {
				System.out.println(k.toString());
			}//end of loop
			System.out.println("==Display using Spliterator<T>==");
			Spliterator<Product>sp = Arrays.spliterator(a);
			sp.forEachRemaining((z)->
			{
				System.out.println(z.toString()+" ");
			});
		}catch(Exception e) {
			e.printStackTrace();
			}
		}
	}
}

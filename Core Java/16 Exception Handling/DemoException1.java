// DemoException1.java
package maccess;
import java.util.*;
public class DemoException1 extends Exception {
	public DemoException1(String msg) {
		super(msg);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the bsal 0f an employee :");
			int bSal = sc.nextInt(); //exception for non-int value input
			if(bSal<12000) {
				DemoException1 ob = new DemoException1("Invalid bSal...");
				throw ob; //throwing object reference onto catch block
			}
			float totSal = bSal+(0.93F*bSal)+(0.63F*bSal);
			System.out.println("Bsal :"+bSal);
			System.out.println("Total Sal :"+totSal);
		}catch(InputMismatchException ime) {
			System.out.println("Enter only onterger bsal..");
		}catch(DemoException1 ob) {
			System.out.println(ob.getMessage());
		}finally {
		sc.close();
		}
	}
}

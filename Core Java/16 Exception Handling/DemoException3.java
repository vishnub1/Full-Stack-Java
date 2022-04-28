package maccess;
import java.util.*;
public class DemoException3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the desg :");
			String desg = sc.nextLine().toUpperCase();
			Designation dsDesignation = new Designation();
			dsDesignation.verify(desg);
			System.out.println("Enter the Emid :");
			String eid = sc.nextLine();
			System.out.println("EmpDesg :"+desg);
			System.out.println("EmpID :"+eid);
		}catch(Designation ob) {
			System.out.println(ob.getMessage());
		}finally {
			sc.close();
		}
	}
}

package test;

import java.util.Scanner;

public class DemoRef1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Address ad = new Address();// con call without para
		Employee e = new Employee(ad);
		System.out.print("Enter the Empid\t\t:");
		e.eId=s.nextLine();
		System.out.print("Enter the Employee Name :");
		e.eName=s.nextLine();
		System.out.print("Enter the Employee Desg :");
		e.eDesg=s.nextLine();
		
		System.out.print("Enter the Hno\t :");
		e.ad.hNo=s.nextLine();
		System.out.print("Enter the sName\t :");
		e.ad.sName = s.nextLine();
		System.out.print("Enter the city\t :");
		e.ad.city=s.nextLine();
		System.out.print("Enter the Pincode :");
		e.ad.pinCode=s.nextInt();
		e.getEmployee();
		s.close();
	}
}


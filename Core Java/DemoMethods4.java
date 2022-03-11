import java.util.Scanner;

public class DemoMethods4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter EmpName\t: ");
		String empName = sc.nextLine();
		
		System.out.print("Enter EmpId\t: ");
		String empId =sc.nextLine();
		
		System.out.print("Enter EmpDesg\t: ");
		String empDesg = sc.nextLine();
		
		System.out.print("Enter BasicSal\t: ");
		double bSal = sc.nextDouble();
		
		
		if (bSal>=12000) {
			double totalSal = bSal+(0.93*bSal)+(0.63*bSal);	
		
		System.out.println("=====Employee Details======");
		System.out.println("Emp Name\t : "+empName);
		System.out.println("Emp ID\t\t : "+empId);
		System.out.println("Emp Desg\t : "+empDesg);
		System.out.println("Basic Salary\t : "+bSal);
		System.out.println("Total Sal\t : "+totalSal);
		}
		else {
			System.out.println("Invalid bSal...");
		}
	}

}

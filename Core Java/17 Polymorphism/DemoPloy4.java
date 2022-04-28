// Registration.java
package ImmutableClass;
public class Registration {
	private final String name,addr,dob;
	//creating constructor
	public Registration(String name,String addr,String dob) {
		this.name = name;
		this.addr = addr;
		this.dob = dob;
	}
	/* 'this' is used when we have same names in instance
	    variable and local variable */
	public String getName() {
		return name;
	}
	public String getAddr() {
		return addr;
	}
	public String getDob() {
		return dob;
	}
}


// DemoPoly4.java
package ImmutableClass;
import java.util.Scanner;
public class DemoPoly4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		try(scn;){
			System.out.println("Enter the name :");
			String name = scn.nextLine();
			System.out.println("Enter the addr");
			String addr = scn.nextLine();
			System.out.println("Enter the DOB");
			String dob = scn.nextLine();
			
			Registration ob = new Registration(name, addr, dob);
								//immutable object
			System.out.println("==Display Details==");
			System.out.println("Name :"+ob.getName());
			System.out.println("Addr :"+ob.getAddr());	
			System.out.println("Addr :"+ob.getDob());	
		}
	}
}

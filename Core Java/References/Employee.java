package test;

public class Employee {
	public String eId,eName,eDesg;
	public Address ad;
	public Employee(Address addr) {
		ad = addr;
	}
	public void getEmployee() {
		System.out.println("===Employee Data==");
		System.out.println("Emp Id :"+eId);
		System.out.println("Emp NAme :"+eName);
		System.out.println("Emp Desg :"+eDesg);
		ad.getAddress();  // method call
	}

}

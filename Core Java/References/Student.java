package test2;

public class Student {
	public String stuName,branch;
	public int rollNo;
	public Address ad;   //reference variable
	public Contact c;    // reference variable
	public Student(Address addr,Contact cont) {
		ad=addr;
		c=cont;
	}
	public void getStudent() {
		System.out.println("==student Data ==");
		System.out.println("stuName :"+stuName);
		System.out.println("Roll NO :"+rollNo);
		System.out.println("Branch :"+branch); 
		ad.getAddress();
		c.getContact();
	
	}
}

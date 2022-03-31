package test2;
import java.util.*;
public class Read {
	public void readStudent(Scanner sc, Student stu) {
		System.out.println("Enter the student Name:");
		stu.stuName = sc.nextLine();
		System.out.println("Enter the Roll no :");
		stu.rollNo =sc.nextInt();sc.nextLine();
		System.out.println("Enter the Branch:");
		stu.branch = sc.nextLine();
		System.out.println("Enter the HNO :");
		stu.ad.hNo = sc.nextLine();
		System.out.println("Enter the Area name:");
		stu.ad.SName=sc.nextLine();
		System.out.println("Enter the city name :");
		stu.ad.city= sc.nextLine();
		System.out.println("Enter the Pin code :");
		stu.ad.pinCode = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the mail ID :");
		stu.c.mailId = sc.nextLine();
		System.out.println("Enter the Phone No :");
		stu.c.phoneNo=sc.nextLong();
		
	}
}

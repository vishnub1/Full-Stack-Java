import java.util.Scanner;

public class DemoMethods2 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Username : ");
		String userName = s.nextLine();
		System.out.print("Enter the MailID : ");
		String mailId =s.nextLine();
		System.out.print("Enter the PhoneNo : ");
		long phoneNo=s.nextLong();
		
		System.out.println("====User Details====");
		System.out.println("UserName : "+userName);
		System.out.println("Mail ID : "+mailId);
		System.out.println("Phone NO : "+phoneNo);	
	}

}


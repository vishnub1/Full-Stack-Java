package maccess;
import java.util.Scanner;
public class DemoParseMethods {
	public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the PhoneNo:");
      long phNo = Long.parseLong(s.nextLine());
      //read in the form of String and convert into long
      System.out.println("Enter the MailId:");
      String mId = s.nextLine();
      System.out.println("PhoneNo:"+phNo);
      System.out.println("MailId:"+mId);
      s.close();
	}
}

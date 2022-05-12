/*
Construct the following tables:
    Bank(accno,custname,balance,acctype)
    CustDetails(accno,addr,mid,phno)
                       Primary Key : accno
*/
package test;
import java.util.*;
import java.sql.*;
public class DBCon6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(sc;) {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","redhat");
			
			System.out.println("Enter the Account No:");
			long accNo = Long.parseLong(sc.nextLine());
			System.out.println("Enter the CustName:");
			String custName = sc.nextLine();
			System.out.println("Enter the Balance:");
			float bal = Float.parseFloat(sc.nextLine());
			System.out.println("Enter the Account Type:");
			String accType = sc.nextLine();
			System.out.println("Enter teh Address:");
			String addr = sc.nextLine();
			System.out.println("Enter the MailID");
			String mId = sc.nextLine();
			System.out.println("Enter the Phone NO:");
			long phNo = sc.nextLong();

			CallableStatement cs = con.prepareCall("{call CreateAccount(?,?,?,?,?,?,?)}");//compilation
			cs.setLong(1,accNo);
			cs.setString(2,custName);
			cs.setFloat(3,bal);
			cs.setString(4,accType);
			cs.setString(5,addr);
			cs.setString(6,mId);
			cs.setLong(7,phNo);

			cs.execute();//Execution
			System.out.println("Procedure Excecuted Successfully..");
		}catch(Exception e) {e.printStackTrace();}
	}
}

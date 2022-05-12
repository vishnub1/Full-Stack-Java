/* Consider DB Table : UserReg44(uname, pword, fname, lname, addr, mid, phno)
                   Primary Key : uname and pword

Construct JDBC Application to perform the following operation based on user
choice:
      1.Register
      2.Login
          =>read 'uname and pword' and perform login process
          =>Display:
              welcome user : firstName
      3.ViewProfile 
          =>read 'uName and pWord' and display:
             fName,lName,addr,mid,phno
 */
package test;
import java.util.*;
import java.sql.*;
public class DBCon4 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:orcl","system","redhat");
			Scanner sc = new Scanner(System.in);
			System.out.println("====choice====");
			System.out.println("1.Resister\n2.Login\n3.ViewProfile");
			System.out.println("Enter the Choice:");
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1: //Register
				PreparedStatement ps1 = con.prepareStatement("insert into UserReg44 values(?,?,?,?,?,?,?)");
				System.out.println("Enter the UserName:");
				String uName = sc.nextLine();
				System.out.println("Enter the PassWord:");
				String pWord = sc.nextLine();
				System.out.println("Enter the FirstName:");
				String fName = sc.nextLine();
				System.out.println("Enter the LastName:");
				String lName = sc.nextLine();
				System.out.println("Enter the Address:");
				String addr = sc.nextLine();
				System.out.println("Enter the MailId:");
				String mId = sc.nextLine();
				System.out.println("Enter the PhNo:");
				long phNo = Long.parseLong(sc.nextLine());

				ps1.setString(1, uName);
				ps1.setString(2, pWord);
				ps1.setString(3, fName);
				ps1.setString(4, lName);
				ps1.setString(5, addr);
				ps1.setString(6, mId);
				ps1.setLong(7, phNo);

				int k = ps1.executeUpdate();//execution
				if(k>0) {
					System.out.println("User Resister Successfully..");
				}
				break;
			case 2://Login
				PreparedStatement ps2 = con.prepareStatement("select * from UserReg44 where uname=? and pword=?");
				System.out.println("Enter the User Name");
				String uName1 = sc.nextLine();
				System.out.println("Enter the PassWord:");
				String pWord1 = sc.nextLine();
				ps2.setString(1, uName1);
				ps2.setString(2, pWord1);
				ResultSet rs1 = ps2.executeQuery();//execution
				if(rs1.next()) {
					System.out.println("Login Successfull..");
					System.out.println("Welcome user :"+rs1.getString(3));
				}else {
					System.out.println("invalid login");
				}
				break;
			case 3://ViewProfile
				PreparedStatement ps3 = con.prepareStatement("select * from UserReg44 where uname=? and pword=?");
				System.out.println("Enter the userName");
				String uName2 = sc.nextLine();
				System.out.println("Enter the PassWord:");
				String pWord2 = sc.nextLine();
				ps3.setString(1,uName2);
				ps3.setString(2,pWord2);
				ResultSet rs2 = ps3.executeQuery();//execution
				if(rs2.next()) {
					System.out.println("====User Details====");
					System.out.println("First Name :"+rs2.getString(3)+
							"\nLastName :"+rs2.getString(4)+"\nAddress :"+rs2.getString(5)
							+"\nMailId :"+rs2.getString(6)+"\nPhNo :"+rs2.getLong(7));
				}else {
					System.out.println("Invalid Login Process...");
				}
				break;
			default:
				System.out.println("Invalid choice");
			}
			con.close();
			sc.close();
		}catch(Exception e) {e.printStackTrace();}
	}
}

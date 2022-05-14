//Construct JDBC Application to execute OUT-Parameter Procedure
package test;
import java.util.*;
import java.sql.*;
public class DBCon7 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
	           Connection con = DriverManager.getConnection
	         	  ("jdbc:oracle:thin:@localhost:1521:orcl","system","redhat");


			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the accNo:");
			long accNo = sc.nextLong();

			CallableStatement cs = con.prepareCall
					("{call RetrieveDetails(?,?,?,?,?,?,?)}");
			cs.setLong(1,accNo);
			cs.registerOutParameter(2,Types.VARCHAR);
			cs.registerOutParameter(3,Types.FLOAT);
			cs.registerOutParameter(4,Types.VARCHAR);
			cs.registerOutParameter(5,Types.VARCHAR);
			cs.registerOutParameter(6,Types.VARCHAR);
			cs.registerOutParameter(7,Types.BIGINT);

			cs.execute();//execution

			System.out.println("Procedure Executed Successfully...");
			System.out.println("AccNo:"+accNo);
			System.out.println("CustName:"+cs.getString(2));
			System.out.println("Balance:"+cs.getFloat(3));
			System.out.println("AccType:"+cs.getString(4));
			System.out.println("Address:"+cs.getString(5));
			System.out.println("MailId:"+cs.getString(6));
			System.out.println("PhNo:"+cs.getLong(7));
			sc.close();
		}catch(Exception e) {e.printStackTrace();}
	}
}

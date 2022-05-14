package test;
import java.util.*;
import java.sql.*;
public class DBCon8 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection
          	  ("jdbc:oracle:thin:@localhost:1521:orcl","system","redhat");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Account NO:");
            long accNo = sc.nextLong();
            
            CallableStatement cs = con.prepareCall ("{call ?:=getBalance(?)}");//Compilation
            cs.registerOutParameter(1,Types.FLOAT);
            cs.setLong(2, accNo);
            cs.execute();
            
            System.out.println("Accno ::"+accNo);
            System.out.println("Balance :"+cs.getFloat(1));
            sc.close();
		}catch(Exception e) {e.printStackTrace();}
	}
}

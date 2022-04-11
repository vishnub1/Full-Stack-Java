package test;
import java.sql.*;
import java.util.*;
public class DBCon2 {
	public static void main(String[] args) {
        try {
        	Scanner s = new Scanner(System.in);
        	System.out.println("Enter the EmpId:");
        	String eId = s.nextLine();
        	System.out.println("Enter the EmpName:");
        	String eName = s.nextLine();
        	System.out.println("Enter the EmpDesg:");
        	String eDesg = s.nextLine();
        	System.out.println("Enter the EmpbSal:");
        	int bSal = s.nextInt();
        	Class.forName("oracle.jdbc.driver.OracleDriver");//step-1
        	Connection con = DriverManager.getConnection
        	  ("jdbc:oracle:thin:@localhost:1521:xe","system","manager");//step-2
        	Statement stm = con.createStatement();//step-3
        	int k = stm.executeUpdate
        	("insert into Employee44 values('"+eId+"','"+eName+"','"+eDesg
        			+"',"+bSal+")");//step-4
        	if(k>0)
        	{
        		System.out.println("Employee Details inserted Successfully...");
        	}
        	con.close();//step-5
        	s.close();
        }catch(Exception e) {e.printStackTrace();}
	}
}

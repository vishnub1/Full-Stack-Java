package test;
import java.util.*;
import java.sql.*;
public class DBCon11 {
	public static void main(String[] args) {
       try {
    	   Scanner s = new Scanner(System.in);
    	   System.out.println("Enter the EmpId:");
    	   String eId = s.nextLine();
    	   
    	   Class.forName("oracle.jdbc.driver.OracleDriver");
        	Connection con = DriverManager.getConnection
        	  ("jdbc:oracle:thin:@localhost:1521:orcl","system","redhat");
        	
        	CallableStatement cs = con.prepareCall
        			("{call ?:=getTotSal(?)}");
        	cs.registerOutParameter(1,Types.FLOAT);
        	cs.setString(2,eId);
        	cs.execute();
        	System.out.println("EmpId:"+eId);
        	System.out.println("TotSal:"+cs.getFloat(1));
    	   s.close();
       }catch(Exception e) {e.printStackTrace();}
	}
}

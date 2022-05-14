package test;
import java.util.*;
import java.sql.*;
public class DBCon10 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:orcl","system","redhat");

			Scanner s = new Scanner(System.in);
			System.out.println("Enter the EmpId:");
			String eId = s.nextLine();
			CallableStatement cs = con.prepareCall
					("{call RetrieveEmployee(?,?,?,?,?,?,?,?,?,?,?)}");
			cs.setString(1,eId);
			cs.registerOutParameter(2,Types.VARCHAR);
			cs.registerOutParameter(3,Types.VARCHAR);
			cs.registerOutParameter(4,Types.VARCHAR);
			cs.registerOutParameter(5,Types.VARCHAR);
			cs.registerOutParameter(6,Types.VARCHAR);
			cs.registerOutParameter(7,Types.INTEGER);
			cs.registerOutParameter(8,Types.VARCHAR);
			cs.registerOutParameter(9,Types.BIGINT);
			cs.registerOutParameter(10,Types.INTEGER);
			cs.registerOutParameter(11,Types.FLOAT);
			cs.execute();
			
			System.out.println("EmpId:"+eId);
        	System.out.println("EmpName:"+cs.getString(2));
        	System.out.println("EmpDesg:"+cs.getString(3));
        	System.out.println("HNO:"+cs.getString(4));
        	System.out.println("SName:"+cs.getString(5));
        	System.out.println("City:"+cs.getString(6));
        	System.out.println("PinCode:"+cs.getInt(7));
        	System.out.println("MailId:"+cs.getString(8));
        	System.out.println("PhNO:"+cs.getLong(9));
        	System.out.println("bSal:"+cs.getInt(10));
        	System.out.println("TotSal:"+cs.getFloat(11));
    	   s.close();
		}catch(Exception e) {e.printStackTrace();}
	}
}

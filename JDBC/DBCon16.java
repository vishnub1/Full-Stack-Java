package test;
import java.sql.*;
public class DBCon16 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
         	Connection con = DriverManager.getConnection
         	  ("jdbc:oracle:thin:@localhost:1521:orcl","system","redhat");
         	
         	Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
         	ResultSet rs = stm.executeQuery("select * from Employee");
         	System.out.println("===Employee Details reverse===");
         	rs.afterLast();
         	while(rs.previous()) {
         		System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+
         							rs.getString(3)+"\t"+rs.getInt(4));
         	}
		}catch(Exception e) {e.printStackTrace();}
	}
}

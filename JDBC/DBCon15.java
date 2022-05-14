//Case-2 : Batch processing using 'PreparedStatement'
package test;
import java.sql.*;
public class DBCon15 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:orcl","system","redhat");

			PreparedStatement ps = con.prepareStatement("insert into book values(?,?,?,?,?)");
			ps.setString(1,"A222");
			ps.setString(2,"C++");
			ps.setString(3,"B-Swami");
			ps.setFloat(4,310);
			ps.setInt(5,10);
			ps.addBatch();
			ps.setString(1,"A666");
			ps.setString(2,"C#");
			ps.setString(3,"PQR");
			ps.setFloat(4,3455);
			ps.setInt(5,12);
			ps.addBatch();

			int k[] = ps.executeBatch();
			for(int i=0;i<k.length;i++){
				System.out.println("Updated Successfully...");
			}
			
			ps.clearBatch();
			
		}catch(Exception e) {e.printStackTrace();}
	}
}

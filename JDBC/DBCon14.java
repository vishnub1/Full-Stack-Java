//Case-1 : Batch processing using 'Statement'
package test;
import java.sql.*;
public class DBCon14 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","redhat");
			
			Statement stm = con.createStatement();
			stm.addBatch("INSERT INTO EMPLOYEE VALUES('A222','REF','ME',14000)");
			stm.addBatch("INSERT INTO BOOK VALUES('A444','C-JAVA','XYZ',1200,12)");
        	stm.addBatch("UPDATE EMPLOYEE SET SAL=40000 WHERE ENO='A123'");
        	int k[] = stm.executeBatch();
        	for(int i =0;i<k.length;i++) {
        		System.out.println("Updated Sucessfull..");
        	}
        	stm.clearBatch();
		}catch(Exception e) {e.printStackTrace();}
	}
}

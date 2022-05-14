package test;
import java.util.*;
import java.sql.*;
public class DBCon12 {
	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(System.in);
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:orcl","system","redhat");

			System.out.println("Commit Status : "+con.getAutoCommit());
			con.setAutoCommit(false);//Stopped auto commit operation
			System.out.println("Commit Status : "+con.getAutoCommit());

			PreparedStatement ps1 = con.prepareStatement("select * from Bank where accno=?");//Compilation
			PreparedStatement ps2 = con.prepareStatement("update Bank set balance=balance+? where accno=?");//Compilation

			Savepoint sp = con.setSavepoint();

			System.out.println("Enter the homeAccNo(Raj):");
			long hAccNo=s.nextLong();
			ps1.setLong(1,hAccNo);
			ResultSet rs1 = ps1.executeQuery();//Execution
			if(rs1.next()) {
				float bal = rs1.getFloat(3);//Retrieving Balance
				System.out.println("Enter the bAccNo:");
				long bAccNo = s.nextLong();
				ps1.setLong(1, bAccNo);
				ResultSet rs2 = ps1.executeQuery();//Execution
				if(rs2.next()) {
					System.out.println("Enter the amt to be transferred:");
					int amt = s.nextInt();
					if(amt<=bal) {
						ps2.setInt(1,-amt);
						ps2.setLong(2,hAccNo);
						int p = ps2.executeUpdate();//Execution

						ps2.setInt(1,amt);
						ps2.setLong(2,bAccNo);
						int q = ps2.executeUpdate();//Execution

						if(p==1 && q==1) {
							con.commit();//Update from Buffers to DataBase
							System.out.println("Transaction Successfully....");
						}else {
							con.rollback(sp);
							System.out.println("Transaction Failed....");
						}
					}else {
						System.out.println("InSufficient Fund...");
					}
				}else {
					System.out.println("Invalid bAccNo..."); 
				}
			}else {
				System.out.println("Invalid homeAccNo...");
			}
			s.close();
		}catch(Exception e) {e.printStackTrace();}
	}
}

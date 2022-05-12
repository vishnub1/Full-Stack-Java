package test;
import java.util.*;
import java.sql.*;
public class DBCon5 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");  //loading driver
			Connection con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:orcl","system","redhat");//creating connection

			Scanner sc = new Scanner(System.in);
			System.out.println("==== choice====");
			System.out.println("1.Update Book\n2.Delete Book");
			System.out.println("Enter the choice:");
			int choice = Integer.parseInt(sc.nextLine());
			PreparedStatement ps1 = con.prepareStatement("select * from Book where bcode=?");//compilation
			switch (choice) {	
			case 1://Update Book
				System.out.println("Enter the Book Code:");
				String bCode1 = sc.nextLine();
				ps1.setString(1, bCode1);
				ResultSet rs1 = ps1.executeQuery();//execution
				if(rs1.next()) {
					System.out.println("old price :"+rs1.getFloat(4));
					System.out.println("old qty :"+rs1.getInt(5));
					System.out.println("Enter the new Price:");
					float price = Float.parseFloat(sc.nextLine());
					System.out.println("Enter the new QTY");
					int qty = Integer.parseInt(sc.nextLine());

					PreparedStatement ps2 = con.prepareStatement
							("update Book set bprice=?,bqty=bqty+? where bcode=?");
					ps2.setFloat(1,price);
					ps2.setInt(2, qty);
					ps2.setString(3,bCode1);//execution
					int k = ps2.executeUpdate();
					if(k>0) {
						System.out.println("Book details Updated For "+bCode1);
					}
				}else {
					System.out.println("Invalid book code.....");	
				}
				break;
			case 2://Delete Book
				System.out.println("Enter the bCode:");
				String bCode2 = sc.nextLine();
				ps1.setString(1, bCode2);
				ResultSet rs2 = ps1.executeQuery();
				if(rs2.next()) {
					PreparedStatement ps3 = con.prepareStatement("delete from Book where bcode=?");
					ps3.setString(1, bCode2);
					int k = ps3.executeUpdate();//execution
					if(k>0) {
						System.out.println("Book Details deleted for "+bCode2);
					}
				}else {
					System.out.println("Invalid Book Code");
				}
				break;
			default:
				System.out.println("Invalid Book Code..");
				break;
			}
			con.close();
			sc.close();
		}catch(Exception e) {e.printStackTrace();}
	}
}

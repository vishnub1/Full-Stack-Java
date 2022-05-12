//Assignment-1:
//Consider DB Table : Book44(bcode,bname,bauthor,bprice,bqty)

//Construct JDBC Application to perform the following operation based on user
//choice:
//      1.AddBookDetails
//      2.ViewsBooks 

package test;
import java.util.*;
import java.sql.*;
public class DBCon3 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:orcl","system","redhat");
			Scanner sc = new Scanner(System.in);
			System.out.println("====choice====");
			System.out.println("1.AddBookDetails\n2.ViewBooks");
			int choice = Integer.parseInt(sc.nextLine());
			
			switch (choice) {
			case 1:	//AddBookDetails
				PreparedStatement ps1 = con.prepareStatement("insert into Book values(?,?,?,?,?)"); //PreparedStatement
				
				System.out.println("Enter the BCode:");
				String bCode = sc.nextLine();
				System.out.println("Enter the BName:");
				String bName = sc.nextLine();
				System.out.println("Enter the BAuhtor");
				String bAut = sc.nextLine();
				System.out.println("Enter the BPrice");
				Float bPrice = sc.nextFloat();
				System.out.println("Book QTY");
				int bQty = sc.nextInt();
				
				ps1.setString(1,bCode);
				ps1.setString(2,bName);
				ps1.setString(3,bAut);
				ps1.setFloat(4,bPrice);
				ps1.setInt(5,bQty);
				
				int k = ps1.executeUpdate();//execution
				if(k>0) {
					System.out.println("Book inserted Successfully..");
				}
				break;
				
			case 2: //ViewBookDetails
				PreparedStatement ps2 = con.prepareStatement("select * from Book");
				ResultSet rs = ps2.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getNString(1)+"\t"+rs.getString(2)+"\t"
							+rs.getString(3)+"\t"+rs.getFloat(4)+"\t"+rs.getInt(5));
				}
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			con.close();
			sc.close();
		}catch(Exception e) {e.printStackTrace();}
	}
}

package test;
import java.util.*;
import java.sql.*;
public class ConnectionPooling {
	public String url,uName,pWord;
	public ConnectionPooling(String url,String uName,String pWord) {
		this.url = url;
		this.uName = uName;
		this.pWord = pWord;
	}
	public Vector<Connection> v = new Vector<Connection>();
	//vector holding Connection Objects
	public void createConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			while(v.size()<5) {
				System.out.println("Connection Pool is not Full ..");
				Connection con = DriverManager.getConnection(url,uName,pWord);
				v.add(con);//adding the connection to vector
				System.out.println(con);
			}
			if(v.size()==5) {
				System.out.println("ConnectionPool is full..");
			}
		}catch(Exception e) {e.printStackTrace();}		
	}
	public synchronized Connection useConnection() {
		Connection con = v.firstElement();//Getting the first connection
		v.removeElementAt(0);//removing the Connection from pool
		return con;
	}
	public synchronized void addConnectionToPool(Connection con) {
		v.addElement(con);//adding connection to pool
		System.out.println("Connection added back to the pool successfully..");
	}
}




package test;
import java.sql.*;
public class DBCon13 {
	public static void main(String[] args) {
		try {
			ConnectionPooling cp = new ConnectionPooling
					("jdbc:oracle:thin:@localhost:1521:orcl","system","redhat");
			cp.createConnection();//creating 5 connection object
			System.out.println("Pool size:"+cp.v.size());
			System.out.println("= = = user 1= = =");
			Connection con = cp.useConnection();
			System.out.println("User Using :"+con);
			System.out.println("Pool Size :"+cp.v.size());
			System.out.println("==user 1 returned the connection ==");
			cp.addConnectionToPool(con);
			System.out.println("pool Size :"+cp.v.size());
			System.out.println("==connection from the pool");
			cp.v.forEach((k)->{
				System.out.println(k);
			});
		}catch(Exception e) {e.printStackTrace();}
	}
}

package maccess;

import java.util.StringJoiner;

public class DemoJoiner{
	public static void main(String[] args) {
		StringJoiner sj1 = new StringJoiner("/");  // obg1 StringJoiner()
		sj1.add("12");
		sj1.add("oct");
		sj1.add("1999");
		System.out.println("DOJ :"+sj1.toString());
		StringJoiner sj2=new StringJoiner("-");				// obg2 StringJoiner()
		sj2.add("Khandoba Mal");
		sj2.add("Bhosari");
		sj2.add("Pune");
		sj2.add("411039");
		System.out.println("Address:"+sj2.toString());
		sj1.merge(sj2);
		System.out.println("DOJ & Address: "+sj1);
	}
}
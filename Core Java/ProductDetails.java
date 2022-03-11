import java.util.Scanner;

public class ProductDetails {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Product Code : ");
	String pCode = sc.nextLine();
	System.out.print("Product Name : ");
	String pName = sc.nextLine();
	System.out.print("Product Price : ");
	int pPrice = sc.nextInt();
	System.out.print("Product Qty : ");
	double pQty = sc.nextDouble();
	
	System.out.println("\n34=====Book Details=====");
	System.out.println("Product Code : "+pCode);
	System.out.println("Product Name : "+pName);
	System.out.println("Product Price : "+pPrice);
	System.out.println("Product Qty : "+pQty);
	}
}

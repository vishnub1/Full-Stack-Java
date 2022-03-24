package test;

import java.util.Scanner;

public class Read {
	public Product p;	// Reference Variable
	public Read(Product prod) {
		p=prod;           // Initializing reference variable
	}
	public void readProduct(Scanner s) {
		System.out.println("Enter the Product code:");
		p.pCode =s.nextLine();
		System.out.println("Enter the Product Name");
		p.pName = s.nextLine();
		System.out.println("Enter the Product Price :");
		p.pPrice = s.nextFloat();
		System.out.println("Enter the product Qty :");
		p.pQty=s.nextInt();
	}

}

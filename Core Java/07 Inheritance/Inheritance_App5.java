.//Product.java
  package test;
public class Product {
	public String pCode,pName;
	public float pPrice;
	public int pQty;
	public void getProduct() {
		System.out.println("==Product Details==");
		System.out.println("PCode :"+pCode);
		System.out.println("Product Name :"+pName);
		System.out.println("Product Price :"+pPrice);
		System.out.println("Product Qty :"+pQty);
	}
}

//Read.java
package test;
import java.util.Scanner;
public class Read extends Product {
	public void readProduct(Scanner sc) {
		System.out.println("Enter the Product code:");
		super.pCode = sc.nextLine();
		System.out.println("Enter the Product Name :");
		super.pName = sc.nextLine();
		System.out.println("Enter the Product Price");
		super.pPrice = sc.nextFloat();
		System.out.println("Enter the Product Qty :");
		super.pQty = sc.nextInt();
	}
}


//Display.java
package test;
	public class Display extends Read{
		public void dispplayProduct() {
			super.getProduct();
	}
}

//DemoInheritance5.java
package macccess;
import test.*;
import java.util.*;
public class DemoInheritance5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Display d = new Display();
		d.readProduct(sc);
		d.dispplayProduct();
		sc.close();
	}
}


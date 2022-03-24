package test;

import java.util.Scanner;

public class DemoRef2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Product p = new Product();
		Read r = new Read(p);     //con call with ref para
		r.readProduct(s); // method call with ref as parameter
		Display d= new Display(p);  // con call with ref as para
		d.displayProduct();
		s.close();
	}

}

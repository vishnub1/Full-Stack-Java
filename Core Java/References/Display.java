package test;

public class Display {
	public Product p;
	public Display(Product prod) {
		p=prod;   // Initializing reference variable
	}
	public void displayProduct() {
		p.getProduct();
	}

}

package object;
import test.Product;
public class DemoArray4 {
	public static void main(String[] args) {
		Object o[] = new Object[3];
		o[0] = new Integer(2);
		o[1] = new String("Vishnu");
		o[2] = new Product("A11","Sprite",45,200);
		System.out.println("==Display from Object Array==");
		for(Object k:o) {
			System.out.println(k.toString());
		}
	}
}

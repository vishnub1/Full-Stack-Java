
public class DemoVariables {
	int a=10; 			// instance variable memory in object
	static int b=20;	// static variable memory in class
	
	public static void main(String[] args) {
		
		int c=30;     	// local variable memory in method_frame
		
		DemoVariables ob = new DemoVariables();
		System.out.println("The value a :"+ob.a);  
		System.out.println("The value b :"+DemoVariables.b);
		System.out.println("The value c :"+c);
	}

}

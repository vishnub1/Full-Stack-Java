
public class DemoMethods1 {
	int a=10;		      //Primitive DataType Instance Variable memory in object
	static int b=20;      //primitive DataType Static Variable memory in class
	
	static void m1() {    //static method memory in class
		System.out.println("======m1()======");
	//	System.out.println("The value of a :"+a);
		System.out.println("The value of b :"+b);
	} 
	void m2() { 			//instance methods memory on object
	System.out.println("======m2()======");
	System.out.println("The value of a :"+a);
	System.out.println("The value of b :"+b);
	
	}
	public static void main(String[] args) {
		DemoMethods1.m1();
		DemoMethods1 ob =new DemoMethods1();
		ob.m2();		
	}
}

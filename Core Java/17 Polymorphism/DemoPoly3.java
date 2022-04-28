// SubClass.java
package test;
public class SubClass {
	private static class SubClass1{
		public void m1(int x) {
			System.out.println("===m1===");
			System.out.println("The value x:"+x);
		}
	}//inner_class
	private class SubClass2{
		public void m2(int y) {
			System.out.println("===m2(y)===");
			System.out.println("The value y :"+y);
		}
	}//inner_class
	public class Access{
		public SubClass1 ob1 = new SubClass1();
		public SubClass2 ob2 = new SubClass2();
		public void access() {
			ob1.m1(123);
			ob2.m2(234);
		}
	}
}

// DemoPloy3.java
package test;
public class DemoPoly3 {
	public static void main(String[] args) {
		SubClass ob = new SubClass();  //outer_sublcass object
		SubClass.Access  obj = ob.new Access();
		obj.access();
	}
}

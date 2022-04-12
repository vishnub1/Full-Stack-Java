// SubClass1.java
package test;
public class SubClass1 {
	public int a =10;
	public static int b =20;
	public void m1() {
		class SubClass2{
			public void m2() {
				System.out.println("===Instance method m1()===");
				System.out.println("The value a:"+a);
				System.out.println("The value b:"+b);
			}
			public static void m22() {
				System.out.println("===Static method m22()===");
//				System.out.println("The value a :"+a);
				System.out.println("The value b :"+b);
			}
		}//Local_inner_class
		SubClass2 ob = new SubClass2();
		ob.m2();
		SubClass2.m22();
	}
	public static void m11() {
		class SubClass22{
			public void dis2() {
				System.out.println("==Instance method di2()==");
//				System.out.println("The value a:"+a);
				System.out.println("The value b:"+b);
			}
			public static void dis22() {
				System.out.println("==Static method dis22()==");
//				System.out.println("The value a:"+a);
				System.out.println("The value b :"+b);
			}
		}//local_inner_class
		SubClass22 ob22 = new SubClass22();  //local_inner_class_obj
		ob22.dis2();
		SubClass22.dis22();
	}
}



// DemoInnerClass3.java
package test;
public class DemoInnerClass3 {
		public static void main(String[] args) {
			SubClass1 ob1 = new SubClass1();
			ob1.m1();
			SubClass1.m11();
		
		}

	}

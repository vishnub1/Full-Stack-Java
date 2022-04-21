// SubClass.java
package test;
public class SubClass {
   public abstract static class AClass1{
      public abstract void m1(int x);
 }//InnerAbstractClass
 public abstract class AClass2{
    public abstract void m2(int y);
  }//InnerAbstractClass
}


//ITest.java
package test;
public interface ITest {
	public abstract static class AClass1{
		public abstract void m1(int x);
	}
}


// AClass.java
package test;
public class AClass {
	public abstract static class AClass1{
		public abstract void m1(int x);
	}//innerabstract class
	public abstract class AClass2{
		public abstract void m2(int y);
	}//inner abstract class
}//outer abstract class


// DemoInnerAbstract.java(main class)
package maccess;
import test.*;
public class DemoInnerAbstract {
	public static void main(String[] args) {
		System.out.println("==Inner abstract classes in class");
		//anonymous innerclass
		SubClass.AClass1 ob1 = new SubClass.AClass1() {
			@Override
			public void m1(int x) {
			System.out.println("x:"+x);
			}
		};
		ob1.m1(123);
		SubClass ob = new SubClass();  //outer class object
		//anonymous innerclass
		SubClass.AClass2 ob2 = ob.new AClass2() {
			@Override
			public void m2(int y) {
				System.out.println("y:"+y);
			}
		};
		ob2.m2(222);
		System.out.println("==inner Abstract classes in interface==");
		ITest.AClass1 ob3 = new ITest.AClass1() {
			@Override
			public void m1(int x) {
				System.out.println("x:"+x);
			}
		};
		ob3.m1(333);
		System.out.println("Inner abstract classes in abstract class");
		AClass.AClass1 ob4 = new AClass.AClass1() {
			@Override
			public void m1(int x) {
				System.out.println("x:"+x);
			}
		};
		ob4.m1(444);
		AClass ob11 = new AClass() {};  //outer class object
		AClass.AClass2 ob5 = ob11.new AClass2() {
			
			@Override
			public void m2(int y) {
				System.out.println("y :"+y);
			}
		};
		ob5.m2(555);
	}
}

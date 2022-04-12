// ITest.java
package test;
public interface ITest {
	public abstract void m1(int x);
	void m2(int y);
}
// anonymous method need not to write access modifiers and
// abstract keyword


// Create.java
package test;
public class Create {
	public static ITest getRef(){
		return new ITest() {	
			@Override
			public void m1(int x) {
				System.out.println("==m1(x)===");				
				System.out.println("The value x:"+x);
			}
			@Override
			public void m2(int y) {
				System.out.println("==m2(y)==");
				System.out.println("The value y:"+y);
			}
		};
	}
}


// Creation2.java
package maccess;
import test.*;
public class Creation2 {
	public static void main(String[] args) {
		ITest ob = Create.getRef();  // creating object and getting the references
		ob.m1(123);
		ob.m2(222);
	}
}

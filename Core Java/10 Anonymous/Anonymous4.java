// ITest.java
package creation;
public interface ITest {
	public abstract void m1(int x);
}


// Create.java
package creation;
public class Create {
	public static ITest getRef() 
	{
		class IClass implements ITest {
			public void m1(int x) {
				System.out.println("==m1(x)==");
				System.out.println("The value x:"+x);
			}
		}
		return new IClass();  //returning InnerClass Object reference
	}
}


// DemoCreation.java
package creation;
public class DemoCreation {
	public static void main(String[] args) {
		ITest ob = Create.getRef();
		ob.m1(1223);
	}
}

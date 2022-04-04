// PClass.java
package test;

public class PClass {
	public PClass(int x){
		System.out.println("==PClass Constructor");
		System.out.println("The Value X:"+x);
	}
}

// CClass.java
package test;

public class CClass extends PClass {
	public CClass(int k) {
		super(k);
		System.out.println("==CClass constructor");
		System.out.println("The Value of K :"+k);
	}
}

// DemoInheritance3.java
//Parameterized constructor from the ParentClass/SuperClass

package maccess;
import test.*;
public class DemoInheritance3 {
	public static void main(String[] args) {
		CClass ob = new CClass(123);
	}
}

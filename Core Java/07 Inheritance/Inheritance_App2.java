
PClass.java
package test;
public class PClass {
	public PClass() {
		System.out.println("==Pclass constructor");
	}
}

CClass.java
package test;
public class CClass extends PClass {
	public CClass() {
		System.out.println("== Child class Constructor");
	}
}

//Case-2 : Constructors from the ParentClass/SuperClass


// InheritancDemo2.java
package maccess;
import test.CClass;
public class InheritancDemo2 {
	public static void main(String[] args) {
		CClass ob = new CClass();
	}
}

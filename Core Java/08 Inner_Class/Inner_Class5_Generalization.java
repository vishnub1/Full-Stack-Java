// PClass.java
package InnerClass4;
public class PClass {
	public void m1(int x) {
		System.out.println("===PClass m1(x)===");
		System.out.println("The value x:"+x);
	}
	public void m2(int y) {
		System.out.println("===PClass m2(y)");
		System.out.println("The value y:"+y);
	}
}


// CClass.java
package InnerClass4;
public class CClass extends PClass {
	public void m1(int x) {
		System.out.println("===CClass m1(x)===");
		System.out.println("The vaalue x:"+x);
	}
	public void m3(int z) {
		System.out.println("===PClass m3(z)");
		System.out.println("The value z :"+z);
	}
}


package InnerClass4;
public class Generalization {
	public static void main(String[] args) {
		PClass ob = new CClass();
		ob.m1(1233);
		ob.m2(231);
	}
}

// Generalization.java(main class)
package InnerClass4;
public class Generalization {
	public static void main(String[] args) {
		PClass ob = new CClass();
		ob.m1(1233);
		ob.m2(231);
	}
}


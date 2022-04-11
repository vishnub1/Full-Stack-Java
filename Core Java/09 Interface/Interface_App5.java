//project name :: Interface_App5
// package name ::  test

// IArithmetic.java
package test;
public interface IArithmetic {
	public abstract void calculate(int x,int y);
}

// Addition.java
package test;
public class Addition implements IArithmetic {
		public void calculate(int x,int y) {
			System.out.println("Sum :"+(x+y));
		}
}

// Substraction.java
package test;
public class Substraction {
	public void calculate(int x,int y) {
		System.out.println("Sub :"+(x-y));
	}
}

// Multiplication.java
package test;
public class Multiplication {
	public void calculate (int x,int y) {
		System.out.println("Multiplication :"+(x*y));
	}
}

// Division.java
package test;
public class Division implements IArithmetic {
	public void calculate(int x,int y) {
		System.out.println("Division :"+(x/y));
	}
}

// ModuloDivision.java
package test;
public class ModuloDivision {
	public void calculate(int x,int y) {
		System.out.println("ModDiv :"+(x%y));
	}
}

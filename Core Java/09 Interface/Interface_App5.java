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


//package :: maccess
// DemoInterface5.java

package maccess;
import test.*;
import java.util.*;
public class DemoInterface5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value 1");
		int v1 = sc.nextInt();
		System.out.println("Enter the value 2");
		int v2 = sc.nextInt();
		System.out.println("===choice===");
		System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div\n5.ModDiv");
		System.out.println("Enter the choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			Addition ad = new Addition();
			ad.calculate(v1, v2);
			break;
		case 2:
			Substraction sb = new Substraction();
			sb.calculate(v1, v2);
			break;
		case 3:
			Multiplication mp = new Multiplication();
			mp.calculate(v1, v2);
			break;
		case 4:
			Division dv = new Division();
			dv.calculate(v1, v2);
			break;
		case 5:
			ModuloDivision md = new ModuloDivision();
			md.calculate(v1, v2);
			break;
		default:
			System.out.println("Invalid choice 🙄🤦‍♂️");
		}
	}
}


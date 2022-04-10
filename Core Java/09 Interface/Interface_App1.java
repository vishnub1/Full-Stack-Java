// IArithmetic.java
package test;
public interface IArithmetic {
	public abstract void calculate(int x,int y);
}
/*
package test;
public interface IArithmetic {
    void calculate(int x,int y);    we can write also.
}
*/



//Addition.java
package test;
public class Addition implements IArithmetic{
	public void calculate(int x,int y) {
		System.out.println("Sum :"+(x+y));
	}
}


// DemoInterface.java
package maccess;
import java.util.*;
import test.*;
public class DemoInterface {
	public static void main(String[] args) {
		//Arithmetic ob = new IArithmetic();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x:");
		int x= sc.nextInt();
		System.out.println("Enter the value of y:");
		int y = sc.nextInt();
		Addition ad = new Addition();
		ad.calculate(x, y);
		sc.close();
	}
}

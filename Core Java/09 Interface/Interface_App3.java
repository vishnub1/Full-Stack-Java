// IComparable.java
package test;
public interface IComparable {
	public abstract int compareTo(int x,int y);
}


// Greater.java
package test;
public class Greater implements IComparable {
	public int compareTo(int x,int y) {
		if(x>y) return x;
		else return y;
	}
}

// Smaller.java
package test;
public class Smaller implements IComparable {
	public int compareTo(int x,int y) {
		if(x<y) return x;
		else return y;
	}
}


// DemoInterface3.java
package maccess;
import java.util.Scanner;
import test.*;
public class DemoInterface3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first no :");
        int v1 = sc.nextInt();
        System.out.println("Enter the value2:");
        int v2 = sc.nextInt();
        System.out.println("====Choice====");
        System.out.println("1.Greater\n2.Smaller");
        System.out.println("Enter the Choice:");
        int choice = sc.nextInt();
        switch(choice)
        {
        case 1:
        	Greater gt = new Greater();
        	System.out.println("Greater Value:"+gt.compareTo(v1,v2));
        	break;
        case 2:
        	Smaller sm = new Smaller();
        	System.out.println("Smaller Value:"+sm.compareTo(v1,v2));
        	break;
        default:
        	System.out.println("Invalid choice...");
        }//end of switch
        sc.close();
	}
}

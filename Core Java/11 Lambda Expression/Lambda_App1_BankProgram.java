// IArithemetic.java
package test;
public interface IArithemetic {
	public abstract void calculate(int x,int y);
}

// DemoLambdaExpression2.java
package maccess;
import java.util.*;
import test.*;
public class DemoLambdaExpression2 {
	public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         System.out.println("Enter the value1:");
         int v1 = s.nextInt();
         System.out.println("Enter the value2:");
         int v2 = s.nextInt();
         System.out.println("====Choice====");
         System.out.println("1.add\n2.sub\n3.mul\n4.div\n5.modDiv");
         System.out.println("Enter the Choice:");
         int choice = s.nextInt();
         switch(choice)
         {
         case 1:
        	 //LambdaExpression
        	 IArithemetic ad = (int x,int y)->
        		     {
        		    	System.out.println("Sum:"+(x+y));
        		     };
        	 ad.calculate(v1,v2);
        	 break;
         case 2:
        	 //LambdaExpression
        	 IArithemetic sb = (int x,int y)->
        		 {
        		    	System.out.println("Sub:"+(x-y));
        		 };
        	 sb.calculate(v1,v2);
        	 break;
         case 3:
        	//LambdaExpression
        	 IArithemetic ml = (int x,int y)->
        		   {
        		    	System.out.println("Mul:"+(x*y));
        		   };
        	 ml.calculate(v1,v2);
        	 break;
         case 4:
        	//LambdaExpression
        	 IArithemetic dv = (int x,int y)-> 
        		  {
        		    	System.out.println("Dic:"+(float)x/y);
        		  };
        	 dv.calculate(v1,v2);
        	 break;
         case 5:
        	//LambdaExpression
        	 IArithemetic md = (int x,int y)->
        		 {
        		    	System.out.println("ModDiv:"+(x%y));
        		 };        	
        	 md.calculate(v1,v2);
        	 break;
         default:
        	 System.out.println("Invalid choice...");
         }//end of switch
         s.close();
	}

}

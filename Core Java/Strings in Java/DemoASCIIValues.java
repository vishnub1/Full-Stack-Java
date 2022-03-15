package maccess;
public class DemoASCIIValues {
	public static void main(String[] args) {
         System.out.println("====UpperCase Letters====");
         for(int i=65;i<=90;i++)
         {
        	 char ch = (char)i;
        	 System.out.print(ch+" ");
         }//end of loop
         System.out.println("\n=====LowerCase Letters====");
         for(int j=97;j<=122;j++)
         {
        	 char ch = (char)j;
        	 System.out.print(ch+" ");
         }//end of loop
         System.out.println("\n====Numbers====");
         for(int k=48;k<=57;k++)
         {
        	 char ch = (char)k;
        	 System.out.print(ch+" ");
         }//end of loop
	}
}

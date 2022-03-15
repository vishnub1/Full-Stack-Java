package maccess;

public class Format2 {
	public static void main(String[] args) {
         for(int i=1;i<=5;i++)
         {
        	 int k=97;
        	 for(int j=i;j<=5;j++)
        	 {
        		 System.out.print((char)k+" ");
        		 k++;
        	 }//end of Inner_loop
        	 System.out.println();
         }//end of outer_loop
	}
}

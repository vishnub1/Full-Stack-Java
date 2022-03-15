package maccess;

public class Format1 {
	public static void main(String[] args) {
		
        for(int i=1;i<=5;i++)
        {
        	int k=65;
           for(int j=1;j<=i;j++)
           {
        	   System.out.print((char)k+" ");
        	   k++;
           }//end of Inner_loop
           System.out.println();
        }//end of Outer_loop
	}
}

//===============================================================
//Assignment-2:
//wap to display the format:
//a b c d e
//a b c d
//a b c
//a b
//a

/*
wap to display the following format:
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
*/

public class Pattern5 {
	public static void main(String[] args){
		
		for (int i=1;i<=5;i++) {
			int k=53;
			for(int j=i;j<=5;j++)
			{
			    System.out.print((char)k+" ");
				k--;
		    }
		System.out.println();
		}	
	}
}

/*Display the below Pattern
a b c d e
a b c d
a b c
a b
a
*/
public class Pattern3 {
	public static void main(String[] args){

		for(int i=1;i<=5;i++)
			{
				int k=97;
				for(int j=i;j<=5;j++)
				{
					System.out.print((char)k+" ");
					k++;
				}
				System.out.println();
			}
	}
}
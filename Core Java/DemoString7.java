import java.util.Scanner;
public class DemoString7 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the String :");
		String str= s.nextLine();
		int len = str.length();
		int count=0;
		 for(int i=0;i<=len-1;i++)
         {
			 char ch =str.charAt(i);
			 switch(ch){
				case 'a':
				case 'A': count++;
				break;
				case 'e':
				case 'E': count++;
				break;
				case 'i':
				case 'I': count++;
				break;
				case 'o':
				case 'O': count++;
				break;
				case 'u':
				case 'U': count++;
				break;
			 }//end switch
		 }// edn of loop
         System.out.println("Number of Vowels:"+count);
         s.close();

	}
}
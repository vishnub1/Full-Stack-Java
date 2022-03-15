package maccess;
public class DemoString7 {
	public static void main(String[] args) {
        String str = "java8 by 2014 **/e";
        int len = str.length();
        int v=0,c=0,n=0;
        for(int i=0;i<=len-1;i++)
        {
        	char ch = str.charAt(i);
        	switch(ch)
        	{
        	case 'a':
        	case 'A':
        	case 'e':
        	case 'E':
        	case 'i':
        	case 'I':
        	case 'o':
        	case 'O':
        	case 'u':
        	case 'U':v++;
        		break;
        	}//end of switch
        	int k = (int)ch;
        	if((k>=65 && k<=90) || (k>=97 && k<=122))
        	{
        		c++;
        	}
        	if(k>=48 && k<=57)
        	{
        		n++;
        	}
        }//end of loop
        System.out.println("Vowels:"+v);
        System.out.println("Consonents:"+(c-v));
        System.out.println("Numbers:"+n);
        System.out.println("Others:"+(len-(c+n)));
	}
}

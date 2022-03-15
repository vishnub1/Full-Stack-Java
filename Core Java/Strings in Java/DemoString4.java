package maccess;
public class DemoString4 {
	public static void main(String[] args) {
       String s1 = "java";
       String s2 = "java";
       String s3 = new String("java");
       String s4 = new String("java");
       System.out.println("===String literal process====");
       if(s1==s2) {
    	   System.out.println("String are equal...");
       }else {
    	   System.out.println("String are Not-equal...");
       }
       System.out.println("===new operator process====");
       if(s3==s4) {
    	   System.out.println("Strings are equal...");
       }else {
    	   System.out.println("String are Not-equal...");
       }
	}
}

//o/p:
//===String literal process====
//String are equal...
//===new operator process====
//String are Not-equal...

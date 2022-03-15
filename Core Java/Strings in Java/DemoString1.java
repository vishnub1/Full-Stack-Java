package maccess;
public class DemoString1 {
	public static void main(String[] args) {
       String s1 = "java";
       int len1 = s1.length();
       String s2 = new String("program");
       int len2 = s2.length();
       String s3 = s1.concat(s2);//Concatenation process
       int len3 = s3.length();
       System.out.println("====Display data====");
       System.out.println("s1:"+s1.toString());
       System.out.println("length of s1:"+len1);
       System.out.println("s2:"+s2.toString());
       System.out.println("length of s2:"+len2);
       System.out.println("s3:"+s3.toString());
       System.out.println("length of s3:"+len3);
	}
}
//
//o/p:
//====Display data====
//s1:java
//length of s1:4
//s2:program
//length of s2:7
//s3:javaprogram
//length of s3:11

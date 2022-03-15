package maccess;
public class DemoString2 {
	public static void main(String[] args) {
        String s1 = "java";
        String s2 = "program";
        String s3 = "language";
        String s4 = s1.concat(s3);//Factory Method
        String s5 = s1+s2+s3;
        System.out.println("s4:"+s4.toString());
        System.out.println("s5:"+s5.toString());
	}
}


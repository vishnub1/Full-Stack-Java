package maccess;
public class DemoBuffer1 {
	public static void main(String[] args) {
       StringBuffer sb = new StringBuffer();//Con_call
       System.out.println("default capacity:"+sb.capacity());
       System.out.println("length:"+sb.length());
       sb.append("java");
       System.out.println("sb:"+sb.toString());
       System.out.println("capacity:"+sb.capacity());
       System.out.println("length:"+sb.length());
       sb.append("language");
       System.out.println("sb:"+sb.toString());
       System.out.println("capacity:"+sb.capacity());
       System.out.println("length:"+sb.length());
       sb.append("program");
       System.out.println("sb:"+sb.toString());
       System.out.println("capacity:"+sb.capacity());
       System.out.println("length:"+sb.length());
	}
}



package maccess;
public class DemoBuffer2 {
	public static void main(String[] args) {
       StringBuffer sb = new StringBuffer(4);//Con_Call
       System.out.println("default capacity:"+sb.capacity());
       System.out.println("length:"+sb.length());
       sb.append("nit");
       System.out.println("sb:"+sb.toString());
       System.out.println("capacity:"+sb.capacity());
       System.out.println("length:"+sb.length());
       sb.append("hyd");
       System.out.println("sb:"+sb.toString());
       System.out.println("capacity:"+sb.capacity());
       System.out.println("length:"+sb.length());
       sb.append("language");
       System.out.println("sb:"+sb.toString());
       System.out.println("capacity:"+sb.capacity());
       System.out.println("length:"+sb.length());
       
       
	}
}

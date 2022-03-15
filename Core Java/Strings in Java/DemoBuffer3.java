
package maccess;

public class DemoBuffer3 {
	public static void main(String[] args) {
       StringBuffer sb = new StringBuffer("nit");//Con_call
       System.out.println("default capacity:"+sb.capacity());
       System.out.println("length:"+sb.length());
       System.out.println("sb:"+sb.toString());
       sb.append("javalanguageprogram");
       System.out.println("sb:"+sb.toString());
       System.out.println("capacity:"+sb.capacity());
       System.out.println("length:"+sb.length());
       
	}
}

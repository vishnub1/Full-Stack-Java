package maccess;

public class DemoBuffer5 {
	public static void main(String[] args) {
         StringBuffer sb = new StringBuffer();
         sb.append("nit");
         sb.append("hyd");
         System.out.println("sb:"+sb.toString());
         sb.insert(3,"Ameerpet");
         System.out.println("sb:"+sb.toString());
         System.out.println("====String reverse=====");
         System.out.println(sb.reverse());
         
         
	}
}
//sb:nithyd
//sb:nitAmeerpethyd
//====String reverse=====
//dyhtepreemAtin
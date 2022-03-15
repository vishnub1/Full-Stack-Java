package maccess;
public class DemoBuffer4 {
	public static void main(String[] args) {
          System.out.println("****sb1****");
          StringBuffer sb1 = new StringBuffer("nit");
          sb1.append("task");
          System.out.println("sb1:"+sb1.toString());
          System.out.println("Capacity:"+sb1.capacity());
          System.out.println("length:"+sb1.length());
          System.out.println("****sb2****");
          StringBuffer sb2 = new StringBuffer(sb1);
          sb2.append("hyd");
          System.out.println("sb2:"+sb2.toString());
          System.out.println("Capacity:"+sb2.capacity());
          System.out.println("length:"+sb2.length());
	}

}

//o/p:
//****sb1****
//sb1:nittask
//Capacity:19
//length:7
//****sb2****
//sb2:nittaskhyd
//Capacity:23
//length:10

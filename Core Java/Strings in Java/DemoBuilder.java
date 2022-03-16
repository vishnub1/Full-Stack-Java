package maccess;

public class DemoBuilder {
	public static void main(String[]args) {
		System.out.println("===Sb1===");
		StringBuilder sb1 = new StringBuilder("nit");
		sb1.append("task");
		System.out.println("sb:"+sb1.toString());
        System.out.println("Capacity:"+sb1.capacity());
        System.out.println("length:"+sb1.length());
        System.out.println("****sb2****");
        StringBuilder sb2 = new StringBuilder(sb1);
        sb2.append("hyd");
        System.out.println("sb2:"+sb2.toString());
        System.out.println("Capacity:"+sb2.capacity());
        System.out.println("length:"+sb2.length());

	}

}

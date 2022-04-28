package maccess;
public class DemoException2 {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.println("value :"+i);
			try {
				Thread.sleep(4000);//stop the execution for 000ms=5second
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
}

package object;
public class DemoArray5 {
	public static void main(String[] args) {
		String o[] = new String[2];
		o[0] = new String("2");
		o[1] = new String("Vishnu");
		System.out.println("==Display from Object Array==");
		for(Object k:o) {
			System.out.println(k.toString());
		}
	}
}

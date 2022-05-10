package jagged;
public class DemoArray6 {
	public static void main(String[] args) {
		Integer a1[] = {1,2,3};
		Integer a2[] = {1,2,3,4,5,6};
		Integer a[][] = {a1,a2};  //Jagged Array
		System.out.println("==Display from Jagged Array==");
		for(Integer k[] :a) {
			System.out.println("Array :");
			for(Integer z:k) {
				System.out.print(z.toString()+" ");
			}//innerLoop
			System.out.println();
		}
	}
}

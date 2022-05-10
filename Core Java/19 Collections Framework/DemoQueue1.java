package priorityQueue;
import java.util.*;
public class DemoQueue1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(sc;){
			Queue<Integer> q = new PriorityQueue<Integer>();
			while(true) {
				try {
					System.out.println("===choice===");
					System.out.println("1.Add \n2.remove \n3.exit");
					System.out.println("Enter the choice");
					int choice = sc.nextInt();

					switch (choice) {
					case 1://add
						System.out.println("Enter the ele : ");
						q.add(new Integer(sc.nextInt()));
						System.out.println(q.toString());
						break;
					case 2://remove
						if(q.isEmpty()) {
							System.out.println("Queue is empty");
						}else {
							q.remove();
							System.out.println(q.toString());
						}
						break;
					case 3://exit
						System.out.println("Queue execution is stopped");
						System.exit(0);
					default:
						System.out.println("Invalid choice");
						System.exit(0);
					}
				}catch(Exception e) {e.printStackTrace();}
			}
		}
	}
}

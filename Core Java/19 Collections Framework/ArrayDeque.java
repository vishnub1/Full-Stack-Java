package priorityQueue;
import java.util.*;
public class ArrayDeque1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(sc;){
			Deque<Integer> dq = new ArrayDeque<Integer>();
			while(true) {
				try {
					System.out.println("====choice====");
					System.out.println("1.add()\n2.remove()\n3.addFirst()\n4.addLast()"
							+ "\n5.removeFirst()\n6.removeLast()\n7.exit()");				
					System.out.println("Enter the choice ..");
					int choice = sc.nextInt();

					switch (choice) {
					case 1://add()
						System.out.println("Enter the element ");
						dq.add(new Integer(sc.nextInt()));
						System.out.println(dq.toString());
						break;
					case 2://remove()
						if(dq.isEmpty()) {
							System.out.println("Dequeue is empty..");
						}else {
							dq.remove();
							System.out.println(dq.toString());
						}
						break;
					case 3://addFirst()
						System.out.println("Enter the element :");
						dq.addFirst(new Integer(sc.nextInt()));
						System.out.println(dq.toString());
						break;
					case 4: //addLast()
						System.out.println("Enter the element :");
						dq.addLast(new Integer(sc.nextInt()));
						System.out.println(dq.toString());
						break;
					case 5: //removeFirst()
						if(dq.isEmpty()) {
							System.out.println("Deque is empty");
						}else {
							dq.removeFirst();
							System.out.println(dq.toString());
						}
						break;
					case 6://removeLast()
						if(dq.isEmpty()) {
							System.out.println("Deque is Empty");
						}else {
							dq.removeLast();
							System.out.println(dq.toString());
						}
						break;
					case 7://exit
						System.out.println("Deque opration is Stopped..");
						System.exit(0);
						break;
					default:
						System.out.println("Invalid Choice...");
					}
				}catch(Exception e) {e.printStackTrace();}
			}
		}
	}
}

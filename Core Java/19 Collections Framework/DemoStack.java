package array;
import java.util.*;
public class DemoStack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(sc;){
			Stack<Integer> st = new Stack<Integer>();

			while(true) {
				try {
					System.out.println("====choice====");
					System.out.println("1.pusch()\n2.poo()\n3.peek()\n4.search()\n5.exit()");
					System.out.println("Enter the choice ");
					int choice = sc.nextInt();

					switch(choice) {
					case 1://push() 
						System.out.println("Enter the element :");
						st.push(new Integer(sc.nextInt()));
						System.out.println(st.toString());
						break;
					case 2: //pop()
						if(st.empty()) {
							System.out.println("Stack is empty ..");
						}else {
							st.pop();
							System.out.println(st.toString());
						}
						break;
					case 3: //peek()
						if(st.empty()) {
							System.out.println("stack is empty..");
						}else {
							System.out.println(st.toString());
							System.out.println("peek value :"+st.peek());
						}
						break;
					case 4://search()
						if(st.empty()) {
							System.out.println("Stack is empty..");
						}else {
							System.out.println("enter the ele to be searched:");
							Integer ele = new Integer(sc.nextInt());
							int pos = st.search(ele);
							if(pos>0) {
								System.out.println("Ele found at position :"+pos);
							}else {
								System.out.println("Ele not found ..");
							}
						}
						break;
					case 5://exit
						System.out.println("Stack operation stopped :");
						System.exit(0);
					default:
						System.out.println("Invalid choice ..");
					}
				}catch(Exception e) {e.printStackTrace();}
			}
		}
	}
}

package main;
import java.util.*;

public class CollectionEx1 {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(sc;){
			Collection<Integer> c = null;
			System.out.println("Enter the choice");
			System.out.println("1.Set<E>\n2.List<E>\n3.Queue");
			System.out.println("Enter the choice");
			int choice1 = sc.nextInt();
			
			switch(choice1) {
			case 1://Set
				System.out.println("===<choice>===");
				System.out.println("1.HashSet<E>\n2.LinkedHashSet<E>\n3.TreeSet<E>");
				System.out.println("Enter the choice");
				int choice2 = sc.nextInt();
				switch(choice2) {
				case 1://HashSet
					c = new HashSet<Integer>();
					break;
				case 2://LinkedHashSet
					c = new LinkedHashSet<Integer>();
					break;
				case 3://TreeSet
					c = new TreeSet<Integer>();
					break;
				default:
					System.out.println("Progam Terminated..");
					System.exit(0);
				}
				break;
				
			case 2://List
				System.out.println("===<Choice>===");
				System.out.println("1.ArrayList<E>\n2.LinkedList<E>\n3.Vector<E>");
				System.out.println("Enter the choice");
				int choice3 = sc.nextInt();
				switch (choice3) {
				case 1://ArrayList
					c = new ArrayList<Integer>();
					break;
				case 2: //LinkedList
					c = new LinkedList<Integer>();
					break;
				case 3: //Vector
					c = new Vector<Integer>();
					break;
				default:
					System.out.println("Program Terminated..");
					System.exit(0);
				}
				break;
			
			case 3:
				System.out.println("===<chice>===");
				System.out.println("1.PriorityQueue<E>\n2.ArrayDeque<E>");
				System.out.println("Enter the choice");
				int choice4 = sc.nextInt();
				switch(choice4) {
				case 1:
					c = new PriorityQueue<Integer>();
					break;
				case 2:
					c = new ArrayDeque<Integer>();
					break;
				default:
					System.out.println("Program Terminated...");
					System.exit(0);
				}
				break;
			default:
				System.out.println("Program Terminated...");
				System.exit(0);
			}//end of switch
			
			System.out.println("Enter the no of elements to be added to the collection");
			int n = sc.nextInt();
			System.out.println("Enter the "+n+" Numbers");
			
			for(int i = 0;i<n; i++) {
				c.add(new Integer(sc.nextInt()));
			}
			System.out.println("===<Display using toString>===");
			System.out.println(c.toString());
			System.out.println("===<Iterator<E>>===");
			Iterator<Integer> it = c.iterator();
			while(it.hasNext()) {
				System.out.print(it.next()+" ");
			}
			System.out.println("\n===<Display Using new ITerator<E> Java8");
			Iterator<Integer> it2 = c.iterator();
			it2.forEachRemaining((q)->
			{
				System.out.print(q+" ");
			});
			System.out.println("\n===forEach() Java8===");
    		c.forEach((r)->
    		{
    			System.out.print(r+" ");
    		});
		}catch(Exception e) {e.printStackTrace();}
	}
}
					

//>Hashtable<K,V> and HashMap<K,V> organizes elements without any order.
// =>LinkedHashMap<K,V> organizes elements in insertion order.
// =>TreeMap<K,V> organizes elements automatically in ascending
//   order based on Key.

package test;
import java.util.*;
public class DemoMap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(sc;){
			try {
				Map<String,String>mp = null;
				System.out.println("===CHoice===");
				System.out.println("1.HashMap\n2.LinkedHashMap"
						+ "\n3.TreeMap\n4.Hashtable");
				System.out.println("Enter the choice:");
				int choice = Integer.parseInt(sc.nextLine());
				switch (choice) {
				case 1://any Order
					mp = new HashMap<String, String>(); 
					break;
				case 2: //insertion Order
					mp = new LinkedHashMap<String, String>();
					break;
				case 3://ascending Order
					mp = new TreeMap<String,String>();
					break;
				case 4://any Order
					mp = new Hashtable<String, String>();
					break;
				default:
					System.out.println("Invalid choice..");
					System.exit(0);
				}
				System.out.println("Enter the number of elements:");
				int n = Integer.parseInt(sc.nextLine());
				for(int i=1;i<=n;i++) {
					System.out.println("Enter the bCode");
					String bCode = sc.nextLine();
					System.out.println("Enter the bName:");
					String bName = sc.nextLine();
					mp.put(bCode, bName);//Adding to Map(k,V)Object
				}
				System.out.println("===Book Details===");
				mp.forEach((p,q)->
				{
					System.out.println(p+"\t"+q);
				});
			}catch(Exception e) {e.printStackTrace();}

		}
	}
}

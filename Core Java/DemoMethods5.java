import java.util.Scanner;

class Addition{
		int add(int x, int y) {
			return x+y;
		}
	}
	class Subtraction{
		int sub(int x , int y) {
			return x-y;
		}
	}
	class Multiplication{
		int mul(int x , int y) {
			return x*y;
		}
	}
	class Division{
		float div(int x,int y) {
			return (float)x/y;
		}
	}
	class ModDivision{
		int modDiv(int x, int y) {
			return x%y;
		}
	}
	public class DemoMethods5 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the value 1 : ");
			int v1 = sc.nextInt();
			System.out.println("Enter the value 2 : ");
			int v2 = sc.nextInt();
			
			//v1 and v2 are Primitive dataType local variables
			//memory in methof frame
			
			System.out.println("====choice===");
			System.out.println("1.add\n2.sub\n3.mul\n4.div\n5.modDiv");
			System.out.println("Enter choice : ");
			int choice = sc.nextInt();
			
			//choice also primitive DataType Local Variable
			// memeory in method frame
			
			switch(choice) {
			case 1:
				Addition ad = new Addition();
				int r1 = ad.add(v1,v2);
				System.out.println("Sum :"+r1);
				break;
				
			case 2:
				Subtraction sb = new Subtraction();
				int r2 = sb.sub(v1,v2);
				System.out.println("Sub"+r2);
				break;
			
			case 3:
				Multiplication ml = new Multiplication();
			    int r3 = ml.mul(v1,v2);
				System.out.println("Mul:"+r3);
				break;
				
			case 4:
				Division dv = new Division();
				
			    float r4 = dv.div(v1,v2);
				//r4 is primitive DataType Local Variable
				//memory in method_frame
				System.out.println("Div:"+r4);
				break;
				
			case 5:
				ModDivision md = new ModDivision();
			    int r5 = md.modDiv(v1,v2);
				System.out.println("ModDiv:"+r5);
				break;
				
			default:
				System.out.println("invalid Choice..");
			}
		}
}








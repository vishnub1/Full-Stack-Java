// Transaction.java
package test;
public interface Transaction {
	public static final Balance b = new Balance();
	public abstract void process(int amt);
}

// Deposite.java
package test;
public class Deposite implements Transaction {
	public void process(int amt) {
		System.out.println("Amt Deposited :"+amt);
		b.bal=b.bal+amt;
		b.getBalance();
		System.out.println("Transaction Complited ..");
	}
}


// Balance.java
package test;
public class Balance {
	public double bal = 2000;
	public void getBalance() {
		System.out.println("Balance Amt :"+bal);
	}
}

// CheckPinNo.java
package test;
public class CheckPinNo {  //subclass
	public boolean k = false;
	public boolean verify(int pinNo) {
		switch (pinNo) {
		case 1111: k=true;
			break;
		case 2222: k=true;
			break;
		case 3333: k=true;
			break;
		case 4444: k=true;
			break;
		}//end of switch
		return k;
	}
}

// WithDraw.java
package test;
public class WithDraw implements Transaction {
	public void process(int amt) {
		if(amt<b.bal) {
			System.out.println("Amt withdrawn :"+amt);
			b.bal = b.bal-amt;
			b.getBalance();
			System.out.println("Transaction Completed ...");
		}//end of if
		else {
			System.out.println("Insufficient funds ...");
		}
	}

}

// BankMainClass.java(main class)
package maccess;
import java.util.*;
import test.*;
public class BankMainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count =0;
		xyz:
			while(true) {
				System.out.println("Enter the pin no :");
				int pinNo = sc.nextInt();
				CheckPinNo cpn = new CheckPinNo();
				boolean k = cpn.verify(pinNo);  //method call
				if(k) {
					System.out.println("===choice===");
					System.out.println("1.WithDraw \n2.Deposite");
					System.out.println("Enter the choice :");
					int choice = sc.nextInt();
					switch (choice) {
					case 1:
						System.out.println("Enter the amt :");
						int a1 = sc.nextInt();
						if(a1>0 && a1%100==0) {
							WithDraw wd = new WithDraw();
							wd.process(a1);
						}//end of if
						else {
							System.out.println("Invalid amt ...");
						}
						break xyz;   //stop the loop
					case 2:
						System.out.println("Enter the amt..");
						int a2 = sc.nextInt();
						if(a2>0 && a2%100==0) {
							Deposite dp = new Deposite();
							dp.process(a2);
						}//end_of_if
						else {
							System.out.println("Invalid amt ..");
						}
						break xyz;  //stop the loop
						default:
							System.out.println("invalid choice..");
						break xyz;
					}
				}
					else {
						System.out.println("Invalid PinNo..");
						count++;
					}
					if(count ==3) {
						System.out.println("sorry ! Transaction blocked...");
						break;
					}
				}
				sc.close();
			}
}




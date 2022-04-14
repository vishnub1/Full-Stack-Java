// Transaction.java
package test;
public interface Transaction {
	public static final Balance b =new Balance();
	public abstract void process(int amt);
}


// CheckPinNo.java
package test;
public class CheckPinNo {  //sub Class
	public boolean k =false;
	public boolean verify(int pinNo) {  //return type instance method
	switch (pinNo) {
	case 1111: k= true;
		break;
	case 2222: k =true;
		break;
	case 3333: k =true;
		break;
	}
	return k;
	}
}


// Balance.java
package test;
public class Balance {
	public double bal =2000;
	public void getBalance() {
		System.out.println("Balance amt :"+bal);
	}
}


// BankMainClass.java(main class)
package maccess;
import test.*;
import java.util.Scanner;
public class BankMainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		xyz:
			while(true) {
				System.out.println("Enter the pinNo :");
				int pinNo = sc.nextInt();
				CheckPinNo cpn = new CheckPinNo();
				boolean k = cpn.verify(pinNo);
				if(k) {
					System.out.println("==Choice==");
					System.out.println("1.withDraw\n2.Deposite");
					System.out.println("Enter the choice:");
					int choice = sc.nextInt();
					switch(choice) {
					case 1:
						System.out.println("Enter the amt:");
						int a1 =sc.nextInt();
						if(a1>0 && a1%100==0) {
							Transaction wd = (int amt)->
							{
								if(amt<Transaction.b.bal) {
									System.out.println("amt withdrawn :"+amt);
									Transaction.b.bal = Transaction.b.bal-amt;
									Transaction.b.getBalance();
									System.out.println("Transaction Completed..");
								 }
									else {
										System.out.println("Insufficient funds...");
									 }
								};
								wd.process(a1);
							}
				
							else {
								System.out.println("Invalid amt...");
							}
							break xyz;
					case 2:
						System.out.println("Enter the amt");
						int a2 = sc.nextInt();
						if(a2>0 && a2%100==0) {
							//Anonymous inner classes as implementation lcass 
							Transaction dp = (int amt)->
							{
								System.out.println("Amt deposited:"+amt);
								Transaction.b.bal = Transaction.b.bal+amt;
								Transaction.b.getBalance();
								System.out.println("Transaction completed..");		
							};
							dp.process(a2);
							}
						else {
							System.out.println("Invalid amt...");
						}
						break xyz;
						default:
							System.out.println("Invalid choice...");
							break xyz;
						}
						
					}
					else {
						System.out.println("Invalid pinNo..");
						count++;
					}
					if(count ==3) {
						System.out.println("Sorry ! Transaction blocked..");
						break;
				}
			}
		sc.close();
	}
}

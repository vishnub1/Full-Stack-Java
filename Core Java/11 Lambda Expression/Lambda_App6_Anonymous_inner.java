// Tranaction.java
package test;
public interface Transaction {
	public static final Balance b = new Balance();
	public abstract void process(int amt);
}

// CheckPinNo.java
package test;
public class CheckPinNo {
	public boolean k = false;
	public boolean verify(int pinNo) { //return type with instance method with parameter
		switch (pinNo) {
		case 1111: k=true;
			break;
		case 2222: k=true;
			break;
		case 3333: k=true;
			break;
		}//end of switch
		return k;
	}
}


// Balance.java
package test;
public class Balance {
	public double bal =2000;
	public void getBalance() {
		System.out.println("Balance Amt :"+bal);
	}
}

// BankMainClass.java(main class)
package maccess;
import test.*;
import java.util.Scanner;
public class BankMainClass{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		xyz:
			while(true) {
				System.out.println("Enter the pinNo:");
				int pinNo = sc.nextInt();
				CheckPinNo cpn = new CheckPinNo();
				boolean k = cpn.verify(pinNo);  //method ca;;
				if(k) {
					System.out.println("==choice===");
					System.out.println("1.withDraw\n2.Deposite");
					System.out.println("Enter the choice:");
					int choice = sc.nextInt();
					
					switch(choice) {
					
					case 1:
						System.out.println("Enter the amt :");
						int a1 = sc.nextInt();
						if(a1>0 && a1%100 ==0) {
							Transaction wd = new Transaction() {
								@Override
								public void process(int amt) {
									if (amt<b.bal){
										System.out.println("Amt withDraw:"+amt);
										b.bal =b.bal-amt;
										b.getBalance();
										System.out.println("Transaction completed..");
									}//end of if
									else {
										System.out.println("Insufficient funds..");
									}
								}
							};
							wd.process(a1);
						}//end of if
						else {
							System.out.println("Inavlid amount..");
						}
						break xyz;
						
					case 2:
						System.out.println("Enter the amount..");
						int a2 = sc.nextInt();
						if(a2>0 && a2%100 ==0) {
							Transaction dp = new Transaction() {
								@Override
								public void process(int amt) {
									System.out.println("Amt Deposited :"+amt);
									b.bal= b.bal+amt;
									b.getBalance();
									System.out.println("Transaction Completed..");
								}
							};
							dp.process(a2);
						}//end of if
						else {
							System.out.println("invalid amt...");
						}
						break xyz;
						default:
							System.out.println("invalid choice...");
							break xyz;
					}//end of switch
				}
				else {
					System.out.println("invalid pin");
					count++;
				}
				
				if(count==3) {
					System.out.println("Sorry ! Transaction blocked..");
					break;
				}//end of while 
				sc.close();
			}
	}
}

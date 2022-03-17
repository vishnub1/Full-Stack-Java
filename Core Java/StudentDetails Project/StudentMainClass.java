package maccess;
import java.util.*;
import test.*;

public class StudentMainClass {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the student Name :");
		String name = s.nextLine();
		System.out.println("Enter the Branch :");
		String br = s.nextLine().toUpperCase();
		CheckBranch cb = new CheckBranch();
		boolean k = cb.verify(br);
		if(k) {
			System.out.println("Enter the rollNo: ");
			String rollNo =s.nextLine().toUpperCase();
			if(rollNo.length()==10) {
				ValidateRollNo vrn = new ValidateRollNo();
				boolean z = vrn.verify(br, rollNo.substring(6,8));
				if(z) {
					System.out.println("===Enter 6 sub Marks===");
					int i=1;
					int totM=0;
					boolean p=false;
					while(i<=6) {
						System.out.println("Enter marks of sub "+i);
						int sub =s.nextInt();
						if(sub<0 || sub>100) {
							System.out.println("Invalid marks...");
							continue;
						}//end of if
						if(sub>=0 && sub<=34) {
							p=true;
						}
						totM=totM+sub;
						i++;
					}
					System.out.println("StuName :"+name);
					System.out.println("RollNo :"+rollNo);
					System.out.println("Branch :"+totM);
				StudentResult sr = new StudentResult();
				sr.calculate(totM, p);
				sr.getStudentResult();
				}
				else {
					System.out.println("Roll no not match with branch");
				}
			}
			else {
				System.out.println("Invalid roll No..");
			}
		}
		else {
			System.out.println("Invalid branch..");
		}
		s.close();
	}

}

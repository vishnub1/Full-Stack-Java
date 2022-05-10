package apr_30_2022;
import java.util.*;
@SuppressWarnings("serial")
public class DemoArray6_StudentResult extends Exception {
	public DemoArray6_StudentResult(String msg) {
		super(msg);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try(sc;){
			try {
				System.out.println("Enter number of student ");
				int n = Integer.parseInt(sc.nextLine());
				
				Student stu[] = new Student[n]; //array
				
				System.out.println("Enter "+n+" Student Details");
				for (int i=0; i<stu.length; i++) {
					stu[i] = new Student();
					System.out.println("Enter the StuName");
					stu[i].name = sc.nextLine();
					
					System.out.println("Enter the Branch");
					stu[i].branch = sc.nextLine().toUpperCase();
					
					CheckBranch cb = new CheckBranch();
					 cb.verify(stu[i].branch);
					 
					 System.out.println("Enter the rollNo:");
					 stu[i].rollNo = sc.nextLine().toUpperCase();
					 
					 if(stu[i].rollNo.length()!=10) { //Exception
						DemoArray6_StudentResult smc = new DemoArray6_StudentResult("Invalid roll no");
						throw smc;
					 }//end of if 
					 
					 ValidateRollNo vrn = new ValidateRollNo();
					 vrn.verify(stu[i].branch,stu[i].rollNo.substring(6,8));
					 
					 System.out.print("===Enter 6 Sub Marks===");
					 int j = 1;
					 int totM = 0;
					 boolean p = false;
					 while(j<=6) {
						 try {
							 System.out.println("Enter marks of sub "+j);
							 int sub = Integer.parseInt(sc.nextLine());
							 j++;
							 if(sub<0 || sub>100) {
								 DemoArray6_StudentResult smc = new DemoArray6_StudentResult("invalid Marks..");
								 throw smc;
							 }
							 if(sub>=0 && sub<=34) {
								 p=true;
							 }
							 totM = totM+sub;
						 }catch(DemoArray6_StudentResult smc) {
							 System.out.println(smc.getMessage());
							 j--;
						 }
					 }//end of while loop
					 stu[i].totMarks = totM;
					 StudentResult sr = new StudentResult(stu[i]);
					 sr.calculate(totM,p);
				}
				System.out.println("===Student Details===");
				Spliterator<Student>sp = Arrays.spliterator(stu);
				sp.forEachRemaining((k)->
				{
					System.out.println(k.toString());
				});
			}catch(CheckBranch | DemoArray6_StudentResult | ValidateRollNo ob) {
				System.out.println(ob.getMessage());
			}
		}
	}
}
import java.util.Scanner;
class StudentDetails { 									 //SubClass
	String stuName,stuRollNo,stuBranch;
	void getStudentDetails() {
		System.out.println("StuName\t\t:"+stuName);
        System.out.println("StuRollNo\t:"+stuRollNo);
        System.out.println("StuBranch\t:"+stuBranch);
	}
}
class StudentResult { 								     //SubClass
	int totMarks;
	float per;
	String result;
	void calculate(int totM,boolean p) {
       totMarks = totM;
	   per = (float)totM/6;							     //TypeCasting
	   if(p){
		   result="Fail";
		}
		else if(per>=70 && per<=100) {
		   result = "Distinction";
		}
		else if(per>=60 && per<70){
			result="FirstClass";
		}
		else if(per>=50 && per<60){
			result="SecondClass";
		}
		else if(per>=35 && per<50){
			result="ThirdClass";
		}
		else{
			result="Fail";
		}
	}
	void getStudentResult(){
		System.out.println("TotMarks\t:"+totMarks);
        System.out.println("Per\t\t:"+per);
        System.out.println("Result\t\t:"+result);
	}
}
class DemoMethods6 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		StudentDetails sd = new StudentDetails();
		
		System.out.println("Enter the StuName:");
		sd.stuName = s.nextLine();								//Load data to Object
		System.out.println("Enter the StuRollNo:");
		sd.stuRollNo = s.nextLine();							//Load data to Object
		System.out.println("Enter the StuBranch:");
		sd.stuBranch = s.nextLine();							//Load data to object
		System.out.println("=====Enter 6 Sub Marks====");
		int i=1;												//Initialization(start value)
		int totM=0;
		boolean p=false;
		while(i<=6){ 											//Condition(End value)
			System.out.println("Enter marks of sub"+i);
			int sub = s.nextInt();								//load data to Local variable
			if(sub<0 || sub>100){  								//simple if
				System.out.println("Invalid marks...");
				continue;										//skip the below lines from loop
			}                                                   //end of if
			if(sub>=0 && sub<=34)                                //simple if
			{
				p=true;
			}//end of if
			totM=totM+sub;
           i++;//Increment
        }//end of loop
		sd.getStudentDetails();
		
        StudentResult sr = new StudentResult();
		sr.calculate(totM,p);
		sr.getStudentResult();
	}
}


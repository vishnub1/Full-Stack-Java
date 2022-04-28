//CheckBranch.java
package school;
@SuppressWarnings("serial")
public class CheckBranch extends Exception {
	public CheckBranch() {}
	public CheckBranch(String msg) {
		super(msg);
	}
     public void verify(String br)throws CheckBranch {
    	 try {
    		 switch(br){
        	 case "CSE":
        		 break;
        	 case "EEE":
        		 break;
        	 case "ECE":
        		 break;
        	 default://Exception
        		CheckBranch cb = new CheckBranch("Invalid Branch..."); 
        		throw cb;
        	 }//end of switch 
    	 } catch(CheckBranch cb){
    		throw cb;//re-throwing 
    	 } 
     }
}



// ValidateRollNo.java
package school;
@SuppressWarnings("serial")
public class ValidateRollNo extends Exception {
	public ValidateRollNo() {}
	public ValidateRollNo(String msg) {
		super(msg);
	}
     public String branch=null;
     public void verify(String br,String code)throws ValidateRollNo {
    	 try {
    		 switch(code){
        	 case "05":branch="CSE";
        		 break;
        	 case "02":branch="EEE";
        		 break;
        	 case "04":branch="ECE";
        		 break;
        	 }//end of switch
        	 if(branch==null) {//Exception
        		 ValidateRollNo vrn = new ValidateRollNo("RollNo not matched with branch");
        		 throw vrn;
        	 }//end of if
        	 else {
        		if(!(branch.equals(br))) {  //Exception
        			ValidateRollNo vrn = new ValidateRollNo("RollNo not matched with branch");
        	        		 throw vrn;
        		}
        	 }
    	 }catch(ValidateRollNo vrn) {
    		 throw vrn;//re-throwing
    	 }	 
     }
}


// StudentResult.java
package school;
public class StudentResult {
	public float per;
	public String result;
	public void calculate (int totM,boolean p) {
		per=(float)totM/6;  //TyoeCastiong
		if(p) {
			result = "fail";
		} else if (per>=70 && per <=100){
			result ="Distingtion";
		} else if (per>=60 && per <=70) {
			result="FirstClass";
		} else if(per>=50 && per<60) {
			result="SecondClass";
		} else if(per>=35 && per<50) {
			result="ThirdClass";
		} else{
			result="Fail";			
		}
	}
	public void getStudentResult() {
		System.out.println("Per :"+per);
		System.out.println("Result :"+result);
	}
}

// StudentMainClass.java(main Class)
package school;
import java.util.*;
@SuppressWarnings("serial")
public class StudentMainClass extends Exception {
	public StudentMainClass (String msg) {
		super(msg);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(sc;){  //java 9
			try {
				System.out.println("Enter the Name :");
				String name = sc.nextLine();
				System.out.println("Enter the branch :");
				String br = sc.nextLine().toUpperCase();
	               CheckBranch cb = new CheckBranch();
	                cb.verify(br);//method_call

	            	  System.out.println("Enter the rollNo:");
	            	  String rollNo = sc.nextLine().toUpperCase();
	            	  if(rollNo.length()!=10) { //Exception
	            		  StudentMainClass smc= new StudentMainClass("Invalid rollNo");
	            		  throw smc;
	            	  }//end of if
	            		 ValidateRollNo vrn = new ValidateRollNo();
	                     vrn.verify(br,rollNo.substring(6, 8));
	            			 System.out.println("=====Enter 6 Sub Marks====");
	             			int i=1;//Initialization(start value)
	             			int totM=0;
	             			boolean p=false;
	             			while(i<=6) { //Condition(End value)
	             				try {
	             					System.out.println("Enter marks of sub"+i);
	                 				int sub = sc.nextInt();//load data to Local variable
	                 			      i++;//Increment
	                 				if(sub<0 || sub>100) { //Exception
	                 					StudentMainClass smc = new StudentMainClass("Invalid Marks..");
	                 					throw smc;
	                 				} if(sub>=0 && sub<=34){ //simple if
	                 					p=true;
	                 				}//end of if
	                 				totM=totM+sub;
	             				}catch(StudentMainClass smc) {
	             					System.out.println(smc.getMessage());
	             					i--;
	             				}
	             	        }
	             			System.out.println("StuName:"+name);
	             			System.out.println("RollNo:"+rollNo);
	             			System.out.println("Branch:"+br);
	             			System.out.println("TotalMarks:"+totM);
	             	        StudentResult sr = new StudentResult();
	             			sr.calculate(totM,p);
	             			sr.getStudentResult();
	           } catch(CheckBranch | ValidateRollNo | StudentMainClass ob) { //Java7
	        	   System.out.println(ob.getMessage());
	        	   System.out.println(ob.getClass());
	           }
	       }//end of try with resource
		}
	}

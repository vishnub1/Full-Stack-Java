package test;

public class StudentResult {
	public float per;
	public String result;
	public void calculate(int totM,boolean p) {
		per =(float)totM/6;
		if(p) {
			result="fail";
		}
		else if(per>=70 && per<=100) {
			result ="Destinction";
		}
		else if(per>=60 && per<70) {
			result="FirstClass";
		}
		else if(per>=50 && per<60) {
			result ="Second class";
		}
		else if(per>=35 && per<50) {
			result ="Third class";
		}
		else {
			result = "Fail";
		}
	}
	public void getStudentResult() {
		System.out.println("per:"+per);
		System.out.println("Result :"+result);
	}

}

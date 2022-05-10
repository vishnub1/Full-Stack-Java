package apr_30_2022;
public class StudentResult {
	public Student st;
	public StudentResult (Student st) {
		this.st=st;
	}
	public void calculate(int totM,boolean p) {
		st.per = (float)totM/6; //typecasting
		if(p) {
			st.result = "Fail";
		}else if(st.per>=70 && st.per<=100) {
			st.result = "Distigtion";
		}else if(st.per>=60 && st.per<70) {
			st.result = "FirstClass";
		}else if(st.per>=50 && st.per<60) {
			st.result = "Second Class";
		}else if(st.per>=35 && st.per<50) {
			st.result = "Third Class";
		}else {
			st.result = "Fail";
		}
	}
}

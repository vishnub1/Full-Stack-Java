package apr_30_2022;
@SuppressWarnings("serial")
public class ValidateRollNo extends Exception {
	public ValidateRollNo() {}
	public ValidateRollNo(String msg) {
		super(msg);
	}
	public String branch = null;
	public void verify(String br,String code)throws ValidateRollNo {
		 try {
			 switch(code) {
			 case "05":branch="CSE";
			 	break;
			 case "02":branch="EEE";
			 	break;
			 case "04":branch="ECE";
			 	break;	
			 }
			 if(branch == null) {
				 ValidateRollNo vrn = new ValidateRollNo("RollNo not matched with branch");
				 throw vrn;
			 } else {
				 if(!(branch.equals(br))) {
					 ValidateRollNo vrn = new ValidateRollNo("Roll no not matched with brench");
					 throw vrn;
				 }
			 }
		 }catch(ValidateRollNo vrn) {
			 throw vrn; //re-throwing
			 }
		}
}

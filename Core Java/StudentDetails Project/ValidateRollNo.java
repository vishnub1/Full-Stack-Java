package test;

public class ValidateRollNo {
	public boolean z=false;
	public boolean verify(String br,String code) {
		switch(code){
			case "05":branch="CSE";
				break;
			case "02":branch="EEE";
				break;
			case "04":branch="ECE";
				break;
		}
		if(branch !=null) {
			if(br.equals(branch)) {
				z=true;
			}  //end of if
		}
		return z;
	}

}

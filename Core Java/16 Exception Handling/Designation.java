package maccess;
@SuppressWarnings("serial")
public class Designation extends Exception{
	public Designation() {}
	public Designation(String msg) {
		super(msg);
	}
	public void verify(String desg)throws Designation{
		try {
			switch (desg) {
			case "SE":
				break;
			case "TE":	
				break;
			case "ME":
				break;
			default:
				Designation ob = new Designation("invalid Desg...");
				throw ob;
			}
		}catch(Designation ob) {
			throw ob;  //re-throwing
		}
	}	
}

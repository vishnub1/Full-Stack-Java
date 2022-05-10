package apr_30_2022;
@SuppressWarnings("serial")
public class CheckBranch extends Exception {
	public CheckBranch() {}
		public CheckBranch (String msg) {
			super(msg);
		}
		public void verify(String br)throws CheckBranch{
			try {
				switch(br) {
				case "CSE":
					break;
				case "EEE":
					break;
				case "ECE":
					break;
				default:  //Exception
					CheckBranch cb = new CheckBranch("Invalid Branch..");
					throw cb;
				}//end of switch
			}catch(CheckBranch cb) {
				throw cb;  //re-throwing
		}
	}
}

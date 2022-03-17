package maccess;
public class WrapperClass1 {
	public static void main(String[] args) {
          //Boxing process
		Integer ob1 = new Integer(12);//Con_Call_with_int_para
		Integer ob2 = new Integer("13");//Con_Call_with_String_para
		System.out.println("===Display Values===");
		System.out.println("ob1:"+ob1.toString());
		System.out.println("ob2:"+ob2.toString());
		System.out.println("====Operations===");
		System.out.println("Sum:"+(ob1+ob2));
		 if(ob1>ob2) {
			 System.out.println("true");
		 }else {
			 System.out.println("false");
		 }
	}
}

//o/p:
//===Display Values===
//ob1:12
//ob2:13
//====Operations===
//Sum:25
//false

package maccess2;
import test2.*;
import java.util.*;
public class DemoReferences2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Address ad = new Address();
		Contact c = new Contact();
		Student stu = new Student(ad,c);  // con_call 
		Read r = new Read();
		r.readStudent(sc, stu);// Method call
		Display d = new Display();
		d.displayStudent(stu);// Method_call
		sc.close();
		
	}
}

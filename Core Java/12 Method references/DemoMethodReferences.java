//ITest.java
package test;
public interface ITest {
 public abstract void dis(int k);
}


// Display.java
package test;
public class Display {
 public Display(int x){
 System.out.println("====Constructor====");
 System.out.println("The value x:"+x);
 }
 public void m1(int y){
 System.out.println("====Instance Method====");
 System.out.println("The value y:"+y);
 }
 public static void m2(int z){
 System.out.println("====Static Method====");
 System.out.println("The value z:"+z);
 }

  
// DemoMethodReferences.java(main class)  
package maccess;
import test.*;
public class DemoMethodReferences {
public static void main(String[] args) {
 ITest ob1 = Display::new;//Reference to Constructor
 ob1.dis(121);//Constructor_body_is_executed
 
 Display d = new Display(100);//Con_call
 ITest ob2 = d::m1;//Reference to Instance method
 ob2.dis(122);//Instance_method_body_is_Executed
 
 ITest ob3 = Display::m2;//Reference to Static method
 ob3.dis(123);//Static_method_body_is_Executed
}
}

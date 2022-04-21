// ITest.java
package test;
public interface ITest {
    public static class SubClass{
    public void m1(int x){
      System.out.println("====SubClass m1(x)====");
      System.out.println("The value x:"+x);
    }
 }//InnerClass
}//OuterInterface


// AClass.java
package test;
public abstract class AClass {
    public static class SubClass1{
    public void m1(int x){
        System.out.println("====SubClass1 m1(x)====");
        System.out.println("The value x:"+x);
    }
 }//InnerClass
 public class SubClass2{
   public void m2(int y){
      System.out.println("====SubClass2 m2(y)====");
      System.out.println("The value y:"+y);
   }
 }//InnerClass
}//OuterAbstractClass



// DemoInnerClass4.java(MainClass)
package maccess;
import test.*;
public class DemoInnerClass4 {
    public static void main(String[] args) {
      ITest.SubClass ob1 = new ITest.SubClass();
      ob1.m1(123);
    AClass.SubClass1 ob2 = new AClass.SubClass1();
      ob2.m1(34);
    AClass ob = new AClass() {};
    AClass.SubClass2 ob3 = ob.new SubClass2();
      ob3.m2(44);
    }
}

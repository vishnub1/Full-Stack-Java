// SubClass.java
package test;
public class SubClass {
    public static interface ITest1{
      public abstract void m1(int x);
 }//InnerInterface
    public interface ITest2{
      public abstract void m2(int y);
  }//InnerInterface
}//OuterClas



// DemoInnerInterface1
package maccess;
import test.*;
public class DemoInnerInterface1 {
    public static void main(String[] args) {
        System.out.println("*****InnerInterface within Class*****");
        SubClass.ITest1 ob1 = (int x)->
          {
              System.out.println("====m1(x)====");
              System.out.println("The value x:"+x);
          };
        ob1.m1(123);
        SubClass.ITest2 ob2 = (int y)->
          {
              System.out.println("====m2(y)====");
              System.out.println("The value y:"+y);
          };
         ob2.m2(234);
      }
}

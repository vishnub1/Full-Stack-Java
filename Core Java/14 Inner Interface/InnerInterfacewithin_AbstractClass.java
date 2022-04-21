// ITest.java
package test;
public interface ITest {
    public static interface ITest2{
      public abstract void m2(int x);
    }//InnerInterface
}//OuterInterface



// AClass.java
package test;
public abstract class AClass {
     public static interface ITest3{
        public abstract void m2(int y);
    }//InnerInterface
    public interface ITest33{
        public abstract void m33(int z);
    }//InnerInterface
}//OuterAbstractClass



// DemoInnerInterface2.java(MainClass)
package maccess;
import test.*;
public class DemoInnerInterface2 {
    public static void main(String[] args) {
        ITest.ITest2 ob1 = (int x)->
          {
              System.out.println("The value x:"+x); 
          };
          ob1.m2(123);
         AClass.ITest3 ob2 = (int y)->
           {
              System.out.println("The value y:"+y); 
           };
           ob2.m2(234);
         AClass.ITest33 ob3 = (int z)->
           {
              System.out.println("The value z:"+z); 
           };
           ob3.m33(345);
      }
}

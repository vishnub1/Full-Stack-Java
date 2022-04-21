// ITest.java
package test;
public interface ITest {
 public abstract void m1(int x);
 public default void m2(int y){
 System.out.println("====default Concrete method m2(y)====");
 System.out.println("The value y:"+y);
 }
}


// IClass.java
package test;
public class IClass implements ITest{
 public void m1(int x){
 System.out.println("====Implemented method m1(x)====");
 System.out.println("The value x:"+x);
 }
}


// DemoConcreteMethod2.java(MainClass)
package maccess;
import test.*;
public class DemoConcreteMethod2 {
public static void main(String[] args) {
 IClass ob = new IClass();
 ob.m1(234);
 ob.m2(234);
}
}

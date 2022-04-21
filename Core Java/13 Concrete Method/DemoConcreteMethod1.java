// ITest.java
package test;
public interface ITest {
 public abstract void m1(int x);
 public static void m2(int y){
 System.out.println("====Static Concrete method m2(y)====");
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


// DemoConcreteMethod1.java(MainClass)
package maccess;
import test.*;
public class DemoConcreteMethod1 {
public static void main(String[] args) {
 IClass ob = new IClass();
 ob.m1(234);
 ITest.m2(234);
 //IClass.m2(345);//Error
 //ob.m2(234);//Error
}
}

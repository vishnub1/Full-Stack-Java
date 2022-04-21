// ITest.java
package test;
public interface ITest {
    public abstract void m1(int x);
    private static void m2(int y){
      System.out.println("====private static m2(y)====");
      System.out.println("The value y:"+y);
  }
  private void m3(int z){
    System.out.println("====private non-static m3(y)====");
    System.out.println("The value z:"+z);
 }
 default void dis(int y,int z){
  ITest.m2(y);//static private method_call
  this.m3(z);//Non-Static private method_call
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


// DemoConcreteMethod3.java(MainClass)
package maccess;
import test.*;
public class DemoConcreteMethod3 {
    public static void main(String[] args) {
      IClass ob = new IClass();
      ob.m1(121);
      //ob.m3(234);//Error
      //ITest.m2(23);//Error
      ob.dis(12, 13);
    }
}

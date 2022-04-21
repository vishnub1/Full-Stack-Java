// SubClass.java
package test;
public class SubClass {
   public abstract static class AClass1{
      public abstract void m1(int x);
 }//InnerAbstractClass
 public abstract class AClass2{
    public abstract void m2(int y);
  }//InnerAbstractClass
}


// ITest.java
package test;
public interface ITest {
   public abstract static class AClass1{
      public abstract void m1(int x); 
 }//InnerAbstractClass
}//outerInterface


// AClass.java
package test;
public class AClass {
    public abstract static class AClass1{
      public abstract void m1(int x);
 }//InnerAbstractClass
    public abstract class AClass2{
      public abstract void m2(int y);
 }//InnerAbStarctClass
}//OuterAbstractClass

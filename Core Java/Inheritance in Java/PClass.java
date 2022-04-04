package test;
public class PClass {
	public int a=10;
	public void m1()
	{
		System.out.println("==PClass M1()==");
		System.out.println("Value of a :"+a);		
	}
	{
		System.out.println("==PClass Instance block==");
		System.out.println("The value of a :"+a);
	}
}

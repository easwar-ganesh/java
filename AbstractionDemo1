import java.io.*;
abstract class Base		
{
	abstract void fun();
}
class Derived extends Base
{
	void fun()
	{
		System.out.println("Derived fun is invoked");
	}
}
class AbstractDemo1
{
	public static void main(String args[])
	{
		Derived d =  new Derived();
		d.fun();
		Base b = new Derived();
		b.fun();
	}
}

import java.io.*;
abstract class Base
{
	Base()
	{
		System.out.println("Base class constructor invoked");
	}
	abstract void fun();
}
class Derived extends Base
{
	Derived()
	{
		super();
		System.out.println("Derived class constructor invoked");
	}
	void fun()
	{
		System.out.println("Derived fun is invoked");
	}
}
class AbstractDemo2
{
	public static void main(String args[])
	{
		Derived d = new Derived();
		d.fun();
	}
}

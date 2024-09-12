import java.io.*;
import java.util.*;
class Circlearea2
{
	double x,y,r;
	double area()
	{
		return(22/7.0)*r*r;
	}
	void setCircle(double a,double b,double c)
	{
		x=a;
		y=b;
		r=c;
	}
}
class CircleMain2
{
	public static void main(String args[])
	{
		Circlearea2 p1 = new Circlearea2();
		Circlearea2 p2=new Circlearea2();
		p1.setCircle(3.0,4.0,100);
		p1.setCircle(5.0,2.0,50);
		System.out.println("Area of circle1: "+p1.area());
		System.out.println("Area of circle2: "+p2.area());

	}

}
import java.io.*;
import java.util.Scanner;

class CircleArea6
{
	double r;
	CircleArea6()
	{
		r=0;
	}
	CircleArea6(double r)
	{
		this.r=r;
	}
	CircleArea6(int r)
	{
		this.r=r;
	}
	double area()
	{
		return (22/7.0)*r*r;
	}
	double area(double x)
	{
		return (22/7.0)*x*x;
	}
	void setCircle(double r)
	{
		this.r=r;
	}	
}

class CircleMain6
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		CircleArea6 c1 = new CircleArea6();
		System.out.println("Area of circle-1 is : "+c1.area());
		System.out.println("Area of circle-1 updated is : "+c1.area(8));
		CircleArea6 c2 = new CircleArea6(3.6);
		System.out.println("Area of circle-2 with radius 3.6 is : "+c2.area());
		CircleArea6 c3 = new CircleArea6(5);
		System.out.println("Area of circle-3 with radius 5   is : "+c3.area());
		CircleArea6 c4 = new CircleArea6();
		System.out.print("Enter radius of circle-4 : ");
		double radius = sc.nextDouble();
		c4.setCircle(radius);
		System.out.println("Area of circle-4 is : "+c4.area());
	}
}

import java.io.*;
import java.util.*;
class CircleArea7
{
    double r;
    CircleArea7()
    {
        r=0;
    }
    CircleArea7(double r)
    {
        this.r=r;
    }
    CircleArea7(CircleArea7 c)
    {
        this.r=c.r;
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

class CircleMain7
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		CircleArea7 c1 = new CircleArea7();
		System.out.println("Initially,area of circle -1 : "+c1.area());
		CircleArea7 c2 = new CircleArea7(7.0);
		System.out.println("Area of circle-2 with radius 7.0 : "+c2.area());
		System.out.println("Area of circle-2 with radius 5.5 :  "+c2.area(5.5));
		CircleArea7 c3 = new CircleArea7(c2);
		System.out.println("After copy constructor(c2),Area of circle -3 : "+c3.area());
		System.out.print("Enter radius of Circle to find area : ");
		double radius = sc.nextDouble();
		c1.setCircle(radius);
		System.out.println("Area of circle-1 : "+c1.area());
		
	}
}

import java.io.*;
import java.util.*;
class RectangleArea
{
	double l,b;
	double area()
	{
		return l*b;
	}
}
class RectangleMain
{
	public static void main(String args[])
	{
		RectangleArea ra = new RectangleArea();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length,breadth for area: ");
		ra.l=sc.nextInt();
		ra.b=sc.nextInt();
		System.out.println("Area of rectangle is"+ra.area());
	}
}

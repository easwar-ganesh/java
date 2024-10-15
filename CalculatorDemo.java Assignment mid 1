import java.io.*;
import java.util.Scanner;

public class CalculatorDemo
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		double n1 =sc.nextDouble();
		double n2=sc.nextDouble();
		System.out.println("Enter any operator(+,-,*,/):");
		char ch=sc.next().charAt(0);
		double result;
		switch(ch)
		{

		case '+':
				result =n1+n2;
				break;
		case '-':
				result =n1-n2;
				break;
		case '*':
				result =n1*n2;
				break;
		case '/':
				result =n1/n2;
				break;	
				
		default:	System.out.println("Invalid opeartor");
				return;
		}
		System.out.printf("%.1f %c %.1f= %.1f",n1,ch,n2,result);
					
	}
}
			

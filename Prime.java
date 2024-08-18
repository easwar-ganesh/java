import java.io.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        int n1;
        int n2;
        boolean response;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting value: ");
        n1 = sc.nextInt();
	  System.out.println("Enter the ending value: ");
        n2 = sc.nextInt();
        sc.close();
    
        if (n1 < 2)
            n1 = 2;
        if (n2 < 2)
        {
        	System.out.println("No prime numbers in range.");
        	return;
        }
        System.out.println("Result: ");
        for(int i = n1; i <= n2; i++)
        {
        	response = false;
            for(int j = 2; j < i; j++)
            { 
                if(i % j == 0)
                {
                response = true;
                }
            }
            if(!response)
                System.out.println(i);
        }     
    }
}
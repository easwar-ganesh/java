import java.io.*;
import java.util.Scanner;

class SumofDigits3
{
    int digitsSum(int n)
    {
        int temp,r,sum=0;
        temp=n;
        while(n>0 || sum>9)
        {
            if(n==0)
            {
                n=sum;
                sum=0;
            }
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        return sum;
    }
}
class SumofDigits3Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        SumofDigits3 sd = new SumofDigits3();
        int n;
        System.out.print("Enter an integer to find the sum of its digits : ");
        n=sc.nextInt();
        System.out.println("Sum of the digits of "+n+" is "+sd.digitsSum(n));
    }
}

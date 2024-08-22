import java.io.*;
import java.util.*;
public class Addition4
{
    int x,y,z;
    int add(int x,int y)
    {
        z=x+y;
        return z;
    }
    public static void main(String args[])
    {
        Addition4 a = new Addition4();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers for addition: ");
        a.x=sc.nextInt();
        a.y=sc.nextInt();
        a.z=a.add(a.x,a.y);
        System.out.println("Sum of"+a.x+"and"+y+"is"+a.z);
    }
}

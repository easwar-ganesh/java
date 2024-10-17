import java.io.*;
import java.util.Scanner;
class Minmax
{
  public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size of array:");
  int n=sc.nextInt();
  System.out.println("Enter" +n+ "values into the array:");
  int arr[]=new int[n];
  for(int i=0;i<n;i++)
  {
    arr[i]=sc.nextInt();
  }
int min=arr[0],max=arr[0];
for(int i=0;i<n;i++)
{
  if(min>arr[i])
  {
    min=arr[i];
  }
  if(max<arr[i])
  {
    max=arr[i];
  }
}
System.out.println("Min element of the array is:"+min);
System.out.println("Max element of the array is:"+max);
}
}

import java.io.*;
import java.util.*;
class Primecheck
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check it is prime(or) not: ");
      int num = sc.nextInt();
      boolean isprime=true;
      for(int i=2;i<num/2;i++){
          if(num%i==0){
              isprime=false;
              break;
          }
      }
      if(isprime==true)
      {
          System.out.println(num+"is a prime number");
      }
      else
      {
          System.out.println(num+"is not a prime number");

      }
    }
}

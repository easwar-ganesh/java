import java.io.*;
import java.util.*;

class FactRec {
  int Factorial(int n) {
    if (n == 0) {
      return 1;
    } else {
      return (n * Factorial(n - 1));
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    FactRec obj = new FactRec();
    
    System.out.println("Enter a number to find factorial:");
    int num = sc.nextInt();  

    System.out.println("The factorial of " + num + " is " + obj.Factorial(num));  
}

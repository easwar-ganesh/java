import java.io.*;

class Trycatch4 {
    public static void main(String args[]) {
        int a = 5, b = 0, c;

        try {
            c = a / b;  // This will throw an ArithmeticException
            System.out.println("Value of c is: " + c);
        } 
        catch (IOException ioe) {  // This catch block is irrelevant in this context
            System.out.println("IOException caught");
        }
    }
}

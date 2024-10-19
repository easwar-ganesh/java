import java.io.*;

class Trycatch3 {
    public static void main(String args[]) {
        int a = 5, b = 0, c;
        try {
            c = a / b; 
            System.out.println("Value of c is: " + c);
        } 
        catch (ArithmeticException ae) {
            System.out.println("ArithmeticException caught" );
        } 
        catch (ArrayIndexOutOfBoundsException x) {
            System.out.println("Array Exception caught "+x );
        } 
        catch (Exception e) {
            System.out.println("Exception caught " +e);
        }
    }
}

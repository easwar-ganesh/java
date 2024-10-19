import java.io.*;

class MultipleException {
    public static void main(String args[]) {
        int a = 5, b = 0, c;
        int arr[] = new int[5];
        String str = null;  
        try {
            c = a / b;  
            arr[10] = 200;  
            System.out.println("The length of String is:" + str.length());
            throw new IOException();  
        }
        catch (NullPointerException np) {  
            System.out.println("NullPointerException caught: " + np);
        }
        catch (ArrayIndexOutOfBoundsException x) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + x);
        }
        catch (ArithmeticException ae) {
            System.out.println("ArithmeticException caught: " );
        }
        catch (IOException ioe) {
            System.out.println("IOException caught: " + ioe);
        }
        catch (Exception e) {
            System.out.println(" Exception caught: " + e);
        }
        finally
        {
            System.out.println("Inside finally block");
            System.out.println("Rest of the code");
        }
    }
}

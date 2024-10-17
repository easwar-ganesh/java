import java.io.*;
class FibRec {
    int Fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return Fib(n - 1) + Fib(n - 2);
        }
    }
    public static void main(String args[]) {
        FibRec obj = new FibRec();
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i <= n; i++) {
            System.out.println(obj.Fib(i));
        }
    }
}

import java.util.*;

public class Fibonacci {
    private int fibonacci(int n) throws Error {
        if (n < 1)
            throw new Error("Đầu vào là nguyên âm hoặc 0");
        else if (n == 2 || n == 1)
            return 1;
        else 
            return this.fibonacci(n - 1) + this.fibonacci(n - 2);
    }

    private void ex2(int x, int a, int b) {
        if (!(a + b < x))
            return;
        System.out.print((a + b + (b == 0 ? 1 : 0)) + " ");
        ex2(x, b, a + b + (b == 0 ? 1 : 0));
    }

    private void ex3(int x, int a, int b) {
        if (x-- == 0) 
            return;
        System.out.print((a + b + (b == 0 ? 1 : 0)) + " ");
        ex3(x, b, a + b + (b == 0 ? 1 : 0));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number of fibonacci array's element: ");
        int n = sc.nextInt();
        Fibonacci fibo = new Fibonacci();
        System.out.print("Result:\n\t" + fibo.fibonacci(n) + "\n\t");
        fibo.ex3(n, 0, 0);
        System.out.print("\n\t");
        fibo.ex2(n, 0, 0);
        System.out.print("\n");
    }
}
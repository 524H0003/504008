import java.util.*;

public class Main {
    private static int factorial(int n) {
        if (n < 0)
            return -1;
        else if (n == 0 || n == 1)
            return 1;
        else 
            return n * Main.factorial(n - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number to factorial it: ");
        int n = sc.nextInt();
        System.out.print("Result: " + Main.factorial(n));
    }
}
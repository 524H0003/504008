import java.util.*;

public class GCD {
    private int type1(int a, int b) {
        if (b == 0)
            return a;
        return this.type1(b, a % b);
    }

    private int type2(int a, int b) {
        if (a == b)
            return a;
        if (a < b) {
            a += b;
            b = a - b;
            a -= b;
        }
        return this.type2(a - b, b);
    }

    public static void main(String[] args) {
        GCD gcd = new GCD();
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();
        System.out.println("GCD.type1: " + gcd.type1(a, b));                
        System.out.println("GCD.type2: " + gcd.type2(a, b));                
    }
}
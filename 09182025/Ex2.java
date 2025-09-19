
public class Ex2 {
    public static int factorial(int n) {
        if (n > 0)
            return n * factorial(n - 1);
        return 1;
    }

    public static double pow(double x, int n) {
        if (n > 0)
            return x * pow(x, n - 1);
        else if (n < 0)
            return 1.0 / (x * pow(x, (n + 1) * -1));
        return 1.0;
    }

    public static int numDigits(int x) {
        if (x > 0)
            return 1 + numDigits(x / 10);
        return 0;
    }

    private static boolean checkNotPrime(int x, int i) {
        if (i * i <= x)
            return x % i == 0 || checkNotPrime(x, i + 2);

        return false;
    };

    public static boolean isPrime(int x) {
        return !((x % 2 == 0 && x != 2) || checkNotPrime(x, 3));
    }

    public static int gcd(int x, int y) {
        if (x == y || y == 0)
            return x;
        
        if (x < y) {
            x += y;
            y = x - y;
            x -=y;
        }

        return gcd(y, x % y);
    } 

    public static void main(String[] args) {
        System.out.println(factorial(10));

        System.out.println(pow(2, -3));

        System.out.println(numDigits(943879));

        System.out.println(isPrime(11));

        System.out.println(gcd(10, 2));
    }
}

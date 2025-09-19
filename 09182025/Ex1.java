
public class Ex1 {
    public static int factorial(int n) {
        int ou = 1;

        for (int i = n; i > 1; i--)
            ou *= i;

        return ou;
    }

    public static double pow(double x, int n) {
        int ou = 1;

        for (int i = Math.abs(n); i > 0; i--) {
            ou *= x;
        }

        return n < 0 ? 1.0 / ou : ou;
    }

    public static int numDigits(int x) {
        int ou = 0;

        for (; x > 0; x /= 10)
            ou++;

        return ou;
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
        for (; x != y && y != 0;) {
            x %= y;

            if (x < y) {
                x += y;
                y = x - y;
                x -= y;
            }
        }

        return x;
    }

    public static void main(String[] args) {
        System.out.println(factorial(10));

        System.out.println(pow(2, -3));

        System.out.println(numDigits(943879));

        System.out.println(isPrime(11));

        System.out.println(gcd(10, 2));
    }
}

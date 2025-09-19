public class Ex4 {
    public static int a(int n) {
        if (n < 1)
            return 0;

        return (2 * n + 1) + a(n - 1);
    }

    public static int b(int n) {
        if (n < 1)
            return 0;

        if (n == 1)
            return 1;

        int out = b(n-1);

        return n * out + out;
    }

    public static int c(int n) {
        if (n < 1)
            return 0;

        if (n == 1)
            return 1;

        int out = c(n-1);
        
        return n * out * out;
    }

    public static int d(int n, int r) {
        if (n < r || r <= 0)
            return 1;

        return (n - r + 1) * d(n, r - 1);
    }

    public static int e(int n) {
        if (n == 1)
            return 3;

        if (n < 1)
            return -1;
        
        return (int) Math.pow(2, n) + n * n + e(n - 1);
    }

    public static void main(String[] args) {

    }
}

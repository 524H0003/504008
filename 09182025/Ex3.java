public class Ex3 {
    
    public static boolean checkPrime(int n, int d) {
        if (d * d > n)
            return true;

        return (n % d != 0 && checkPrime(n, d + 1 + (d % 2)));
    }

    public static void main(String[] args) {
        System.out.println(checkPrime(11, 2));
    }
}

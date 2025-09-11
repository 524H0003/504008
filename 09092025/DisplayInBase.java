import java.util.*;

public class DisplayInBase {
    private String exec(int n, int base) {
        if (n > 0 && base < 10) 
            return (n % base) + exec(n / base, base);
    }

    public static main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input n: ");
        int n = sc.nextInt();

        System.out.print("Input base: ");
        int base = sc.nextInt();

        System.out.println("Result: " + exec(n, base));
    }
}
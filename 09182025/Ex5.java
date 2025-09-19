public class Ex5 {
    public static String binaryDigits(int x) {
        if (x == 0)
            return "";

        return binaryDigits(x / 2) + x % 2;
    }

    public static void main(String[] args) {
        System.out.println(binaryDigits(10));
    }
}

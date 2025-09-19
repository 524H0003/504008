public class Ex7 {
    public static int a(int[] arr, int s) {
        if (s == 1)
            return arr[0];

        int ou = a(arr, s - 1);

        return arr[s - 1] < ou ? arr[s - 1] : ou;
    }

    public static int b(int[] arr, int s) {
        if (s == 1)
            return 0;

        return arr[s - 1] + b(arr, s - 1);
    }

    public static int c(int[] arr, int s) {
        if (s == 0) return 0;

        return (arr[s - 1] % 2 == 0 ? 1 : 0) + c(arr, s - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 5, 3, 1, 9, 5, 8 };

        System.out.println(a(arr, 9));
        System.out.println(b(arr, 9));
        System.out.println(c(arr, 9));
    }
}

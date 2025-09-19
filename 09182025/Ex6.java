public class Ex6 {
    public static int a(int[] arr, int s) {
        int ou = arr[0];

        for (int i = 1; i < s; i++)
            if (ou > arr[i])
                ou = arr[i];

        return ou;
    }

    public static int b(int[] arr, int s) {
        int ou = 0;

        for (; --s >= 0;)
            ou += arr[s];

        return ou;
    }

    public static int c(int[] arr, int s) {
        int ou = 0;

        for (; --s >= 0;)
            ou += arr[s] % 2 == 0 ? 1 : 0;

        return ou;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 5, 3, 1, 9, 5, 8 };

        System.out.println(a(arr, 9));
        System.out.println(b(arr, 9));
        System.out.println(c(arr, 9));
    }
}

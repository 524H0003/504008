
public class Bubble {
    static void output(int[] a) {
        for (int i = 0; i < a.length; ++i)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    // ascending, bottom up
    static int[] bubble1(int[] a) {
        int t;
        for (int i = 0; i < a.length - 1; ++i) {
            for (int j = a.length - 1; j > i; --j)
                if (a[j] < a[j - 1]) {
                    t = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = t;
                }
            output(a);
        }
        return a;
    }

    // ascending, up bottom
    static int[] bubble2(int[] a) {
        int t;
        for (int i = a.length - 1; i > 0; --i) {
            for (int j = 0; j < i; ++j)
                if (a[j] > a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            output(a);
        }
        return a;
    }

    // descending, bottom up
    static int[] bubble3(int[] a) {
        int t;
        for (int i = 0; i < a.length - 1; ++i) {
            for (int j = a.length - 1; j > i; --j)
                if (a[j] > a[j - 1]) {
                    t = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = t;
                }
            output(a);
        }
        return a;
    }

    // descending, up bottom
    static int[] bubble4(int[] a) {
        int t;
        for (int i = a.length - 1; i > 0; --i) {
            for (int j = 0; j < i; ++j)
                if (a[j] < a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            output(a);
        }
        return a;
    }

    public static void main(String[] arg) {
        int[] a = { 27, 38, 12, 39, 27, 16 };
        output(a);
        a = bubble4(a);
    }
}

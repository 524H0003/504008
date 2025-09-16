
public class Insertion {
    static void output(int[] a) {
        for (int i = 0; i < a.length; ++i)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    // ascending, bottom up
    static int[] insertion1(int[] a) {
        int x, j;
        for (int i = 1; i < a.length; ++i) {
            x = a[i];
            for (j = i - 1; j >= 0; --j) {
                if (x < a[j])
                    a[j + 1] = a[j];
                else
                    break;
            }
            a[j + 1] = x;
            output(a);
        }
        return a;
    }

    // ascending, up bottom
    static int[] insertion2(int[] a) {
        int x, j;
        for (int i = a.length - 2; i >= 0; --i) {
            x = a[i];
            for (j = i + 1; j < a.length; ++j) {
                if (x > a[j])
                    a[j - 1] = a[j];
                else
                    break;
            }
            a[j - 1] = x;
            output(a);
        }
        return a;
    }

    // descending, bottom up
    static int[] insertion3(int[] a) {
        int x, j;
        for (int i = 1; i < a.length; ++i) {
            x = a[i];
            for (j = i - 1; j >= 0; --j) {
                if (x > a[j])
                    a[j + 1] = a[j];
                else
                    break;
            }
            a[j + 1] = x;
            output(a);
        }
        return a;
    }

    // descending, up bottom
    static int[] insertion4(int[] a) {
        int x, j;
        for (int i = a.length - 2; i >= 0; --i) {
            x = a[i];
            for (j = i + 1; j < a.length; ++j) {
                if (x < a[j])
                    a[j - 1] = a[j];
                else
                    break;
            }
            a[j - 1] = x;
            output(a);
        }
        return a;
    }

    public static void main(String[] arg) {
        int[] a = { 27, 38, 12, 39, 27, 16 };
        output(a);
        a = insertion4(a);
    }
}

class Selection {
    // ascending, min
    static int[] selection1(int[] a) {
        int m, t;
        for (int i = 0; i < a.length - 1; ++i) {
            m = i;
            for (int j = i + 1; j < a.length; ++j)
                if (a[m] > a[j])
                    m = j;
            t = a[i];
            a[i] = a[m];
            a[m] = t;
            output(a);
        }
        return a;
    }

    // ascending, max
    static int[] selection2(int[] a) {
        int m, t;

        for (int i = a.length - 1; i > 0; --i) {
            m = i;

            for (int j = i - 1; j >= 0; --j)
                if (a[m] < a[j])
                    m = j;

            t = a[i];
            a[i] = a[m];
            a[m] = t;

            output(a);
        }

        return a;
    }

    // descending, max
    static int[] selection3(int[] a) {
        int m, t;

        for (int i = a.length - 1; i > 0; --i) {
            m = i;

            for (int j = i - 1; j >= 0; --j)
                if (a[m] > a[j])
                    m = j;

            t = a[i];
            a[i] = a[m];
            a[m] = t;

            output(a);
        }

        return a;
    }

    // descending, min
    static int[] selection4(int[] a) {
        int m, t;

        for (int i = 0; i < a.length - 1; ++i) {
            m = i;

            for (int j = i + 1; j < a.length; ++j)
                if (a[m] < a[j])
                    m = j;

            t = a[i];
            a[i] = a[m];
            a[m] = t;
            output(a);
        }

        return a;
    }

    static void output(int[] a) {
        for (int i = 0; i < a.length; ++i)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public static void main(String[] arg) {
        int[] a = { 27, 38, 12, 39, 27, 16 };
        output(a);
        a = selection4(a);
    }
}
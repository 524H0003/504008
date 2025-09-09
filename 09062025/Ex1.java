class Fraction {
    private int number = 0;
    private int denom = 1;

    private int gcd(int a, int b) {
        int t;

        while (a != 0) {
            t = a;
            a = b % a;
            b = t;
        }

        return b;
    }

    public Fraction(int x, int y) {
        int t = this.gcd(x, y);

        this.number = x / t;
        this.denom = y / t;
    }

    public Fraction() {
        this(0, 1);
    }

    public Fraction(Fraction f) {
        this(f.number, f.denom);
    }

    @Override
    public String toString() {
        return "" + this.number + "/" + this.denom;
    }

    @Override
    public boolean equals(Object f) {
        if (!(f instanceof Fraction))
            return  false;
        
        Fraction obj = new Fraction((Fraction) f);

        return ((obj.denom == this.denom) && (obj.number == this.number));
    }
}

public class Ex1 {
    public static void main(String[] args) {
        MyLinkedList<Fraction> list = new MyLinkedList<>();
        list.addFirst(new Fraction(2, 4));
        list.addLast(new Fraction(3, 8));
        list.print();
    }
}
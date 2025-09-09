import java.util.NoSuchElementException;

public class IntegerLinkedList extends MyLinkedList<Integer> {
    private boolean isPrime(int x) {
        if (x % 2 == 0)
            return false;
        
        for (int i = 3; i <= Math.sqrt(x); i += 2) {
            if (x % i == 0)
                return false;
        }
        
        return true;
    }

    public int countEven() {
        Node<Integer> i = this.getHead();
        int output = 0;

        while (i != null) {
            output += (i.getData() % 2);
            i = i.getNext();
        }

        return output;
    }

    public int countPrime() {
        Node<Integer> i = this.getHead();
        int output = 0;

        while (i != null) {
            output += this.isPrime(i.getData()) ? 1 : 0;
            i = i.getNext();
        }

        return output;
    }

    public void addBeforeFirstEven(Integer x) {
        Node<Integer> a = this.getHead(), b = this.getHead();

        while (a != null && a.getData() % 2 != 0) {
            b = a;
            a = a.getNext();
        }

        if (a == null)
            throw new NoSuchElementException("Even element not found in list.");
        
        if (a.equals(b)) 
            this.addFirst(x);
        else
            this.addAfter(b, x);
    }

    public int findMaximum() {
        Node<Integer> i = this.getHead();
        int output = i.getData();

        while (i != null) {
            if (output < i.getData())
                output = i.getData();

            i = i.getNext();
        }

        return output;
    }
}

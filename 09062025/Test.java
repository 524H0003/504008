
public class Test {

    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        Integer target = new Integer(5);
        list.addFirst(new Integer(2));
        list.addLast(new Integer(3));
        list.addLast(target);
        list.print();
        list.removeCurr(list.getHead());
        list.print();
    }
}

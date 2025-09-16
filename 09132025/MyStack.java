public class MyStack<E> implements StackInterface<E> {
    private MyLinkedList<E> stack;

    public MyStack() {
        stack = new MyLinkedList<>();
    }

    @Override
    public void push(E item) {
        stack.addFirst(item);
    }

    @Override
    public E pop() {
        return stack.removeFirst();
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public boolean contains(E item) {
        return stack.contains(item);
    }

    @Override
    public void print() {
        stack.print();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public E getPeek() {
        return stack.getFirst();
    }
}

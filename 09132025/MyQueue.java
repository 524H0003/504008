public class MyQueue<E> implements QueueInterface<E> {
    private MyLinkedList<E> queue;

    public MyQueue() {
        queue = new MyLinkedList<>();
    }

    @Override
    public void enQueue(E item) {
        queue.addLast(item);
    }

    @Override
    public E deQueue() {
        return queue.removeFirst();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean contains(E item) {
        return queue.contains(item);
    }

    @Override
    public void print() {
        queue.print();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public E getFront() {
        return queue.getFirst();
    }
}

public class Test {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();

        stack.push(new Integer(11));
        stack.push(new Integer(3));
        stack.push(new Integer(71));
        stack.push(new Integer(14));
        stack.push(new Integer(112));

        stack.print();

        stack.pop();

        stack.print();

        System.out.println(stack.contains(new Integer(3)) ? "True" : "False");
    }
}

class Test {
  public static void main(String[] arg) {
    // ex2
    String s = "10 15 5 25 30";
    String[] t = s.split(" ");
    BST b = new BST();
    b.root = new Node(Integer.parseInt(t[0]));
    int a;
    for (int i = 1; i < t.length; ++i) {
      a = Integer.parseInt(t[i]);
      b.insert(b.root, a);
    }

    // ex2
    b.NLR(b.root);
    System.out.println();
    // ex3
    b.RNL(b.root);
    System.out.println();

    // ex4
    System.out.println("Contains: " + b.contains(8));
    System.out.println("Contains: " + b.contains(15));
    // ex5
    b.deleteMax();
    b.LNR(b.root);
    System.out.println();

    // ex6
    b.delete_pre(10);
    b.LNR(b.root);
    System.out.println();

    // ex 7
    System.out.println(b.height());
    // ex 8
    System.out.println(b.sum());
    // ex 9
    System.out.println(b.sumEven());
    // Ex 10
    System.out.println(b.countLeaves(b.root));

  }
}

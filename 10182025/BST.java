class BST {
    public Node root;

    public BST() {
        root = null;
    }

    public Node insert(Node x, Integer key) {
        if (x == null)
            return new Node(key);
        int cmp = key.compareTo(x.key);
        if (cmp < 0)
            x.left = insert(x.left, key);
        else if (cmp > 0)
            x.right = insert(x.right, key);
        else
            x.key = key;
        return x;
    }

    public void NLR(Node x) {
        if (x != null) {
            System.out.print(x.key + " ");
            NLR(x.left);
            NLR(x.right);
        }
    }

    // ex3
    public void LNR(Node x) {
        if (x != null) {
            LNR(x.left);
            System.out.print(x.key + " ");
            LNR(x.right);
        }
    }

    public void RNL(Node x) {
        if (x != null) {
            RNL(x.right);
            System.out.print(x.key + " ");
            RNL(x.left);
        }
    }

    public Node search(Node x, Integer key) {
        if (x == null)
            return null;

        int cmp = key.compareTo(x.key);

        if (cmp < 0)
            return search(x.left, key);
        else if (cmp > 0)
            return search(x.right, key);

        return x;
    }

    public boolean contains(Integer key) {
        return search(root, key) != null;
    }

    // ex5
    public Node max(Node x) {
        if (x.right == null)
            return x;
        return max(x.right);
    }

    public Node deleteMax(Node x) {
        if (x.right == null)
            return x.left;
        x.right = deleteMax(x.right);
        return x;
    }

    public void deleteMax() {
        deleteMax(root);
    }

    public Node deleteMin(Node x) {
        if (x.left == null)
            return x.right;
        x.left = deleteMin(x.left);
        return x;
    }

    public void deleteMin() {
        deleteMin(root);
    }

    public Node min(Node x) {
        if (x.left == null)
            return x;
        return min(x.left);
    }

    // ex6
    public Node delete(Node x, Integer key) {
        if (x == null)
            return null;

        int cmp = key.compareTo(x.key);

        if (cmp < 0)
            x.left = delete(x.left, key);
        else if (cmp > 0)
            x.right = delete(x.right, key);
        else {
            if (x.right == null)
                return x.left;
            if (x.left == null)
                return x.right;
            x.key = min(x.right).key;
            x.right = deleteMin(x.right);
        }

        return x;
    }

    public Node delete_pre(Node x, Integer key) {
        if (x == null)
            return null;

        int cmp = key.compareTo(x.key);

        if (cmp < 0)
            x.left = delete(x.left, key);
        else if (cmp > 0)
            x.right = delete(x.right, key);
        else {
            if (x.right == null)
                return x.left;
            if (x.left == null)
                return x.right;
            x.key = max(x.left).key;
            x.left = deleteMax(x.left);
        }

        return x;
    }

    public void delete_pre(Integer key) {
        delete_pre(root, key);
    }

    // Ex 7
    int max(int a, int b) {
        return a > b ? a : b;
    }

    public int height(Node n) {
        if (n == null)
            return 0;

        return max(height(n.left), height(n.right)) + 1;
    }

    public int height() {
        return height(root);
    }

    // ex8
    public Integer sum(Node x) {
        if (x == null)
            return 0;

        return sum(x.left) + sum(x.right) + x.key;
    }

    public Integer sum() {
        return sum(root);
    }

    // ex 9
    public Integer sumEven(Node x) {
        if (x == null)
            return 0;

        return sumEven(x.left) + sumEven(x.right) + ((x.key % 2 == 0) ? x.key : 0);
    }

    public Integer sumEven() {
        return sumEven(root);
    }

    // Ex 10
    public int countLeaves(Node x) {
        if (x == null)
            return 0;

        return countLeaves(x.left) + countLeaves(x.right) + (x.left == null && x.right == null ? 1 : 0);
    }
}

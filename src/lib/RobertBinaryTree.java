package lib;

public class RobertBinaryTree {
    public Node<Integer> root;
    public int size;

    public RobertBinaryTree() {
        this.root = null;
        this.size = 0;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private Node<Integer> addRecursive(Node<Integer> current, int value) {
        if (current == null) {
            size++;
            return new Node<>(value);
        }

        if (value < current.getValue()) {
            current.setLeft(addRecursive(current.getLeft(), value));
        } else if (value > current.getValue()) {
            current.setRight(addRecursive(current.getRight(), value));
        } else {
            current.updateDuplicates();
        }

        return current;
    }

    public boolean contains(int value){
        Node<Integer> current = root;
        boolean found = containsRecursive(current, value);
        return found;
    }

    private boolean containsRecursive(Node<Integer> current, int value) {
        if (current == null) {
            return false;
        }
        if (value < current.getValue()) {
            return containsRecursive(current.getLeft(), value);
        }
        if (value > current.getValue()) {
            return containsRecursive(current.getRight(), value);
        }
        return true;
    }

    private void inOrder(Node<Integer> node) {
        if (node != null) {
            inOrder(node.getLeft());
            System.out.print(node.getValue() + "(" + node.getDuplicates() + ") ");
            inOrder(node.getRight());
        }
    }

    private void postOrder(Node<Integer> node) {
        if (node != null) {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.print(node.getValue() + "(" + node.getDuplicates() + ") ");
        }
    }

    private void preOrder(Node<Integer> node) {
        if (node != null) {
            System.out.print(node.getValue() + "(" + node.getDuplicates() + ") ");
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    public void printPreOrder() {
        System.out.print("Pre-order: ");
        preOrder(root);
        System.out.println();
    }

    public void printInOrder() {
        System.out.print("In-order: ");
        inOrder(root);
        System.out.println();
    }

    public void printPostOrder() {
        System.out.print("Post-order: ");
        postOrder(root);
        System.out.println();
    }


}
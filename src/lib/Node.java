package lib;

public class Node <T>{
    private T value;
    private Node<T> left;
    private Node<T> right;
    private int duplicates;

    public Node(T value) {
        this.value = value;
        this.duplicates = 0;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getLeft() {
        return left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }
    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void updateDuplicates() {
        this.duplicates++;
    }

    public int getDuplicates() {
        return duplicates;
    }

    public boolean isLeaf() {
        return left == null && right == null;
    }

    public boolean hasLeft() {
        return left != null;
    }

    public boolean hasRight() {
        return right != null;
    }

}

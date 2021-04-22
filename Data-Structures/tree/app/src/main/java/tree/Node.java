package tree;

public class Node <T>{
  public T value;
  public Node<T> left;
  public Node<T> right;

  public Node() {
  }

  public Node(T value, Node<T>left, Node<T>right) {
    this.value = value;
    this.left=left;
    this.right=right;

  }
}

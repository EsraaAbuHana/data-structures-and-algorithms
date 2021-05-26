package Tree;


public class NodeTree<T>{
  public T value;
  public NodeTree<T> left;
  public NodeTree<T> right;

  public NodeTree() {
  }

  public NodeTree(T value) {
    this.value = value;

  }

  @Override
  public String toString() {
    return "NodeTree{" +
      "value=" + value +
      ", left=" + left +
      ", right=" + right +
      '}';
  }
}

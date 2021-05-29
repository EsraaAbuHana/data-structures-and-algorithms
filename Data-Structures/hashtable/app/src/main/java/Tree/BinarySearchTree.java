package Tree;


public class BinarySearchTree extends BinaryTree {
  //  Define a method named add that accepts a value, and adds a new node with that value in the correct location in the binary search tree.
  public void add(Object value) {
    NodeTree addedNode = new NodeTree(value);
    NodeTree current = this.root;
    try {
      if (this.root == null) {
        this.root = addedNode;
      } else {
        while (current != null) {
          if ((int) current.value > (int) value) {
            if (current.left == null) {
              current.left = addedNode;
              break;
            }
            current = current.left;
          } else {
            if (current.right == null) {
              current.right = addedNode;
              break;
            }
            current = current.right;
          }
        }
      }
    } catch (Exception ex) {
      System.out.println(ex);
    }
  }

  @Override
  public String toString() {
    return "BinarySearchTree{" +
      "root=" + root +
      ", tree=" + tree +
      '}';
  }

  //  Define a method named contains that accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.
  public boolean contains(Object value) {
    NodeTree current = this.root;
    try {
      while (current != null) {
        if ((int) current.value == (int) value){ return true;}
        if ((int) current.value > (int) value) {
          current = current.left;
        } else
          current = current.right;

      }
    } catch (Exception ex) {
      System.out.println(ex);
    }
    return false;

  }


}

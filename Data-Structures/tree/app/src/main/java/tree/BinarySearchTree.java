package tree;

public class BinarySearchTree extends BinaryTree{
//  Define a method named add that accepts a value, and adds a new node with that value in the correct location in the binary search tree.
  public void add(T value){
    if (this.root == null) {
      this.root = new Node<T>(value);
    } else {

    }
  }
//  Define a method named contains that accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.
public boolean contains(T value) {
    if (tree.size()==0)
      this.root=new Node<T>(value);
    while (root!=null) {
     if (root.value == value)
       return true;
    }

}


}

package tree;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;

public class BinaryTree<T> {
  Node root;

  ArrayList<T> tree = new ArrayList<T>();
  //preorder
  //  Pre-order: root >> left >> right

  public ArrayList<Object> preOrder(Node root) {
    ArrayList<Object> output=new ArrayList<Object>();
    try {

      if (root == null) {
          return output;
      } else {
        output.add(root.value);
        if (root.left != null)
          output.addAll(preOrder(root.left)) ;

        if (root.right != null)
          output.addAll(preOrder(root.right)) ;
      }

    } catch (Exception ex) {
      System.out.println(ex);
    }

    return output;
  }

  //inOrder
  //  In-order: left >> root >> right
  public ArrayList<Object> inOrder(Node root) {
    ArrayList<Object> output=new ArrayList<Object>();
    try {

      if (root == null) {
        return output;
      } else {
        if (root.left != null)
          output.addAll(preOrder(root.left)) ;
        output.add(root.value);

        if (root.right != null)
          output.addAll(preOrder(root.right)) ;
      }

    } catch (Exception ex) {
      System.out.println(ex);
    }

    return output;
  }

//  //postOrder
////  Post-order: left >> right >> root
public ArrayList<Object> postOrder(Node root) {
  ArrayList<Object> output=new ArrayList<Object>();
  try {

    if (root == null) {
      return output;
    } else {
      if (root.left != null)
        output.addAll(preOrder(root.left)) ;

      if (root.right != null)
        output.addAll(preOrder(root.right)) ;
      output.add(root.value);
    }

  } catch (Exception ex) {
    System.out.println(ex);
  }

  return output;
}

}

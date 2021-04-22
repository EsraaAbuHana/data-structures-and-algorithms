package tree;

import java.util.ArrayList;

public class BinaryTree {
  Node<T> root;

  ArrayList<T> tree = new ArrayList<T>();
  //preorder
  //  Pre-order: root >> left >> right

  public ArrayList<T> preOrder(T value) {
    Node<T> newNode = this.value;

    try {
      if (root == null) {
        this.root = newNode;
      } else {
        if (root.left != null)
          preOrder(root.left.value);
        if (root.right != null)
          preOrder(root.right.value);
      }

    } catch (Exception ex) {
      System.out.println(ex);
    }


    return tree;
  }

  //inOrder
  //  In-order: left >> root >> right

  public ArrayList<T> inOrder(T value) {
    Node<T> newNode = this.value;

    try {
      if (root == null) {
        this.root = newNode;
      } else {
        if (root.left != null)
          preOrder(root.left.value);
        if (root.right != null)
          preOrder(root.right.value);
      }

    } catch (Exception ex) {
      System.out.println(ex);
    }


    return tree;
  }

  //postOrder
//  Post-order: left >> right >> root
  public ArrayList<T> postOrder(T value) {
    Node<T> newNode = this.value;

    try {
      if (root == null) {
        this.root = newNode;
      } else {
        if (root.left != null)
          preOrder(root.left.value);
        if (root.right != null)
          preOrder(root.right.value);
      }

    } catch (Exception ex) {
      System.out.println(ex);
    }


    return tree;
  }


}

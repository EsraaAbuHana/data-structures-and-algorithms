package TreeIntersection;

import Tree.BinarySearchTree;
import Tree.BinaryTree;
import Tree.NodeTree;
import hashtable.Hashtable;

public class TreeIntersection {
  public static void main(String[] args) {
    BinarySearchTree first=new BinarySearchTree();
    BinarySearchTree second=new BinarySearchTree();
    first.add(5);
    first.add(1);
    first.add(7);
    first.add(10);
    first.add(4);
    first.add(8);
    first.add(7);
    first.add(11);
    System.out.println(first.contains(7));
    System.out.println(first.contains(7));
    System.out.println(first);
    System.out.println(first.inOrder(first.root));
    System.out.println(treeIntersection(first,second)); 
//    System.out.println();
  }
public static Hashtable treeIntersection(BinarySearchTree first,BinarySearchTree second){
  Hashtable common=new Hashtable();
  for (int i = 0; i < first.inOrder(first.root).size(); i++) {
    if (second.contains(i)){
      common.add(i,i);
    }
  }
return common;
}
}

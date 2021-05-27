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
    first.add(11);
    second.add(10);
    second.add(4);
    second.add(8);
    second.add(7);

    Hashtable hashtable=treeIntersection(first,second);
//    System.out.println(hashtable.hash(7));
//
//    for (int i = 0; i < treeIntersection(first,second).getHashNodesList().length; i++) {
//        if(treeIntersection(first,second).getHashNodesList()[i]!=null){
//          System.out.println(hashtable.value(i));
//          System.out.println(hashtable.hash(i));
//        }
//        }
    }
//    System.out.println();

public static Hashtable treeIntersection(BinarySearchTree first,BinarySearchTree second){
  Hashtable common=new Hashtable();
  for (int i = 0; i < first.inOrder(first.root).size(); i++) {
    if (second.contains(i)){
      common.add(i,i);
    }
  }
  System.out.println(common);
return common;
}
}

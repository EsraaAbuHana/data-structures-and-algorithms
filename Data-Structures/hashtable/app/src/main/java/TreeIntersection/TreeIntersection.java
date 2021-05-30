package TreeIntersection;


import hashtable.Hashtable;
import Tree.BinarySearchTree;
import Tree.BinaryTree;
import Tree.NodeTree;
import java.util.ArrayList;

public class TreeIntersection {
  private static Hashtable output=new Hashtable();

  public static void main(String[] args) {

    BinarySearchTree first=new BinarySearchTree();
    BinarySearchTree second=new BinarySearchTree();
    first.add(5);
    first.add(1);
    first.add(4);
    first.add(7);
    first.add(11);
    second.add(10);
    second.add(4);
    second.add(8);
    second.add(7);

    ArrayList common=treeIntersection(first,second);
    System.out.println(common);
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
public static ArrayList treeIntersection(BinarySearchTree first,BinarySearchTree second){
output=new Hashtable();
output=addToHashTable(first.root);
 return checkCommon(second.root);
}
public static ArrayList checkCommon(NodeTree root){
ArrayList arrayOutput=new ArrayList();
  try {
    if (root == null) {
      return arrayOutput;
    } else {
      if (root.left != null)
        arrayOutput.addAll(checkCommon(root.left)) ;
      if (output.contains(root.value)){
      arrayOutput.add(root.value);}
      if (root.right != null)
        arrayOutput.addAll(checkCommon(root.right)) ;
    }
  } catch (Exception ex) {
    System.out.println(ex);
  }
  return arrayOutput;
}
  public static Hashtable addToHashTable(NodeTree root) {
    try {
      if (root == null) {
        return output;
      } else {
        if (root.left != null)
          addToHashTable(root.left) ;
        output.add(root.value, root.value);
        if (root.right != null)
          addToHashTable(root.right) ;
      }
    } catch (Exception ex) {
      System.out.println(ex);
    }
    return output;
  }
//public static Hashtable treeIntersection(BinarySearchTree first,BinarySearchTree second){
//  Hashtable common=new Hashtable();
//  if(first.root==null||second.root==null){return null;}
//  for (int i = 0; i < first.inOrder(first.root).size(); i++) {
//    if (second.contains(i)){
//      common.add(i,i);
//    }
//  }
//  System.out.println(common);
//return common;
//}
}

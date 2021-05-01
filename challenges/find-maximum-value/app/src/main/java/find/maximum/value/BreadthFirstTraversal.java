package find.maximum.value;
import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;
public class BreadthFirstTraversal extends BinaryTree {

  public BreadthFirstTraversal(Object value) {

  }

  //  public BreadthFirstTraversal() {
//
//  }
//  public static ArrayList<Object> output(){
//    ArrayList<Object> array=new ArrayList<Object>();
//  return array;
//  }
//  [2, | 7,5 | ,2,6,9 | ,5,11,4]
  public static ArrayList breadthFirstTraversal(BinaryTree input) {
      ArrayList output = new ArrayList();
    Queue q = new Queue();
    q.enqueue(input.root);
    try{
      while (q.front != null){

        output.add(((Node) q.front.value).value);
        if(((Node) q.front.value).left != null) {
          q.enqueue(((Node) q.front.value).left);
        }
        if(((Node) q.front.value).right != null) {
          q.enqueue(((Node) q.front.value).right);
        }
        q.dequeue();
      }
    }catch (Exception ex){
      System.out.println(ex);
    }


//    ArrayList<Object> levelArray = new ArrayList<Object>();
//    ArrayList<Object> outputArray = new ArrayList<Object>();
//    outputArray.add(input.root.value) ;
//    Node root=input.root;
//    Node left=input.root.left;
//    Node right=input.root.right;
////   if(input.root==null){
////     return new NullPointerException();
////   }
//    try {
//      while (left != null && right!=null) {
////      if (this.root.left)
//      if (left!=null) {
////        levelArray.add(left.value);
//        outputArray.add(left.value);
//        left=left.left;
//        root=left;
//      }
//      if (right!=null) {
////        levelArray.add(right.value);
//        outputArray.add(right.value);
//        right=right.right;
//        root=right;
//      }
////      outputArray.addAll(levelArray) ;
////levelArray.clear();
////        System.out.println(levelArray);
//      }
////      outputArray.addAll(levelArray) ;
//    }catch (Exception ex){
//      System.out.println(ex);
//    }
    return output;
  }
}


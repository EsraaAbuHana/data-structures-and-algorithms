package find.maximum.value;

import java.util.ArrayList;

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
  public static ArrayList breadthFirstTraversal(BinaryTree input) {
    ArrayList<Object> levelArray = new ArrayList<Object>();
    ArrayList<Object> outputArray = new ArrayList<Object>();
    while (input.root != null) {
//      if (root.left)
      outputArray.add(input.root);

      System.out.println(input.toString());
      outputArray.addAll(levelArray) ;

    }
    return outputArray;

  }

}


package LeftJoin;

import hashtable.Hashtable;
import linkedList.LinkedList;

public class LeftJoin {
  public static void main(String[] args) {
    Hashtable left = new Hashtable();
    Hashtable right = new Hashtable();
    left.add("hi", "hello");
    left.add("a", "yah");
    left.add("n", "n");
    left.add("groot", "esraa");
    left.add("b", "bee");

    right.add("hi", "hello");
    right.add("a", "yah");
    right.add("n", "noo");
    right.add("groot", "esraa");
    right.add("b", "bees");
    right.add("c", "cee");

    System.out.println(left.get("hi"));
    System.out.println(left.value("hi"));

    System.out.println(right.hash("c"));
    System.out.println(left.getHashNodesList()[263]);
    System.out.println(left.getHashNodesList().length);
    System.out.println(left.getHashNodesList()[263]);
    System.out.println(right.get(left.get("n")));
    System.out.println(left.hash("hi"));
    System.out.println(left.contains("hi"));
    System.out.println(right.get(left.getHashNodesList()[933]));
    System.out.println(left);
//    System.out.println(left.getHashNodesListValues());
    leftJoin(left,right);
    System.out.println( leftJoin(left,right));
  }

  //  LEFT JOIN means all the values in the first hashmap are returned, and if values exist in the “right” hashmap, they are appended to the result row.
//  If no values exist in the right hashmap, then some flavor of NULL should be appended to the result row.
//  The returned data structure that holds the results is up to you. It doesn’t need to exactly match the output below,
//  so long as it achieves the LEFT JOIN logic.
//  Avoid utilizing any of the library methods available to your language.
  public static Hashtable leftJoin(Hashtable left, Hashtable right) {
    Hashtable output = new Hashtable();
//    LinkedList output= new LinkedList();
//String[][] output=
//    System.out.println(right.get(left.get("n")));
    String[]values;
if( left.getHashNodesList().length>0){
    for (int i = 0; i < left.getHashNodesList().length; i++) {
      output.add(left.getHashNodesList()[i], left.getHashNodesList()[i]);
      if (right.contains(left.get(right.get(left.getHashNodesList()[i])))){
        output.add(left.getHashNodesList()[i], right.get(left.getHashNodesList()[i]));
      }else {
        output.add(left.getHashNodesList()[i], "NULL");
      }
    }
  }
    return output;
  }
}

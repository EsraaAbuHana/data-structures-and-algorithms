//package linkedList;
//public class LinkedList {
////  public Node head;
////  public  LinkedList(){
////    this.head=null;
//  }
//
//public void insert(int val){
//    this.head=new Node(val,head);
//}
////  Define a method called includes which takes any value as an argument
////  and returns a boolean result depending on whether that value exists
////  as a Node’s value somewhere within the list.
//public boolean includes(int val){
//boolean result;
//Node curent=this.head;
//while (curent !=null){
//  if (curent.val==val){
//    result=true;
//  }
//  curent=curent.next;
//
//}
//return result ;
////}
//
////  Define a method called toString (or __str__ in Python) which takes
////  in no arguments and returns a string representing all the values in
////  the Linked List, formatted as:   "{ a } -> { b } -> { c } -> NULL"
//public String toString(){
//  Node curent=this.head;
//String linkedListValues;
//  while (curent !=null){
//    if (curent.next==null){
//      linkedListValues="{"+curent.val+"}";
//    }
//    linkedListValues="{"+curent.val+"}->"
//  }
//
//}
//
//}

package linkedList;

public class LinkedList {
  public static void main(String[] args) {
    LinkedList linkedList=new LinkedList();
    linkedList.insert(7);
    System.out.println(linkedList.toString());
    System.out.println(linkedList.includes(7));
    System.out.println(linkedList.includes(8));
    linkedList.insert(8);
    System.out.println(linkedList.toString());
    System.out.println(linkedList.includes(8));

  }
  public Node head;
  public LinkedList(){
   this.head=null;
}

  public void insert(int val){
    Node newNode=new Node(val);
    if (head==null) {
   head=newNode;
    }else{
      newNode.next=head;
      head=newNode;

    }
    }

  //  Define a method called includes which takes any value as an argument
//  and returns a boolean result depending on whether that value exists
//  as a Node’s value somewhere within the list.
  public boolean includes(int val){
    Node current=this.head;
    while (current !=null){
      if (current.val==val){
        return true;
      }
      else
      {current=current.next;}
    }

    return false;
  }

  //  Define a method called toString (or __str__ in Python) which takes
//  in no arguments and returns a string representing all the values in
//  the Linked List, formatted as:   "{ a } -> { b } -> { c } -> NULL"
  public String toString(){
    Node curent=this.head;
    String linkedListValues="";
    while (curent !=null){


        linkedListValues = linkedListValues + "{" + curent.val + "}->";

      curent = curent.next;

    }
return linkedListValues+"Null";
  }

}


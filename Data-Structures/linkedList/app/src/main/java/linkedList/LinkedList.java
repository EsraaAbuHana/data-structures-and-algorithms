package linkedList;

public class LinkedList {
  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.insert(7);
    System.out.println(linkedList.toString());
    System.out.println(linkedList.includes(7));
    System.out.println(linkedList.includes(8));
    linkedList.insert(8);
    System.out.println(linkedList.toString());
    System.out.println(linkedList.includes(8));
    linkedList.append(5);
    linkedList.append(6);
    linkedList.insertBefore(6, 9);
    linkedList.insertAfter(5, 2);

    System.out.println(linkedList.toString());
//linkedList.findK(2);
    System.out.println("Node of K :"+linkedList.findNodeK(1));

  }

  public Node head;

  public LinkedList() {
    this.head = null;
  }

  public void insert(int val) {
    Node newNode = new Node(val);
    if (head == null) {
      head = newNode;
    } else {
      newNode.next = head;
      head = newNode;

    }
  }

  //  Define a method called includes which takes any value as an argument
//  and returns a boolean result depending on whether that value exists
//  as a Node’s value somewhere within the list.
  public boolean includes(int val) {
    Node current = this.head;
    while (current != null) {
      if (current.val == val) {
        return true;
      } else {
        current = current.next;
      }
    }

    return false;
  }

  //  Define a method called toString (or __str__ in Python) which takes
//  in no arguments and returns a string representing all the values in
//  the Linked List, formatted as:   "{ a } -> { b } -> { c } -> NULL"
  public String toString() {
    Node curent = this.head;
    String linkedListValues = "";
    while (curent != null) {


      linkedListValues = linkedListValues + "{" + curent.val + "}->";

      curent = curent.next;

    }
    return linkedListValues + "Null";
  }

  //.append(value)
//  Input                        	Args	                    Output
//  head -> [1] -> [3] -> [2] -> X	5	head -> [1] -> [3] -> [2] -> [5] -> X
//
  public void append(int val) {
    Node appendedNode = new Node(val);
//    String linkedListValues="";
    Node currentNode = head;
    if (head == null) {
      head = appendedNode;
    } else {
      while (currentNode.next != null) {

        currentNode = currentNode.next;
      }
      currentNode.next = appendedNode;
    }
  }

  //  .insertBefore(value, newVal)
//  Input	Args	Output
//  head -> [1] -> [3] -> [2] -> X	3, 5	head -> [1] -> [5] -> [3] -> [2] -> X
//  head -> [1] -> [3] -> [2] -> X	4, 5	Exception
  public void insertBefore(int val, int newVal) {
    Node appendedNode = new Node(newVal);

//    String linkedListValues="";

    Node currentNode = head;
    if (head != null && head.val == val) {
      appendedNode.next = head;
      head = appendedNode;
    } else {
      while (currentNode.next != null) {
        if (currentNode.next.val == val) {
          appendedNode.next = currentNode.next;
          currentNode.next = appendedNode;
          break;
        }
        currentNode = currentNode.next;
      }
    }
  }

  public void insertAfter(int val, int newVal) {

    Node current = this.head;
    Node newNode = new Node(newVal);
    while (current != null) {
      if (current.val == val) {
        newNode.next = current.next;
        current.next = newNode;
        break;
      }
      current = current.next;
    }

  }
//k is the index from the last
  public int findNodeK(int k) {
    int counter = 0;
    int counterReverse = 0;

    Node current = this.head;
//    Node next=current.next;
//    while (current.next == null) {
//
//      if (k != counterReverse) {
//=head;
//        current.next=null;
//               counterReverse++;
//
//      } else {
//        break;
//
//      }
//    }
//    return current.val;
//
    while (current.next!=null) {
      current = current.next;
    counter++;
//      System.out.println(current);
    }
    System.out.println("counter : "+counter);//5
counterReverse=counter-k;
counter=0;
current=this.head;
    System.out.println(counter);
    System.out.println(counterReverse);
    while (current.next!=null) {
      if(counterReverse==counter){
        break;
      }
      current = current.next;
      counter++;
    }
return current.val;
    //    while (current.next!=null&&counterReverse==counter) {
//      current = current.next;
//      counter++;
//      System.out.println(current);
//    }

//      System.out.println(current);
 }
}


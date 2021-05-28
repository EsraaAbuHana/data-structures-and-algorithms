package linkedList;

public class LLProblems {
  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    int[] test1 = {5, 13, 15, 18, 20, 11, 6, 7};
    for (int i = 0; i < test1.length; i++) {
      ll.append(test1[i]);
    }
    ll.append(20);
    System.out.println(ll);
swap(ll);
    System.out.println(ll);
  }


  //  Given a singly linked list, swap every 2 nodes, for odd number of input; retain the last node as it is.
//    Examples:
//  Input: 5 13 15 18 20 11 6 7
//  Output: 13 5 18 15 11 20 7 6
  public static void swap(LinkedList ll) {
Node current=ll.head;

while (current!=null&&current.next!=null&&current.next.next!=null ){
 int temp=current.val;
  current.val=current.next.val;
  current.next.val=temp;
  current=current.next.next;
}
  }

  

}

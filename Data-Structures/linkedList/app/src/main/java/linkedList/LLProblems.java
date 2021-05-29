package linkedList;

public class LLProblems {
  public static void main(String[] args) {
    LinkedList ll1 = new LinkedList();
    LinkedList ll2 = new LinkedList();
    int[] test1 = {1, 2, 4,20,30,40,100,111};
    int[] test2 = {1, 3, 4,10,20,35};
    for (int i = 0; i < test1.length; i++) {
      ll1.append(test1[i]);
    }
    for (int i = 0; i < test2.length; i++) {
      ll2.append(test2[i]);
    }
    merge(ll1,ll2);
    System.out.println(ll1);
  }
  //    Input: //    l1 = [1, 2, 4],l2 = [1, 3, 4] //    Output: [1, 1, 2, 3, 4, 4]
  public static void merge(LinkedList ll1,LinkedList ll2){
    Node current1=ll1.head;
    Node current2=ll2.head;
    Node firstNext,secondNext;
    while (current1.next!=null&&current2.next!=null){
      if ( current1.next.val>=current2.val){
        firstNext=current2;
        secondNext=current2.next;
        current2.next=current1.next;
        current1.next=current2;
        current2=secondNext;
      }
      current1=current1.next;
    }
    while (current1.next!=null){
      current1=current1.next;
    }
while (current2!=null){
     current1.next = current2;
   current2 = current2.next;
//   if(current1.val>current1.next.val) {
//     int temp = current1.val;
//     current1.val = current1.next.val;
//     current1.next.val = temp;
//     current1 = current1.next.next;
//   }
 }


  }
  public static void deleteEnd(LinkedList ll, int n) {
    Node current = ll.head;
    Node current2 = ll.head;
    int i = 0;
    while (current != null) {
      if (i > n) {
        current2 = current2.next;
      }
      current = current.next;
      i++;
    }
    current2.next = current2.next.next;
  }

  public static void swap(LinkedList ll) {
    Node current = ll.head;
    while (current != null && current.next != null && current.next.next != null) {
      int temp = current.val;
      current.val = current.next.val;
      current.next.val = temp;
      current = current.next.next;
    }
  }

  //  Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.
//    Examples:
//  Input: l1 = [1,2,4], l2 = [1,3,4]
//  Output: [1,1,2,3,4,4]
//  public static LinkedList merge1(LinkedList firstList, LinkedList secondList) {
//
//    Node firstCurrent = firstList.head;
//    Node secondCurrent = secondList.head;
//    Node firstNext;
//    Node secondNext;
//    if (firstCurrent == null) {
//      return secondList;}
//    if (secondCurrent == null){
//      return firstList;
//    }
//    while(firstCurrent != null && secondCurrent != null){
//      firstNext = firstCurrent.next;
//      secondNext = secondCurrent.next;
//      firstCurrent.next = secondCurrent;
//      firstCurrent = firstNext;
//
//      if (firstCurrent == null){
//        break;}
//      secondCurrent.next = firstCurrent;
//      secondCurrent = secondNext;
//      if (secondCurrent == null) {
//        break;
//      }
//      try {
//        if( firstCurrent!= null&& firstCurrent.next != null&& firstCurrent.next.next != null&&firstCurrent.val>firstCurrent.next.val ) {
//
//          int temp = firstCurrent.val;
//          firstCurrent.val = firstCurrent.next.val;
//          firstCurrent.next.val = temp;
//        }
//      }catch ( NullPointerException ex){
//        System.out.println(ex);
//      }
//    }
//    return firstList;
//  }
//    public static LinkedList merge(LinkedList ll1, LinkedList ll2) {
//    Node current1 = ll1.head;
//    Node current2 = ll2.head;
//    Node next1, next2;
//    if (current1 == null) return ll2;
//    if (current2 == null) return ll1;
//    while (current1 != null && current2!= null) {
//      next1 = current1.next;
//      next2 = current2.next;
//      if (current1.next.val > current2.val) {
//        if (current1.val <= current2.val) {
//          current1.next = current2;
//          current2.next = next1;
//          next1.next = next2;
//        }
//      }
//      current2=current2.next;
////      current1=current1.next;
//    }
//    return ll1;
//  }


}

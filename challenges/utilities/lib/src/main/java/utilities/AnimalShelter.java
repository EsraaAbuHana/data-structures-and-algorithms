package utilities;

public class AnimalShelter<T> {
  Node<T> front;
  Node<T>  rear;


//public class Queue<T> {
//  Node front;
//  Node rear;
  public AnimalShelter() {

  }
  public AnimalShelter(T value) {
    this.front = new Node(value);
    this.rear = this.front;
  }



  public void enqueue(T animal) {
    try {
      if(rear==null){
        front=new Node(animal);
        rear=front;
      }else {
        this.rear.next=new Node(animal);
        this.rear=this.rear.next;
      }
    }catch (Exception ex){
      System.out.println(ex);
    }
  }

  public T dequeue(T pref) {
    try {
      if(isEmpty()){
        new NullPointerException();
      }else {
       if(pref!="cat"&&pref!="dog"){
         pref= null;

       }else{
         this.front=this.front.next;
       }
      }
    }catch (Exception ex){
      System.out.println(ex);

    }
//    return deletedNode.value;
    return pref;
  }


  public boolean isEmpty() {
    return front == null;
  }
  @Override
  public String toString() {
    return "Shelter{" +
      "front=" + front +
      ", rear=" + rear +
      '}';
  }
}

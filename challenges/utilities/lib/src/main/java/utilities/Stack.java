package utilities;


  public class Stack<T> {
    Node top;

    public Stack() {

    }

    public Stack(T value) {
      this.top = new Node(value);
    }

    public void push(T value) {
      try {
        Node node = new Node(value);
        node.next = top;
        top = node;
      } catch (Exception ex) {
        System.out.println(ex);
      }

    }

    public Object pop() {
      Node lastNode=top;
      try {
        if(isEmpty()){
          return new NullPointerException();
        }
        top=top.next;
        lastNode.next=null;
      }catch (NullPointerException ex){
        System.out.println(ex);
      }
      return lastNode;
    }

    public Object peek() {
      try {
        if (isEmpty()){
          return new  NullPointerException();
        }else{
          return top.value;
        }
      }catch (Exception ex){
        return ex;
      }
    }

    public boolean isEmpty() {
      return top == null;
    }

    @Override
    public String toString() {
      return "Stack{" +
        "top=" + top +
        '}';
    }
  }


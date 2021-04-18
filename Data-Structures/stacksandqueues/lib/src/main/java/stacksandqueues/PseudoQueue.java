package stacksandqueues;

public class PseudoQueue<T> {
  public Stack getFirstStack() {
    return firstStack;
  }

  public void setFirstStack(Stack firstStack) {
    this.firstStack = firstStack;
  }

  public Stack getSecondStack() {
    return secondStack;
  }

  public void setSecondStack(Stack secondStack) {
    this.secondStack = secondStack;
  }

  Stack firstStack;
  Stack secondStack;

  public PseudoQueue() {
    this.firstStack = new Stack();
    this.secondStack = new Stack();
  }
  public void enqueue(T value){
    try {
      while (!firstStack.isEmpty()){
        secondStack.push(firstStack.pop());
      }
      firstStack.push(value);
      while (!secondStack.isEmpty()){
        firstStack.push(secondStack.pop());
      }
    }catch (Exception ex){
      System.out.println(ex);
    }
  }

  public Object dequeue(){
    Object extractStack = new Object();
    try {
      extractStack = firstStack.pop();
    }catch (NullPointerException ex){
      System.out.println(ex);
    }
    return extractStack;
  }
  @Override
  public String toString() {
    return "PseudoQueue{" +
      "firstStack=" + firstStack +
      ",secondStack=" + secondStack +
      '}';
  }
}

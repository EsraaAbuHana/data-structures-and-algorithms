package hashtable;



import java.util.Arrays;
import linkedList.LinkedList;
import linkedList.Node;

public class Hashtable<T> {
  private Object[] hashNodesList = new Object[1024];

  public Hashtable() {
  }

  public Hashtable(Object[] hashNodesList) {
    this.hashNodesList = hashNodesList;
  }

  public Object[] getHashNodesList() {
    return hashNodesList;
  }

  public void setHashNodesList(Object[] hashNodesList) {
    this.hashNodesList = hashNodesList;
  }

  int hashFunc(char c) {
    return (c);
  }

  public int hash(T S) {
    int hasHCharsSum = 0;
    String convertedString = S.toString();
    for (int i = 0; i < convertedString.length(); i++) {

      int index = hashFunc(convertedString.charAt(i));
      hasHCharsSum += index;
    }
    return hasHCharsSum * 599 % 1024;

  }

  public void add(T key, T value) {
    int index = hash(key);
    NodeHT newNode = new NodeHT(key, value);
    LinkedList linkedList = new LinkedList();
    if (hashNodesList[index] != null) {
      linkedList = (LinkedList) hashNodesList[index];
    }
    linkedList.append((T) newNode);
    hashNodesList[index] = (T) linkedList;

  }

  public T get(T key) {
    int index = hash(key);
    if (hashNodesList[index] != null) {
      LinkedList linkedList = (LinkedList) hashNodesList[index];
      Node current = linkedList.head;
      while (current != null) {
        if (((NodeHT) current.val).getKey() == key) {
          return (T) ((NodeHT) current.val).getValue();
        }
        current=current.next;
      }
    }
    return null;
  }

  public boolean contains(T key) {
    int index = hash(key);
    if (hashNodesList[index] != null) {
      LinkedList linkedList = (LinkedList) hashNodesList[index];
      Node current = linkedList.head;
      while (current != null) {
        if (((NodeHT) current.val).getKey().equals(key) ) {
          return true;
        }
        current=current.next;
      }
    }

    return false;
  }

  @Override
  public String toString() {
    return "Hashtable{" +
      "hashNodesList=" + Arrays.toString(hashNodesList) +
      '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Hashtable<?> hashtable = (Hashtable<?>) o;
    return Arrays.equals(hashNodesList, hashtable.hashNodesList);
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(hashNodesList);
  }

  public Object value(T key) {
    int index = hash(key);
    Object value;
    if (hashNodesList[index] != null) {
      LinkedList linkedList = (LinkedList) hashNodesList[index];
      Node current = linkedList.head;
      while (current != null) {
        if (((NodeHT) current.val).getKey() == key) {
          return ((NodeHT<?>) current.val).getValue();
        }
        current=current.next;
      }
    }
return "NULL";  }
}


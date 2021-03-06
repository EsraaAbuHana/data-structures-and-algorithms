/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package InsertionSort;

import java.util.ArrayList;

public class Library {
  public static void main(String[] args) {
    int[] array = {8, 4, 23, 42, 16, 15};
    System.out.println("before :");
    for(int i=0; i < array.length; i++) {
      System.out.print(array[i]+",");
    }
    InsertionSort(array);
    System.out.println("\n after : ");

    for(int i=0; i < array.length; i++) {
      System.out.print(array[i]+",");
    }
  }

//  public static ArrayList<Integer> InsertionSort(int[] arr) {
public static int[] InsertionSort(int[] arr) {
  //    ArrayList<Integer> sortedArray = new ArrayList<>();
  //    FOR i = 1 to arr.length
  for (int i = 1; i < arr.length; i++) {
    //    int j <-- i - 1
    int j = i - 1;//0
    int temp = arr[i];//4

    while (j >= 0 && temp < arr[j]) {

      arr[j + 1] = arr[j];
      j = j - 1;
      // System.out.println("j : " + arr[i]);
    }
    arr[j + 1] = temp;

  }

  return arr;

}

}

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ArrayShift;
import java.util.ArrayList;

public class ArrayShift {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {
      int[] arr={2,4,6,8};
      int newNum=5;
      int[] array={4,8,15,23,42};
//      insertShiftArray(array,16);
     //*************************************************************
      //create a test here in case the test file dose not respond
      ArrayList<Integer>expectedArray=new ArrayList<>();

      int[] outArray={4,8,15,16,23,42};

      for(int i=0;i<outArray.length;i++){
        expectedArray.add(outArray[i]);
      }
      System.out.println("expectedArray is: "+expectedArray);
      System.out.println("return array is : "+insertShiftArray(array,16));

      if(expectedArray.size()==insertShiftArray(array,16).size() &&(insertShiftArray(array,16).get(5)==42) && (insertShiftArray(array,16).get(0)==4))
      {
        System.out.println("your method work correct");
      }else{
        System.out.println("your method work NOT correct");
      }
//      if(insertShiftArray(array,16).get(0)==4){
//        System.out.println("4 include");
//      }
//      if (insertShiftArray(array,16).get(5)==42){
//        System.out.println("42 include");
//      }

    }

    public static ArrayList<Integer> insertShiftArray(int[] arr, int newNum){
      ArrayList<Integer>listOfNumbers=new ArrayList<>();
      int midIndex;
      if(arr.length%2==0){
        midIndex=arr.length/2;
      }else{
        midIndex=(arr.length/2)+1;
      }
      int i;
      for( i=0;i<midIndex;i++){

        listOfNumbers.add(arr[i]);
      }
      listOfNumbers.add(newNum);
      for( i=midIndex;i<arr.length;i++){

        listOfNumbers.add(arr[i]);
      }
//      System.out.println(listOfNumbers);
      return listOfNumbers;
    }

  }

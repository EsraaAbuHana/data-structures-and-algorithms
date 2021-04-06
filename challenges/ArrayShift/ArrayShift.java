import java.util.ArrayList;

class ArrayShift {
  public static void main(String[] args) {
int[] arr={2,4,6,8};
int newNum=5;
insertShiftArray(arr,newNum);

int[] array={4,8,15,23,42};
insertShiftArray(array,16);


  }
  public static void insertShiftArray(int[] arr,int newNum){
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
  System.out.println(listOfNumbers);
  }
  
}
//   if (i==midIndex){
//     listOfNumbers.add(newNum);
//     // i++;
//   }
// else{
// listOfNumbers.add(arr[i]);
//  }
  
  // listOfNumbers.add(arr[i-2]);
// import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // int size= scanner.nextInt();
        // int[] arr = new int[size];  

// 		for(int i=0; i<size; i++)  
// {  
// arr[i]=scanner.nextInt();  
// } 
    // String txt = "";
    // int arr[]={1, 2, 3, 4, 5, 6};
int arr[]={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};
// int arr[]={89, 2354, 3546, 23, 10, -923, 823, -12};
//    int reverseArr[]; 
    // int j=0;

        int size=(arr.length)-1;

    System.out.println("This is the original array: "); 
    System.out.println("[ "); 
for(int i=0; i<size; i++)  
{  
System.out.print(arr[i] + " ,");

} 
System.out.println("]");  

System.out.println("This is the reverse array array: ");  
System.out.println("[ ");  

 for(int i = size; i >=0; i--) {
// reverseArr[j]=arr[i];
System.out.print(arr[i] + " ,");
// j++;  
    }
    System.out.println("]");  

    }
  
  
  }
  
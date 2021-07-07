package utilities;

import java.util.*;
//TODO
// - given a string return all the characters that repeated more than one time and how many time reapeted
// - given an array of string return the mutual characters  between them .
// - given a string of curly brackets return true if every open CB have an close one else return false.(the string have another characters than the brackets)
// - write function that returns true if the input has no numbers and false if it has numbers (aaa12 => false )
// - write function that calculate the root of number without using methods
// - let x =5   y=7 , swap between the values
// - return the uncommon value words between two strings
//  Q1) given two variables, swap their values without using 3rd variable.
//  Q2) check if given number is prime and return true.
//  Q3) given string, return string in reverse, e.g. ( I like food: output should be food like I).
//  Q4) given string, return the most repeated word in string.
//  Q5) given number 123.

public class Prac {
  public static HashMap<Character, Integer> countChar(String str) {
    System.out.println(str);
    HashMap<Character, Integer> arr = new HashMap();
    for (int i = 0; i < str.length(); i++) {
      if ((str.toLowerCase().charAt(i) == ' ')||(str.toLowerCase().charAt(i) == ',')||(str.toLowerCase().charAt(i) == '.')) {
        continue;
      } else if ((arr.containsKey(str.toLowerCase().charAt(i)))) {
        arr.replace(str.toLowerCase().charAt(i), arr.get(str.toLowerCase().charAt(i)) + 1);
      } else {
        arr.put(str.toLowerCase().charAt(i), 1);
      }
    }
    HashMap<Character,Integer> arr2=new HashMap();
    arr.forEach((k, v) -> {
      if(v>1)arr2.put(k,v);
    });
    return arr2;
  }
  public static boolean containsDigit(String s) {
    //BEST
    boolean containsDigit = false;
    if (s != null && !s.isEmpty()) {
      for (char c : s.toCharArray()) {
        if (containsDigit = Character.isDigit(c)) {
          break;
        }
      }
    }
    return !containsDigit;
  }
  public static boolean containsDigit2(String s) {
  boolean check=false;
  for (char c :s.toCharArray()){
    if(check=Character.isDigit(c))break;
  }
  return check;
  }
//  public static boolean containsDigit2(String s) {
//    return !(s.contains("0") || s.contains("1") || s.contains("2") || s.contains("3") || s.contains("4") || s.contains("5") || s.contains("6") || s.contains("7") || s.contains("8") || s.contains("9"));
//  }
//  public static boolean containsDigit3(String s) {
//    for (int i = 0; i < 9; i++) {
//      if (s.contains(String.valueOf(i))) return false;
//    }
//    return true;
//  }
  public static void swap(int x, int y) {
    // x=5 y=6
    System.out.println(" a : "+ x+" b : "+y);
    x=x+y; //x=11
    y=x-y; //y=5
    x=x-y; //x=6
    System.out.println(" a : "+ x+" b : "+y);

  }
  public static boolean sameThirdNum(String a, String b, String c) {
    return (Integer.parseInt(a) + Integer.parseInt(b) == Integer.parseInt(c));
  }
  public static int secondMax(ArrayList<Integer> arr) {
    int max = Integer.MIN_VALUE, sec = Integer.MIN_VALUE;
    for (int i = 0; i < arr.size(); i++) {
      if (arr.get(i) > sec && arr.get(i) < max) sec = arr.get(i);
      if (arr.get(i) > max) {
        sec = max;
        max = arr.get(i);
      }
    }
    return sec;
  }
  public static int secondMax2(ArrayList<Integer> arr) {
 arr.sort(Comparator.reverseOrder());
    for (int i = 0; i < arr.size(); i++) {
      if(arr.get(i)<arr.get(0))return arr.get(i);
    }
    return arr.get(0);
  }
  public static int findRoot(int num) {
    for (int i = (int) Math.floor(num / 2); i > 1; i--) {
      if (num % i == 0 && i * i == num) {
        return i;
      }
    }
    return -1;
  }
  public static boolean checkPrime(int num) {
    for (int i = num - 1; i > 1; i--) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
  public static ArrayList findPrime(int num) {
    ArrayList result = new ArrayList();
    for (int i = num; i > 1; i--) {
      if (checkPrime(i) == true) {
        result.add(i);
      }
    }
    return result;
  }
  public static String checkUnMutual(String str1, String str2) {
    StringBuilder container= new StringBuilder();
    HashMap<Character, Integer> hashMap = new HashMap();
    for (int i = 0; i < str1.length(); i++) {
      if (str1.toLowerCase().charAt(i) == ' ') {
        continue;
      } else if (hashMap.get(str1.toLowerCase().charAt(i)) != null) {
        hashMap.replace(str1.toLowerCase().charAt(i), hashMap.get(str1.toLowerCase().charAt(i)) + 1);
      } else {
        hashMap.put(str1.toLowerCase().charAt(i), 1);
      }
    }
    for(int i=0;i<str2.length();i++){
      if(str2.toLowerCase().charAt(i)==' '){
        continue;
      }
      else if (hashMap.get(str2.toLowerCase().charAt(i)) !=null && hashMap.get(str2.toLowerCase().charAt(i)) >0){
        hashMap.replace(str2.toLowerCase().charAt(i),hashMap.get(str2.toLowerCase().charAt(i))-1);

      } else {
        container.append(str2.toLowerCase().charAt(i));
      }
    }
    hashMap.forEach((k,v)->{
      if(v!=0){
        for (int i=0; i<v;i++){
          container.append(k);
        }
      }
    });
    return container.toString();
  }
  public static String reverseWords(String words) {
    String reverseString="";
    String substring[]=words.split(" ");
    for(int i=(substring.length-1);i>=0;i--)
    {
      reverseString = reverseString + substring[i]+" ";
    }
    return reverseString;
  }
  public static String mostRepeated(String str){
    int max =0;
    String repeate=" ";
    HashMap<String,Integer> hashMap = new HashMap<>();
    String words[] = str.split(" ");
    for (int i=0;i<words.length;i++){
      if (hashMap.get(words[i].toLowerCase())!=null){
        hashMap.replace(words[i].toLowerCase(),hashMap.get(words[i].toLowerCase())+1);
        if(hashMap.get(words[i])>max){
          max=hashMap.get(words[i]);
          repeate=words[i];
        }

      } else {
        hashMap.put(words[i].toLowerCase(),1);
      }
    }
    return repeate;
  }
  //123 1^3+2^3+3^3 = 123 true
  public static boolean checkNumber(int num){
    List<Integer> digits = new ArrayList<Integer>();
    while(num > 0) {
      digits.add(num % 10);
      num /= 10;
    }
    int total=0;
    for (int i=0;i<digits.size();i++){
      total+=Math.pow(digits.get(i),3);
    }
    if (total==num) {
      return true;
    }
    return false;
  }
  public static boolean bracketsMatch(String brackets)
  {
    int leftCtr = 0 ;  //"{";
    int rightCtr =0 ; // "}";

    for (int i=0; i<brackets.length(); i++)
    {
      char c = brackets.charAt(i);
      if ( c == '{')
      {
        leftCtr++;
      }
      if (c =='}')
      {
        rightCtr++;
      }
    }

    if (rightCtr==leftCtr)
    {
      return true;
    }
    return false;
  }
  public static void main(String[] args) {
    ArrayList<Integer> arr=new ArrayList<>();
    arr.add(30);
    arr.add(30);
    arr.add(30);
    arr.add(30);
    arr.add(30);
    int a=6,b=8;
    swap(a,b);
//   System.out.println(countChar("hello World aa"));
//   System.out.println(containsDigit2("hello World "));
//   System.out.println(containsDigit2("hello World "));

//    System.out.println(containsDigit2("hello 3World4 "));
//    System.out.println(containsDigit2("hello 3World4 "));
//    System.out.println(containsDigit2("hello 3World0 "));
//    System.out.println(sameThirdNum("5","4","9"));
//    System.out.println(sameThirdNum("5","5","9"));
//*   System.out.println(secondMax(arr));
//    System.out.println(secondMax2(arr));
// " whenever you find Ayah you will find Sasha"
// " whenever you find Esraa you will find Spaghetti"
// "Aya Esraa Sasha Spaghetti"



  }
}

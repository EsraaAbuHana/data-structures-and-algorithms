package utilities;
import java.lang.*;
import java.util.*;

import java.util.ArrayList;
import java.util.List;

//  {}	TRUE
//  {}(){}	TRUE
//    ()[[Extra Characters]]	TRUE
//    (){}[[]]	TRUE
//  {}{Code}[Fellows](())	TRUE
//[({}]	FALSE
//    (](	FALSE
//  {(})	FALSE
public class MultiBracketValidation {


static boolean multiBracketValidation(String str)
{
  ArrayList<Character> chars=new ArrayList<Character>();
  for(int i=0;i<str.length();i++)
  {
    if (str.charAt(i)=='{'||str.charAt(i)=='}'||str.charAt(i)=='('||str.charAt(i)==')'||str.charAt(i)=='['||str.charAt(i)==']'){
      chars.add(str.charAt(i));}
  }
  System.out.println(chars);
  if (chars.size()==1)return false;
  for (int i = 0; i < chars.size()-1; i++)
  {
    char nextToC = chars.get(i+1);
    char c = chars.get(i);

//    System.out.println(c);
    if (c == '{' || c == '(' || c == '[')
    {
      if(nextToC=='}'){
        if (c == '(' || c == '['){
          return false;
        }
      }
      if(nextToC==')'){
        if (c == '{' || c == '['){
          return false;
        }
      }
      if(nextToC==']'){
        if (c == '{' || c == '('){
          return false;
        }
      }
    }

  }
  return true;
}

  public static void main(String[] args)
  {

//    String str = "{dxs}ljkh])";
    String str = "[()}]";
      System.out.println(multiBracketValidation(str));
  }
}

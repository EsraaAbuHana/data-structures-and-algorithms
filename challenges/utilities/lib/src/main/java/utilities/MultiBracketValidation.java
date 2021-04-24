package utilities;
import java.lang.*;

import java.util.ArrayList;

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
  if (chars.size()==0 ||chars.size()%2!=0||chars.size()==1){return false;}
  for (int i = 0; i < chars.size()-1; i++)
  {
    char nextToC = chars.get(i+1);
    char c = chars.get(i);
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

  return true;
}

  public static void main(String[] args)
  {
    System.out.println("should be FALSE >>null: "+multiBracketValidation(""));
    System.out.println("should be TRUE : "+multiBracketValidation("{}"));
    System.out.println("should be TRUE : "+multiBracketValidation("{}(){}"));
    System.out.println("should be TRUE : "+multiBracketValidation("()[[Extra Characters]]"));
    System.out.println("should be TRUE : "+multiBracketValidation("(){}[[]]"));
    System.out.println("should be TRUE : "+multiBracketValidation("{}{Code}[Fellows](())"));
    System.out.println("should be FALSE : "+multiBracketValidation("[({}]"));
    System.out.println("should be FALSE : "+multiBracketValidation("(]("));
    System.out.println("should be FALSE : "+multiBracketValidation("{(})"));

  }
}

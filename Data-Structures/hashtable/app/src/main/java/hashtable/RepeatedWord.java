package hashtable;

import java.util.Locale;

public class RepeatedWord {
  public static String repeatedWord(String string) {
    String[] words = string.split("[, ?.@]+");
    String firstRepeated = "";
    Hashtable hashtable = new Hashtable();
//    for (int i = 0; i < words.length; i++) {
////      hashtable.add(words[i].toLowerCase(),i);
//      System.out.println(words[i]);
//    }
    for (int i = 0; i < words.length; i++) {
      if (!hashtable.contains(words[i].toLowerCase())) {
        hashtable.add(words[i].toLowerCase(), words[i].toLowerCase());
//        System.out.println(hashtable.get(words[i].toLowerCase()));
//        firstRepeated = words[i].toLowerCase();
      } else {
        System.out.println("else : " + hashtable.get(words[i].toLowerCase()));
        firstRepeated = (String) hashtable.get(words[i].toLowerCase());
//        break;
        return words[i].toLowerCase();
      }
    }
//return firstRepeated;
    return " ";
  }
}

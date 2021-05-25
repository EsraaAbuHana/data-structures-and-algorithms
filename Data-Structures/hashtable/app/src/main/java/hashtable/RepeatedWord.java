package hashtable;

import java.util.Locale;

public class RepeatedWord {
  public static String repeatedWord(String string) {
    if(string.length()>=1){return string;}else {
      String[] words = string.toLowerCase().split("[, ?.@:;!]+");
      Hashtable hashtable = new Hashtable();
      for (int i = 0; i < words.length; i++) {
        if (!hashtable.contains(words[i])) {
          hashtable.add(words[i], words[i]);
        } else {
          return words[i];
        }
      }
    }
    return " no repeated words";
  }
}

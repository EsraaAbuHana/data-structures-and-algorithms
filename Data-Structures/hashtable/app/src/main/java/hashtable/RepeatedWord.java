package hashtable;

import java.util.Locale;

public class RepeatedWord {
  public static String repeatedWord(String string) {
    String[] words = string.toLowerCase().split("[, ?.@]+");
    Hashtable hashtable = new Hashtable();
    for (int i = 0; i < words.length; i++) {
      if (!hashtable.contains(words[i])) {
        hashtable.add(words[i], words[i]);
      } else {
        hashtable.add(words[i], words[i]);
        return words[i];
      }
    }
    return " no repeated words";
  }
}

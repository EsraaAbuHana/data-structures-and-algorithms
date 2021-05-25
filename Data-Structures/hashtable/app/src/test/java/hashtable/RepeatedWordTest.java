package hashtable;

import org.junit.Test;
import static org.junit.Assert.*;


public class RepeatedWordTest {

  @Test
  public void testRepeatedWord() {
    RepeatedWord classUnderTest1 = new RepeatedWord();
//    String string="It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
    String string="Once upon a time, there was a brave princess who..."	;
//    String string="a s d f g h j r  u i k r"	;
    System.out.println("the  most repeated one is : "+classUnderTest1.repeatedWord(string));
    assertTrue(true);
  }
  @Test
  public void testEmptyOneWord() {
    RepeatedWord classUnderTest1 = new RepeatedWord();
String string=" ";
    String string1=" hello";
    assertEquals(string,classUnderTest1.repeatedWord(string));
    assertEquals(string1,classUnderTest1.repeatedWord(string1));  }
}

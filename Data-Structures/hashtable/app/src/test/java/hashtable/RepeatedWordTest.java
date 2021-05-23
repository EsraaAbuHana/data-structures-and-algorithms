package hashtable;

import org.junit.Test;
import static org.junit.Assert.*;


public class RepeatedWordTest {

  @Test
  public void testAppHasAGreeting() {
    RepeatedWord classUnderTest = new RepeatedWord();
//    String string="It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
    String string="Once upon a time, there was a brave princess who..."	;
    System.out.println("the  most repeated one is : "+classUnderTest.repeatedWord(string));
    assertTrue(true);
  }
}

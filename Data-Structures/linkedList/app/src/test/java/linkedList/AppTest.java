/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedList;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testInclodesMethod() {
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(7);
        assertEquals("the value that insert is inclode ", true,classUnderTest.includes(7));
      assertEquals("the value that insert is inclode ", false,classUnderTest.includes(8));


    }
  @Test public void testToStringMethod() {
    LinkedList classUnderTest = new LinkedList();
    classUnderTest.insert(7);
    classUnderTest.insert(8);
    classUnderTest.toString();
    String testString="{8}->{7}->Null";
//    assertEquals("the value that insert is inclode ", true,classUnderTest.includes(7));
    assertEquals("",testString,classUnderTest.toString());


  }
}
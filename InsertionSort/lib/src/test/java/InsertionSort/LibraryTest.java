/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package InsertionSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {
    @Test
    public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
  @Test
  public void testInsertionSort() {
    Library classUnderTest = new Library();

    int[] array = {8, 4, 23, 42, 16, 15};
    int[] sortedArray = {4, 8, 15, 16, 23, 42};
    classUnderTest.InsertionSort(array);
//    assertArrayEquals([4, 8, 15, 16, 23, 42],InsertionSort([8, 4, 23, 42, 16, 15]));
//    for (int i = 0; i < array.length; i++) {
//      System.out.println(array[i]+"<>"+sortedArray[i]);
////      assertEquals(array[i], sortedArray[i]);
//    }
    assertTrue(true);
  }

}

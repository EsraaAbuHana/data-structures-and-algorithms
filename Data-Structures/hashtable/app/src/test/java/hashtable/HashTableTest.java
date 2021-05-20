package hashtable;
import org.junit.Test;
import static org.junit.Assert.*;

public class HashTableTest {
  @Test public void testHashTable(){
    Hashtable claasUnderTest= new Hashtable();
    assertEquals(true,claasUnderTest instanceof Hashtable);
  }
  @Test public void testGetHash(){
    Hashtable claasUnderTest= new Hashtable();
    assertEquals(876,claasUnderTest.hash("groot"));
    assertEquals(602,claasUnderTest.hash(96));
  }
  @Test public void testAdd(){
    Hashtable claasUnderTest= new Hashtable();
    claasUnderTest.add("groot","esraa");
    assertEquals("{Node{key=groot, value=esraa}}->Null", claasUnderTest.getHashNodesList()[876].toString());
    claasUnderTest.add("groot","fox");
    assertEquals("{Node{key=groot, value=esraa}}->{Node{key=groot, value=fox}}->Null", claasUnderTest.getHashNodesList()[876].toString());

  }
  @Test public void testGet(){
    Hashtable claasUnderTest= new Hashtable();
    claasUnderTest.add("groot","esraa");
    assertEquals("esraa", claasUnderTest.get("groot"));
    assertEquals(null, claasUnderTest.get("nebula"));
    claasUnderTest.add("grtoo","fox");
    assertEquals("fox", claasUnderTest.get("grtoo"));


  }
  @Test public void testContains(){
    Hashtable claasUnderTest= new Hashtable();
    claasUnderTest.add("groot","esraa");
    assertTrue( claasUnderTest.contains("groot"));
    assertFalse( claasUnderTest.contains("esraa"));


  }
}

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
    assertEquals(669,claasUnderTest.hash("groot"));
    assertEquals(953,claasUnderTest.hash(96));
    claasUnderTest.add("grtoo","fox");

  }
  @Test public void testAdd(){
    Hashtable claasUnderTest= new Hashtable();
    claasUnderTest.add("groot","esraa");
    assertEquals("{Node{key=groot, value=esraa}}->Null", claasUnderTest.getHashNodesList()[669].toString());
    claasUnderTest.add("groot","fox");
    assertEquals("{Node{key=groot, value=esraa}}->{Node{key=groot, value=fox}}->Null", claasUnderTest.getHashNodesList()[669].toString());

  }
  @Test public void testGet(){
    Hashtable claasUnderTest= new Hashtable();
    claasUnderTest.add("groot","esraa");
    assertEquals("esraa", claasUnderTest.get("groot"));
    assertEquals(null, claasUnderTest.get("nebula"));
    claasUnderTest.add("grtoo","fox");
    assertEquals("{Node{key=groot, value=esraa}}->{Node{key=grtoo, value=fox}}->Null", claasUnderTest.getHashNodesList()[669].toString());
    assertEquals(claasUnderTest.hash("groot"), claasUnderTest.hash("grtoo"));

  }
  @Test public void testContains(){
    Hashtable claasUnderTest= new Hashtable();
    claasUnderTest.add("groot","esraa");
    assertTrue( claasUnderTest.contains("groot"));
    assertFalse( claasUnderTest.contains("esraa"));


  }
}

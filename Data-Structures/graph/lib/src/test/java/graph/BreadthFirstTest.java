package graph;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BreadthFirstTest {
  @Test
  public void testBreadthFirst() {
    BreadthFirst claasUnderTest = new BreadthFirst();
    assertEquals(true, claasUnderTest instanceof BreadthFirst);
  }
  @Test
  public void addOneTest(){
    BreadthFirst breadthFirst = new BreadthFirst();
    Vertex Pandora = new Vertex("Pandora");
    breadthFirst.addNode(Pandora);
    breadthFirst.addEdge(Pandora,null,1);

    assertEquals("[Edge{vertex=Vertex{value=Pandora}, wight=null}]",breadthFirst.getNeighbors(Pandora).toString());
  }

  @Test
  public void addTest(){
    BreadthFirst graph = new BreadthFirst();
//    String[] arr= {"Pandora","Arendelle","Metroville","Monstroplolis","Narnia","Naboo"};
//    for (int i = 0; i < arr.length; i++) {
//      Vertex Pandora = new Vertex(arr[i]);
//      graph.addNode(Pandora);
//    }
    Vertex Pandora = new Vertex("Pandora");
    graph.addNode(Pandora);
    Vertex Arendelle = new Vertex("Arendelle");
    graph.addNode(Arendelle);
    Vertex Metroville = new Vertex("Metroville");
    graph.addNode(Metroville);
    Vertex Monstroplolis = new Vertex("Monstroplolis");
    graph.addNode(Monstroplolis);
    Vertex Narnia = new Vertex("Narnia");
    graph.addNode(Narnia);
    Vertex Naboo = new Vertex("Naboo");
    graph.addNode(Naboo);
    graph.addEdge(Pandora,Arendelle,0);
    graph.addEdge(Arendelle,Metroville,0);
    graph.addEdge(Arendelle,Monstroplolis,0);
    graph.addEdge(Metroville,Monstroplolis,0);
    graph.addEdge(Metroville,Narnia,0);
    graph.addEdge(Metroville,Naboo,0);
    graph.addEdge(Monstroplolis,Naboo,0);
    graph.addEdge(Narnia,Naboo,0);
    System.out.println(graph.getVertices());
    System.out.println(graph.breadthFirst(Pandora));
    assertEquals("[Pandora, Arendelle, Metroville, Monstroplolis, Narnia, Naboo]",graph.breadthFirst(Pandora).toString());

  }


}

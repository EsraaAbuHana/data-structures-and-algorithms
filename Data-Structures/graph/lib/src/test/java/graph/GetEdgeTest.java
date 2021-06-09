package graph;

import GetEdge.GetEdge;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GetEdgeTest {
  @Test
  public void GetEdgeForMultipleCitiesTest(){

    BreadthFirst graph = new BreadthFirst();
//    String[] arr= {"Pandora","Arendelle","Metroville","Monstroplolis","Narnia","Naboo"};
//    for (int i = 0; i < arr.length; i++) {
//      Vertex Pandora = new Vertex(arr[i]);
//      graph.addNode(Pandora);
//    }
    ArrayList cities=new ArrayList();
    cities.add("Pandora");
    cities.add("Arendelle");

    cities.add("Metroville");
//    cities.add()

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
    graph.addEdge(Pandora,Arendelle,100);
    graph.addEdge(Arendelle,Metroville,50);
    graph.addEdge(Arendelle,Monstroplolis,70);
    graph.addEdge(Metroville,Monstroplolis,40);
    graph.addEdge(Metroville,Narnia,20);
    graph.addEdge(Metroville,Naboo,200);
    graph.addEdge(Monstroplolis,Naboo,70);
    graph.addEdge(Narnia,Naboo,60);
//    System.out.println(graph.getVertices());
//    System.out.println(graph.breadthFirst(Pandora));
//    System.out.println(GetEdge.checkTrip(graph,cities));
    assertEquals("True, 150$",GetEdge.checkTrip(graph,cities));

  }
  @Test
  public void GetEdgeForOneCityTest(){

    BreadthFirst graph = new BreadthFirst();

    ArrayList cities=new ArrayList();
    cities.add("Pandora");
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
    graph.addEdge(Pandora,Arendelle,100);
    graph.addEdge(Arendelle,Metroville,50);
    graph.addEdge(Arendelle,Monstroplolis,70);
    graph.addEdge(Metroville,Monstroplolis,40);
    graph.addEdge(Metroville,Narnia,20);
    graph.addEdge(Metroville,Naboo,200);
    graph.addEdge(Monstroplolis,Naboo,70);
    graph.addEdge(Narnia,Naboo,60);

    assertEquals("UnValid trip",GetEdge.checkTrip(graph,cities));



  }
  @Test
  public void GetEdgeUnValidCitesTest(){

    BreadthFirst graph = new BreadthFirst();

    ArrayList cities=new ArrayList();
    cities.add("Pandora");
    cities.add("Narina");
    cities.add("Naboo");

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
    graph.addEdge(Pandora,Arendelle,100);
    graph.addEdge(Arendelle,Metroville,50);
    graph.addEdge(Arendelle,Monstroplolis,70);
    graph.addEdge(Metroville,Monstroplolis,40);
    graph.addEdge(Metroville,Narnia,20);
    graph.addEdge(Metroville,Naboo,200);
    graph.addEdge(Monstroplolis,Naboo,70);
    graph.addEdge(Narnia,Naboo,60);

    assertEquals("False, 0$",GetEdge.checkTrip(graph,cities));

  }
}

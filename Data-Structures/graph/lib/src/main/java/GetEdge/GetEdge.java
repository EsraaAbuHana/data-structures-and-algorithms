package GetEdge;

import graph.Graph;
import graph.Vertex;

public class GetEdge {
  public static void main(String[] args) {
    Graph graph=new Graph();
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
    graph.addEdge(Pandora,Arendelle,150);
    graph.addEdge(Arendelle,Metroville,99);
    graph.addEdge(Arendelle,Monstroplolis,42);
    graph.addEdge(Metroville,Monstroplolis,105);
    graph.addEdge(Metroville,Narnia,37);
    graph.addEdge(Metroville,Naboo,26);
    graph.addEdge(Monstroplolis,Naboo,73);
    graph.addEdge(Narnia,Naboo,250);
    System.out.println(graph.getNeighbors(Pandora));
    System.out.println(graph.getNeighbors(Arendelle));

  }
//  [Metroville, Pandora, ]	True, $82
//[Arendelle, New Monstropolis, Naboo]	True, $115
//[Naboo, Pandora]	False, $0
//[Narnia, Arendelle, Naboo]	False, $
  public static int getEdge(Graph graph,String[]cityNames){
    int cost=0;
//Vertex locCity=graph.getVertices()[0];
//graph.getNeighbors(locCity);
return cost;
  }

}

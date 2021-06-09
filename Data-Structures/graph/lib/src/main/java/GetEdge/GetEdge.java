package GetEdge;

import graph.Edge;
import graph.Graph;
import graph.Vertex;
import stacksandqueues.Node;

import java.util.ArrayList;
import java.util.List;

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
    System.out.println(graph.getVertices());
    System.out.println(graph.getNodes());
//    System.out.println(graph.);
    String[] cityNames={"Metroville","Pandora"};
    System.out.println("the cost is : "+getEdge(graph,cityNames));

  }
//  [Metroville, Pandora]	True, $82
//[Arendelle, New Monstropolis, Naboo]	True, $115
//[Naboo, Pandora]	False, $0
//[Narnia, Arendelle, Naboo]	False, $
  public static int getEdge(Graph graph,String[]cityNames){
    int cost=0;
Vertex locCity=null;
//graph.getNeighbors(locCity);
    for (Vertex city : (ArrayList<Vertex>) graph.getNodes()) {
      if (city.getValue()== cityNames[0]) {
        locCity = city;
        System.out.println(locCity);
      }
    }

    for (int i = 1; i < cityNames.length; i++) {
      for (Edge edge : (List<Edge>) graph.getNeighbors(locCity)) {
        if (edge .getVertex().getValue()== cityNames[i]) {
          System.out.println("*********************"+graph.getNeighbors(locCity));
          System.out.println(edge.getVertex());
          locCity = edge.getVertex();
          cost=cost+(int)edge.getWight();

          break;
        }
      }


    }
return cost;
  }

}

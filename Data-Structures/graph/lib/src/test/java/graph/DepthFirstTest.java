package graph;

import DepthFirst.DepthFirst;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstTest extends DepthFirst {
  @Test
  public void addTestMoreSeveralEdgesForNode() {
    DepthFirst graph = new DepthFirst();
    Vertex A = new Vertex("A");
    graph.addNode(A);
    Vertex B = new Vertex("B");
    graph.addNode(B);
    Vertex D = new Vertex("D");
    graph.addNode(D);
    Vertex C = new Vertex("C");
    graph.addNode(C);
    Vertex G = new Vertex("G");
    graph.addNode(G);
    Vertex E = new Vertex("E");
    graph.addNode(E);
    Vertex H = new Vertex("H");
    graph.addNode(H);
    Vertex F = new Vertex("F");
    graph.addNode(F);
    graph.addEdge(A, B, 0);
    graph.addEdge(A, D, 0);
    graph.addEdge(B, C, 0);
    graph.addEdge(B, D, 0);
    graph.addEdge(C, G, 0);
    graph.addEdge(D, E, 0);
    graph.addEdge(D, F, 0);
    graph.addEdge(D, H, 0);
    graph.addEdge(F, H, 0);

    System.out.println(graph.getVertices());
    System.out.println(graph.depthFirst(A));
    List<Vertex> nodes=graph.getNodes();
    ArrayList <Vertex>output=depthFirst(A);
    System.out.println(output);//A, D, H, F, E, B, C, G
    //[A, D, H, F, E, B, C, G]
    System.out.println(graph.depthFirst(A));
assertEquals("[A, D, H, F, E, B, C, G]",graph.depthFirst(A).toString());

  }
  @Test
  public void addTestWithOneNode() {
    DepthFirst graph = new DepthFirst();
    Vertex A = new Vertex("A");
    graph.addNode(A);
    System.out.println(graph.getVertices());
    List<Vertex> nodes=graph.getNodes();

    System.out.println(graph.depthFirst(A));
    assertEquals("[A]",graph.depthFirst(A).toString());
  }
  @Test
  public void addTestMoreThanOneNode() {
    DepthFirst graph = new DepthFirst();
    Vertex A = new Vertex("A");
    graph.addNode(A);
    Vertex B = new Vertex("B");
    graph.addNode(B);
    Vertex D = new Vertex("D");
    graph.addNode(D);
    Vertex E = new Vertex("E");
    graph.addNode(E);

    graph.addEdge(A, B, 0);
    graph.addEdge(B, D, 0);
    graph.addEdge(D, E, 0);


    System.out.println(graph.getVertices());
    System.out.println(graph.depthFirst(A));
    List<Vertex> nodes=graph.getNodes();
    ArrayList <Vertex>output=depthFirst(A);
    System.out.println(output);
    System.out.println(graph.depthFirst(A));
    assertEquals("[A, B, D, E]",graph.depthFirst(A).toString());

  }
}

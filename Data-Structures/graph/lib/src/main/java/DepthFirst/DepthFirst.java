package DepthFirst;

import graph.Edge;
import graph.Graph;
import graph.Vertex;
import stacksandqueues.Node;
import stacksandqueues.Stack;
import java.util.ArrayList;
import java.util.HashSet;

public class DepthFirst {
  public static void main(String[] args) {

  }
  public static ArrayList<Vertex> depthFirst(Graph g) {
    Vertex current =  (Vertex) g.getNodes().get(0);
    ArrayList<Vertex> output = new ArrayList<>();
//    Stack<Vertex> stack =  new Stack();
    Stack stack =  new Stack();
    HashSet<Vertex> visited = new HashSet<>();
    stack.push(current);
    visited.add(current);
    while (stack.peek() != null) {
      current = (Vertex) stack.pop();
      output.add(current);
      for (Edge e : (ArrayList<Edge>) g.getNeighbors(current)) {
        if (!visited.contains(e.getVertex().getValue())) {
          visited.add((Vertex) e.getVertex().getValue());
          System.out.println(visited);
          stack.push(e.getVertex().getValue());
        }
      }
    }
    return output;
  }
}

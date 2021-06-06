package DepthFirst;

import graph.Edge;
import graph.Graph;
import graph.Vertex;
import stacksandqueues.Node;
import stacksandqueues.Queue;
import stacksandqueues.Stack;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DepthFirst extends Graph{
  public static void main(String[] args) {

  }
  public  ArrayList<Vertex> depthFirst (Vertex vertex) {
    ArrayList nodes = new ArrayList<>();
    Stack depth = new Stack();
    Set visited = new HashSet();
    depth.push(vertex);
    visited.add(vertex);
    while (!depth.isEmpty()) {
      Vertex front = (Vertex) ((Node) depth.pop()).getValue();
      nodes.add(front.getValue());
      for (Object child : this.getNeighbors(front)){
        Vertex currentVertex = ((Edge) child).getVertex();
        if (!visited.contains(currentVertex)) {
          visited.add(currentVertex);
          depth.push(currentVertex);
        }
      }
    }
    return nodes;

  }
}

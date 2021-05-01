package find.maximum.value;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


public class TestBreadthFirstTraversal{

  @Test
  public void testBreadthFirstTraversal() {
    BinaryTree output=new BinaryTree();

    output.root=new Node(2);
    output.root.left=new Node(7);
    output.root.right=new Node(5);
    output.root.left.left=new Node(2);
    output.root.left.right=new Node(6);
    output.root.right.right=new Node(9);
    output.root.left.right.left=new Node(5);
    output.root.left.right.right=new Node(11);
    output.root.right.right.left=new Node(4);

    System.out.println(output);
    BreadthFirstTraversal.breadthFirstTraversal(output);
    System.out.println(BreadthFirstTraversal.breadthFirstTraversal(output));

    System.out.println(output.tree);
    assertEquals("[2, 7, 5, 2, 6, 9, 5, 11, 4]",BreadthFirstTraversal.breadthFirstTraversal(output).toString());
  }
  @Test
  public void testEmptyBinaryTree() {

    BinaryTree empty=new BinaryTree();
    System.out.println(BreadthFirstTraversal.breadthFirstTraversal(empty));
    assertNull(BreadthFirstTraversal.breadthFirstTraversal(empty));
  }
}

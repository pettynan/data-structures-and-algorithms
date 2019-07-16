package breadthfirst;

import graph.Graph;
import graph.GraphNode;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BreadthFirstTest {
    BreadthFirst init = new BreadthFirst();
    Graph graph = new Graph();
    GraphNode node1;
    GraphNode node2;
    GraphNode node3;
    GraphNode node4;
    GraphNode node5;


    @Before
    public void instantiateGraph() {
        node1 = graph.addNode("1");
        node2 = graph.addNode("2");
        node3 = graph.addNode("3");
        node4 = graph.addNode("4");
        node5 = graph.addNode("5");
        graph.addEdge(node1, node2, 1);
        graph.addEdge(node2, node3, 1);
        graph.addEdge(node3, node4, 1);
        graph.addEdge(node4, node5, 1);
        graph.addEdge(node1, node3, 2);
        graph.addEdge(node3, node5, 2);
        graph.addEdge(node1, node5, 4);

    }

    @Test
    public void testBreadthFirst() {
        List<GraphNode> nodeList = init.breadthFirst(node1);
        String outputString = "";
        for (GraphNode node : nodeList) {
            outputString += node.getName() + ", ";
        }
        outputString = outputString.substring(0, outputString.length() - 2);

        String expectedString = "1, 2, 3, 5, 4";

        assertEquals("The string constructed from the output of the breadthFirst method should match the expected string.",
                expectedString,
                outputString);
    }
}
package getedge;

import graph.Graph;
import graph.GraphNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetEdgeTest {
    GetEdge init = new GetEdge();
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
    public void testGetEdge() {
        GraphNode[] nodeArray = {node1, node3, node5, node1};


        assertEquals("Adding the connections from node1 to node3 to node5 to node1, or 2 + 2 + 4, should return a cost of $8.",
                "$8",
                init.getEdge(graph, nodeArray).getDollarCost());
    }

    @Test
    public void testGetEdge_false() {
        GraphNode[] nodeArray = {node1, node4, node5, node1};

        assertFalse("Because there is no direct connection from node1 to node4, I expect the method to return false.",
                init.getEdge(graph, nodeArray).isConnectionExists());
    }
}
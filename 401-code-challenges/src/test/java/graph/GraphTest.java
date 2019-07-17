package graph;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GraphTest {

    Graph graph = new Graph();
    GraphNode node1;
    GraphNode node5;


    @Test
    public void testGraph_addNode() {
        node1 = graph.addNode("1");


        assertTrue("Since node1 has been added to the graph, the following expression should return true.",
                graph.nodes.contains(node1));
    }

    // This method tests both the addEdge and areConnected methods.
    @Test
    public void testGraph_addEdge() {
        node1 = graph.addNode("1");
        node5 = graph.addNode("5");

        graph.addEdge(node1, node5, 4);

        assertTrue("Since node1 and node5 have been connected by addEdge, the areConnected method should return true.",
                graph.areConnected(node1, node5));
    }

}
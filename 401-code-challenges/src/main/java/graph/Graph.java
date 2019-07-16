package graph;

import java.util.Set;

public class Graph {
    Set<GraphNode> nodes;

    public GraphNode addNode(String value) {
        GraphNode node = new GraphNode(value);
        this.nodes.add(node);
        return node;
    }

    public void addEdge(GraphNode node1, GraphNode node2, int weight) {
        if (!areConnected(node1, node2)) {
            node1.neighbors.add(new Edge(weight, node2));
            node2.neighbors.add(new Edge(weight, node1));
        } else {
            System.out.println("Nodes are already connected!");
        }
    }

    public boolean areConnected(GraphNode node1, GraphNode node2) {
        for (Edge edge : node1.neighbors) {
            if (edge.node == node2) {
                return true;
            }
        }
        return false;
    }

    public Set<GraphNode> getNodes() {
        return this.nodes;
    }

    public int size() {
        return nodes.size();
    }
}

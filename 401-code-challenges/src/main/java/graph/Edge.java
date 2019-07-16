package graph;

public class Edge {
    int weight;
    GraphNode node;

    Edge(int weight, GraphNode node) {
        this.weight = weight;
        this.node = node;
    }

    public GraphNode getNode() {
        return node;
    }
}

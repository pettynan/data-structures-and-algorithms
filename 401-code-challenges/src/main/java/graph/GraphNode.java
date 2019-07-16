package graph;

import java.util.LinkedList;
import java.util.List;

public class GraphNode {
    String name;
    List<Edge> neighbors;

    GraphNode(String name) {
        this.name = name;
        this.neighbors = new LinkedList<>();
    }

    public String getName() {
        return this.name;
    }

    public List<Edge> getNeighbors() {
        return this.neighbors;
    }
}

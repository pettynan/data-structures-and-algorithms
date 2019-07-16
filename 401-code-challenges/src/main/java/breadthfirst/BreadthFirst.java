package breadthfirst;


import graph.Edge;
import graph.GraphNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirst {

    public List<GraphNode> breadthFirst(GraphNode startNode) {
        List<GraphNode> nodeList = new LinkedList<>();
        Queue<GraphNode> nodeQueue = new LinkedList<>();

        nodeList.add(startNode);
        nodeQueue.offer(startNode);
        GraphNode currentNode;
        while (!nodeQueue.isEmpty()) {
            currentNode = nodeQueue.remove();
            for (Edge edge : currentNode.getNeighbors()) {
                if (!nodeList.contains(edge.getNode())) {
                    nodeList.add(edge.getNode());
                    nodeQueue.add(edge.getNode());
                }

            }
        }
        return nodeList;
    }
}

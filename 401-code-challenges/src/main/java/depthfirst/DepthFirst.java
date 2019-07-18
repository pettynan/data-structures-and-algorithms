package depthfirst;

import graph.Edge;
import graph.GraphNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DepthFirst {

    public List<GraphNode> depthFirstWrapper(GraphNode startNode) {
        List<GraphNode> nodeList = new LinkedList<>();

        nodeList.add(startNode);
        depthFirstRecurse(startNode, nodeList);

        return nodeList;
    }

    private void depthFirstRecurse(GraphNode node, List<GraphNode> nodeList) {
        for (Edge edge : node.getNeighbors()) {
            if (!nodeList.contains(edge.getNode())) {
                nodeList.add(edge.getNode());
                depthFirstRecurse(edge.getNode(), nodeList);
            }
        }
    }
}

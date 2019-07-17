package getedge;

import graph.Edge;
import graph.Graph;
import graph.GraphNode;

public class GetEdge {
    public getEdgeReturnObj getEdge(Graph graph, GraphNode[] graphNodes) {
        int weightSum = 0;

        for (int i = 0 ; i < graphNodes.length - 1 ; i++) {
            if (!graph.areConnected(graphNodes[i], graphNodes[i + 1])) {
                return new getEdgeReturnObj(false, 0);
            } else {
                for (Edge edge : graphNodes[i].getNeighbors()) {
                    if (edge.getNode() == graphNodes[i + 1]) {
                        weightSum += edge.getWeight();
                        System.out.println("Added " + edge.getWeight());
                    }
                }
            }
        }
        return new getEdgeReturnObj(true, weightSum);
    }



    public class getEdgeReturnObj {
        boolean connectionExists;
        String dollarCost;

        public getEdgeReturnObj(boolean connectionExists, int cost) {
            this.connectionExists = connectionExists;
            this.dollarCost = "$" + cost;
        }

        public boolean isConnectionExists() {
            return connectionExists;
        }

        public String getDollarCost() {
            return dollarCost;
        }
    }
}


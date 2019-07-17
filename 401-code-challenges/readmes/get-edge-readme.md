# [Get Edge](https://github.com/pettynan/data-structures-and-algorithms/tree/master/401-code-challenges/src/main/java/getedge)
https://github.com/pettynan/data-structures-and-algorithms/tree/master/401-code-challenges/src/main/java/getedge

## Challenge
Write a function which takes in a graph, and an array of city names. Without utilizing any of the built-in methods available to your language, return whether the full trip is possible with direct flights, and how much it would cost.

## Approach & Efficiency
My method returns an object of the getEdgeReturnObj class - a custom class that I created for this method. This method contains 2 properties:
  - boolean connectionExists - True if the array of citty names is a valid path that can be taken in the graph, false if not.
  - String dollarCost - Returns the sum of the weights of each edge along the path, appended with a $ symbol. Or returns $0 if the path is not valid.

The method iterates through the first n - 1 nodes in the array. At each node, it checks that node's neighbors for the next node. If the next node exists in the neighbors list, then the weight of that edge is added to the sum, and the iteration continues. If the next node is not found, then the function returns false and $0.
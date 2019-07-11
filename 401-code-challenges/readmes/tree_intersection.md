# [Tree Intersection](https://github.com/pettynan/data-structures-and-algorithms/tree/master/401-code-challenges/src/main/java/treeintersection)
https://github.com/pettynan/data-structures-and-algorithms/tree/master/401-code-challenges/src/main/java/treeintersection

## Challenge
Given 2 binary trees, return an array of values which are contained in both trees.

## Approach & Efficiency
  Internally I used a hashtable and simple preOrder BT traversals to solve this problem. First the algorithm initializes a hashtable and an arraylist. It traverses  tree1, adding each contained value to the hashtable. Then, it traverses tree2, comparing (using hashtable.contains()) each value to the values saved in the hashtable. If there is a match, that value is added to the arraylist. Finally, the arraylist is returned as an array.

## API
  Main Method
    treeIntersection(BinaryTree tree1, BinaryTree tree2)
  Helper Methods
    treeIntersectionHelper
    treeIntersectionComparer

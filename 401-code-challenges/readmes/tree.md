# [Stacks and Queues](https://github.com/pettynan/data-structures-and-algorithms/tree/master/401-code-challenges/src/main/java/tree)
https://github.com/pettynan/data-structures-and-algorithms/tree/master/401-code-challenges/src/main/java/tree

## Challenge
Create a tree, which implements a Binary Tree class and some basic methods for traversing this data structure. It also extends this class into a Binary Search tree, which is like an ordered Binary Tree, and includes methods for adding valeus to the BST, and for checking to see if a given value exists in the BST.

## Approach & Efficiency
The depth traversal methods all have a maximum time O(2^n), where n is the height of the search tree, and a constant space O.

Both the add and the contains methods have a time O(n) where n is the heigh of the BST, and a constant space O.
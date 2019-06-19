# [Binary Tree](https://github.com/pettynan/data-structures-and-algorithms/tree/master/401-code-challenges/src/main/java/tree)
https://github.com/pettynan/data-structures-and-algorithms/tree/master/401-code-challenges/src/main/java/tree

## Challenge
Create a tree, which implements a Binary Tree class and some basic methods for traversing this data structure. It also extends this class into a Binary Search tree, which is like an ordered Binary Tree, and includes methods for adding valeus to the BST, and for checking to see if a given value exists in the BST.

## Approach & Efficiency
The depth traversal methods all have a maximum time O(2^n), where n is the height of the search tree, and a constant space O.

Both the add and the contains methods have a time O(n) where n is the heigh of the BST, and a constant space O.

#[FizzBuzz Tree](https://github.com/pettynan/data-structures-and-algorithms/tree/master/401-code-challenges/src/main/java/fizzBuzzTree)
https://github.com/pettynan/data-structures-and-algorithms/tree/master/401-code-challenges/src/main/java/fizzBuzzTree

## Challenge
Given a Binary Tree of numbers, run through the tree and modify each node value accordingly: 
  - If the value is divisible by 3, replace the value with “Fizz”.
  - If the value is divisible by 5, replace the value with “Buzz”.
  - If the value is divisible by 3 and 5, replace the value with “FizzBuzz”.
Then return that modified tree.

## Approach & Efficiency
I used a recursive method, equivalent to the inORder traversal method, to traverse through the tree node by node. Then, rather than printing each node, I use conditional logic to convert the value appropriately. Then after finishing the recursion, I return the same (but modified) tree root.

#Breadth First Traversal
Added a new method to the BinaryTree class, which uses a Queue to traverse through a Binary Tree one layer at a time, starting at the top. Prints the value of each node in the tree.
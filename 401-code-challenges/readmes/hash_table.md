# [Hash Table](https://github.com/pettynan/data-structures-and-algorithms/tree/master/401-code-challenges/src/main/java/hashtable)
https://github.com/pettynan/data-structures-and-algorithms/tree/master/401-code-challenges/src/main/java/hashtable

## Challenge
Create a hash table implementation, which uses linked lists and a map (array) of nodes to store key-value pairs.

## Approach & Efficiency
  This hash table implementation uses chaining to negotiate collisions, which occur when two distinct keys are hashed to the same object. This means that when a new object is added to a bucket, the new object is given a 'next' pointer to the original object, and then added to the top of that bucket.

## API
    HashTable
    hash
    add
    contains
    get

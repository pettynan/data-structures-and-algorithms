# [Left Join](https://github.com/pettynan/data-structures-and-algorithms/tree/master/401-code-challenges/src/main/java/leftjoin)
https://github.com/pettynan/data-structures-and-algorithms/tree/master/401-code-challenges/src/main/java/leftjoin

## Challenge
Write a function that LEFT JOINs two hashmaps into a single data structure.
The first parameter is a hashmap that has word strings as keys, and a synonym of the key as values.
The second parameter is a hashmap that has word strings as keys, and antonyms of the key as values.
Combine the key and corresponding values (if they exist) into a new data structure according to LEFT JOIN logic.
LEFT JOIN means all the values in the first hashmap are returned, and if values exist in the “right” hashmap, they are appended to the result row. If no values exist in the right hashmap, then some flavor of NULL should be appended to the result row.

## Approach & Efficiency
The leftJoin method traverses each entry in the synonym hash map. For each entry in the hash map, it copies the key and value to the first and second columns in that entry's row in the output array. It checks the antonym hash map for the same key, and adds its corresponding value to the third column if it exists, or sets that column to NULL if not.
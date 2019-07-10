# [Repeated Word](https://github.com/pettynan/data-structures-and-algorithms/tree/master/401-code-challenges/src/main/java/repeatedword)
https://github.com/pettynan/data-structures-and-algorithms/tree/master/401-code-challenges/src/main/java/repeatedword

## Challenge
Create a repeatedWord method, which takes in a string that is a sentence, and returns as a string the first word that is repeated in that sentence.

## Approach & Efficiency
The method uses a .split(REGEX) method to split the input sentence into an array of word strings. It then uses a hash table to store and compare words, to look for a repeated word.

The method has O(n) for space and time.

## API
    repeatedWord(String sentence)
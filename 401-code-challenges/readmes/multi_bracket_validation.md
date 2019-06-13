# [Stacks and Queues](https://github.com/pettynan/data-structures-and-algorithms/tree/master/401-code-challenges/src/main/java/multibracketvalidation)
https://github.com/pettynan/data-structures-and-algorithms/tree/master/401-code-challenges/src/main/java/multibracketvalidation

## Challenge
Create a multiBracketValidation method, which takes in a string and returns true or false based on whether or not the curly, square, and round brackets in that string appear in a valid order.

## Approach & Efficiency
multiBracketValidation uses an internal queue. It reads through the string one character at a time. Upon encountering an open bracket, i.e ( { [, the character is pushed onto the stack. Upon encountering a closed bracket, i.e ) } ], the character is compared to the top of the s

The method has O(n) for space and time.

## API
    multiBracketValidation
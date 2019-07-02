# Lecture Notes - Merge Sort
This algorithm takes in an array of integers, and uses recursion to sort it numerically from least to greatest. Modifies the given array in place.

## Learning Objectives
    In this lecture, you will learn about how the merge sort algorithm functions.
    You will also learn about the space complexity and performance of the merge sort algorithm.
## Lecture Flow
    First, look at the visualization to understand how we are separating and then merging the array.
    Then, take a look at the main method to see how it recursively splits the array, and calls the Merge helper method.
    Finally, take a look at the helper method: what is passed into it, and what does it return?

## Diagram
    [This visualization](https://upload.wikimedia.org/wikipedia/commons/c/cc/Merge-sort-example-300px.gif) of the merge sort algorithm is extremely useful in understanding the recursive approach the algorithm takes.

## Algorithm
    mergeSort // The main method
    The main mergeSort method does all of the recursive work for this algorithm.
    Given an array, it copies and splits the array in half, and then calls itself on each half.
    This will repeat until the arrays reach a length of 1, at which point it will begin calling the merge helper method on each pair of 'array halves'.

    merge // The helper method
    This helper method takes an input of an unsorted array C, and two arrays A and B which are the first and second half of that array. Note that the first and second half are both already ordered, due to the recursive nature of how this function is called.
    It begins by comparing the first value from A with the first value from B, and inserts the smaller value into the first position in C. If the value was taken from A, we increment a counter which tracks the current position in A. Otherwise, we do similarly for a counter for B. Either way, we also increment a counter for the whole array C.
    This is repeated until we have reached the end of both arrays A and B, at which point the helper method returns C, now modified in place to be in order from least to greatest.

## Pseudocode
ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length

    if arr.length > 1
      DECLARE mid <-- n/2
      DECLARE b <-- arr[0...mid]
      DECLARE c <-- arr[mid...n]
      // break down the left side
      Mergesort(b)
      // break down the right side
      Mergesort(c)
      // merge the left and the right side together
      Merge(b, c, arr)

ALGORITHM Merge(b, c, a)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < b && j < c
        if b[i] <= c[j]
            a[k] <-- b[i]
            i <-- i + 1
        else
            a[k] = c[j]
            j <-- j + 1

        k <-- k + 1

    if i = b.length
       add remaining items in array c to array a
    else
       add remaining items in array b to array a

    return a

## Readings and References
    https://en.wikipedia.org/wiki/Merge_sort
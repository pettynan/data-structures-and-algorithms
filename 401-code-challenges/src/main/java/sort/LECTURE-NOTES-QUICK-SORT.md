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
    [This visualization](https://en.wikipedia.org/wiki/Quicksort#/media/File:Quicksort-diagram.svg) of the quick sort algorithm is extremely useful in understanding the recursive approach the algorithm takes.

## Algorithm
    quickSort // The main method

    partition // Helper method

    swap // Second helper method
    swap is very simple, given an array and two integer values which are indexes of the array, it in-place swaps the values in the array at those two indices.

## Pseudocode
    ALGORITHM QuickSort(arr, left, right)
        if left < right
            // Partition the array by setting the position of the pivot value
            DEFINE position <-- Partition(arr, left, right)
            // Sort the left
            QuickSort(arr, left, position - 1)
            // Sort the right
            QuickSort(arr, position + 1, right)

    ALGORITHM Partition(arr, left, right)
        // set a pivot value as a point of reference
        DEFINE pivot <-- arr[right]
        // create a variable to track the largest index of numbers lower than the defined pivot
        DEFINE low <-- left - 1
        for i <- left to right do
            if arr[i] <= pivot
                low++
                Swap(arr, i, low)

         // place the value of the pivot location in the middle.
         // all numbers smaller than the pivot are on the left, larger on the right.
         Swap(arr, right, low + 1)
        // return the pivot index point
         return low + 1

    ALGORITHM Swap(arr, i, low)
        DEFINE temp;
        temp <-- arr[i]
        arr[i] <-- arr[low]
        arr[low] <-- temp


## Readings and References
    https://en.wikipedia.org/wiki/Quicksort
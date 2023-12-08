# 10.12 LAB: Insertion sort
The program has four steps:

1. Read the size of an integer array, followed by the elements of the array (no duplicates).
2. Output the array.
3. Perform an insertion sort on the array.
4. Output the number of comparisons and swaps performed.

main() performs steps 1 and 2.

Implement step 3 based on the insertion sort algorithm in the book. Modify insertionSort() to:

- Count the number of comparisons performed.
- Count the number of swaps performed.
- Output the array during each iteration of the outside loop.

Complete main() to perform step 4, according to the format shown in the example below.

Hints: In order to count comparisons and swaps, modify the while loop in insertionSort(). Use static variables for comparisons and swaps.

The program provides three helper methods:

```java
// Read and return an array of integers.
// The first integer read is number of integers that follow.
int[] readNums() 

    // Print the numbers in the array, separated by spaces
    // (No space or newline before the first number or after the last.)
void printNums(int[] nums) 

    // Exchange nums[j] and nums[k].
void swap(int[] nums, int j, int k) 
```
Ex: When the input is:

```
6 3 2 1 5 9 8
```
the output is:

```
3 2 1 5 9 8

2 3 1 5 9 8
1 2 3 5 9 8
1 2 3 5 9 8
1 2 3 5 9 8
1 2 3 5 8 9

comparisons: 7
swaps: 4
```


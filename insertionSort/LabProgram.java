package insertionSort;

import java.util.Scanner;

public class LabProgram {
    static int swaps = 0;
    static int comps = 0;
    // Read and return an array of integers.
    // The first integer read is number of integers that follow.
    private static int[] readNums() {
        Scanner scnr = new Scanner(System.in);
        int size = scnr.nextInt();                // Read array size
        int[] numbers = new int[size];            // Create array
        for (int i = 0; i < size; ++i) {          // Read the numbers
            numbers[i] = scnr.nextInt();
        }
        return numbers;
    }

    // Print the numbers in the array, separated by spaces
    // (No space or newline before the first number or after the last.)
    private static void printNums(int[] nums) {
        for (int i = 0; i < nums.length; ++i) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    // Exchange nums[j] and nums[k].
    private static void swap(int[] nums, int j, int k) {
        int temp = nums[j];
        nums[j] = nums[k];
        nums[k] = temp;
    }

    // Sort numbers
    /* TODO: Count comparisons and swaps. Output the array at the end of each iteration. */
    public static void insertionSort(int[] numbers) {
        int i;
        int j;
        boolean looped;
        comps += numbers.length-1;

        for (i = 1; i < numbers.length; ++i) {
            looped = false;
            int loops = 0;
            j = i;
            // Insert numbers[i] into sorted part,
            // stopping once numbers[i] is in correct position
            while (j > 0 && numbers[j] < numbers[j - 1]) {
                looped = true;
                loops++;
                // Swap numbers[j] and numbers[j - 1]
                swap(numbers, j, j  - 1);
                swaps++;
                --j;
            }
            // Check to see if loop ran and did not end on j>0
            if (looped && j > 0) {
                loops++;
            }
            // checks to see if loop ran to not double count comparison
            if (loops > 0) {
                comps += loops-1;
            }
            printNums(numbers);
        }
    }

    public static void main(String[] args) {
        // Step 1: Read numbers into an array
        int[] numbers = readNums();

        // Step 2: Output the numbers array
        printNums(numbers);
        System.out.println();

        // Step 3: Sort the numbers array
        insertionSort(numbers);
        System.out.println();

        // step 4
        System.out.println("comparisons: " + comps);
        System.out.println("swaps: " + swaps);
        /* TODO: Output the number of comparisons and swaps performed */
    }
}


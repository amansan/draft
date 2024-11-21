package com.personal.challenges;

/**
 * Bell Number
 * The Bell number is the number of ways an array of n items can be partitioned into non-empty subarrays. See the resources section for an in-depth explanation.
 *
 * Create a function that takes a number n and returns the corresponding Bell number.
 *
 * Examples
 * bell(1) ➞ 1
 * // sampleArr = [1]
 * // possiblePartitions = [[[1]]]
 *
 * bell(2) ➞ 2
 * // sampleArr = [1, 2]
 * // possiblePartitions = [[[1, 2]], [[1], [2]]]
 *
 * bell(3) ➞ 5
 * // sampleArr = [1, 2, 3]
 * // possiblePartitions = [[[1, 2, 3]], [[1, 2], [3]], [[1], [2, 3]], [[1, 3], [2]],
 *
 * https://en.wikipedia.org/wiki/Bell_number
 *
 * https://www.geeksforgeeks.org/bell-numbers-number-of-ways-to-partition-a-set/
 */
public class BellNumbers {

    public int bellNumber(int n) {
        // Create a 2D array to store Bell numbers
        int[][] matrix = new int[n + 1][n + 1];

        // Base case
        matrix[0][0] = 1;

        // Fill the Bell number table
        for (int i = 1; i <= n; i++) {
            // Explicitly set B[i][0] to 0
            matrix[i][0] = 0;

            for (int j = 1; j <= i; j++) {
                matrix[i][j] = matrix[i - 1][j - 1] + (matrix[i - 1][j] * j);
            }
        }

        //print matrix
        for (int i = 0; i < matrix.length; i++) { // Iterate through rows
            for (int j = 0; j < matrix[i].length; j++) { // Iterate through columns
                System.out.print(matrix[i][j] + (matrix[i][j] > 10 ? " " : "  ")); // Print element
            }
            System.out.println(); // New line after each row
        }

        // The Bell number B[n] is the sum of the nth row
        int bellNumber = 0;
        for (int j = 0; j <= n; j++) {
            bellNumber += matrix[n][j];
        }

        return bellNumber;
    }


    /**
     * @param n
     * @return
     *
     * @Desc Using wikipedia metrix method
     */
    public int bellNumberAlternative(int n){
        int[][] matrix = new int[n][n];

        matrix[0][0] = 1;

        int i = 1, j = 1;
        for (; i <= n-1; i++) {
            matrix[i][0] = matrix[i-1][i-1];

            j = 1;
            for (; j <= i; j++) {
                matrix[i][j] = matrix[i-1][j-1] + matrix[i][j-1];
            }
        }

        //print matrix
        for (int[] ints : matrix) { // Iterate through rows
            for (int anInt : ints) { // Iterate through columns
                System.out.print(anInt + (anInt > 10 ? " " : "  ")); // Print element
            }
            System.out.println(); // New line after each row
        }

        return matrix[i-1][j-1];
    }
}

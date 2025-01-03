import java.util.HashMap;
import java.util.Map;

public class PrefixSum {
    public static void main(String[] args) {
        // Example 1: Basic Prefix Sum
        // Prefix sum is a technique where we preprocess an array to calculate the cumulative sum of its elements.
        // This helps us efficiently answer range sum queries in O(1) time after O(n) preprocessing.
        int[] arr = {1, 2, 3, 4, 5}; // Input array
        int[] prefixSum = new int[arr.length];
        
        // Compute prefix sum
        prefixSum[0] = arr[0]; // First element remains the same
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        
        // Print prefix sum array
        System.out.print("Prefix Sum Array: ");
        for (int sum : prefixSum) {
            System.out.print(sum + " "); // Output: 1 3 6 10 15
        }
        System.out.println();

        // Example 2: Efficient Range Query
        // Sum of elements from index `left` to `right` using prefix sum
        int left = 1; // Starting index
        int right = 3; // Ending index
        int rangeSum = left == 0 ? prefixSum[right] : prefixSum[right] - prefixSum[left - 1];
        System.out.println("Sum of elements from index " + left + " to " + right + " is: " + rangeSum);
        // Output: 9 (elements are 2, 3, 4)

        // Example 3: Prefix Sum for Modulo Arithmetic (Subarrays divisible by k)
        // Find the number of subarrays whose sum is divisible by a given number `k`
        int k = 5; // Divisor
        int[] arr2 = {4, 5, 0, -2, -3, 1}; // Input array
        Map<Integer, Integer> modMap = new HashMap<>(); // Stores frequency of modulo results
        modMap.put(0, 1); // Initialize for subarrays starting from index 0
        int currentSum = 0;
        int count = 0; // Count of subarrays divisible by k

        for (int num : arr2) {
            currentSum += num;
            int mod = (currentSum % k + k) % k; // Handle negative modulo
            
            // If the same modulo has been seen before, it means the subarray sum is divisible by k
            count += modMap.getOrDefault(mod, 0);
            modMap.put(mod, modMap.getOrDefault(mod, 0) + 1);
        }
        System.out.println("Number of subarrays divisible by " + k + " is: " + count);
        // Output: 7

        // Example 4: Maximum Subarray Sum using Prefix Sum
        // Find the maximum subarray sum using prefix sum
        int[] arr3 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = Integer.MIN_VALUE; // Initialize to a very small value
        int minPrefixSum = 0; // Minimum prefix sum encountered so far
        int currentPrefixSum = 0;

        for (int num : arr3) {
            currentPrefixSum += num;
            maxSum = Math.max(maxSum, currentPrefixSum - minPrefixSum); // Maximum subarray sum ending at this index
            minPrefixSum = Math.min(minPrefixSum, currentPrefixSum);   // Update the minimum prefix sum
        }
        System.out.println("Maximum Subarray Sum is: " + maxSum);
        // Output: 6 (subarray is {4, -1, 2, 1})

        // Example 5: 2D Prefix Sum
        // Compute the prefix sum for a 2D matrix and use it for range queries
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] prefixSum2D = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                prefixSum2D[i][j] = matrix[i][j];
                if (i > 0) prefixSum2D[i][j] += prefixSum2D[i - 1][j];
                if (j > 0) prefixSum2D[i][j] += prefixSum2D[i][j - 1];
                if (i > 0 && j > 0) prefixSum2D[i][j] -= prefixSum2D[i - 1][j - 1];
            }
        }

        // Print the 2D prefix sum array
        System.out.println("2D Prefix Sum Matrix:");
        for (int[] row : prefixSum2D) {
            for (int sum : row) {
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        // Output:
        // 1  3   6
        // 5 12  21
        // 12 27  45

        // Example 6: Subarray with Target Sum (Prefix Sum + HashMap)
        int[] arr4 = {1, 4, 20, 3, 10, 5};
        int target = 33; // Target sum to find
        Map<Integer, Integer> prefixMap = new HashMap<>();
        currentSum = 0;

        for (int i = 0; i < arr4.length; i++) {
            currentSum += arr4[i];

            // Check if currentSum equals the target
            if (currentSum == target) {
                System.out.println("Subarray found from index 0 to " + i);
                break;
            }

            // Check if a prefix sum exists that matches currentSum - target
            if (prefixMap.containsKey(currentSum - target)) {
                System.out.println("Subarray found from index " + (prefixMap.get(currentSum - target) + 1) + " to " + i);
                break;
            }

            // Add current prefix sum to the map
            prefixMap.put(currentSum, i);
        }
        // Output: Subarray found from index 2 to 4 (subarray is {20, 3, 10})
    }
}

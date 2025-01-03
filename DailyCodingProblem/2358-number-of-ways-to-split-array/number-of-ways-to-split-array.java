class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long totalSum = 0;  // Use long to avoid overflow with large numbers
        int noOfWays = 0;

        // Step 1: Calculate the total sum of the array
        for (int num : nums) {
            totalSum += num;
        }

        long prefixSum = 0;
        // Step 2: Iterate and check valid splits
        for (int i = 0; i < n - 1; i++) {
            prefixSum += nums[i];  // Add current element to the prefix sum
            long suffixSum = totalSum - prefixSum;  // Calculate suffix sum

            // Check if the left part sum (prefixSum) is greater than or equal to the right part sum (suffixSum)
            if (prefixSum >= suffixSum) {
                noOfWays++;
            }
        }

        return noOfWays;
    }
}

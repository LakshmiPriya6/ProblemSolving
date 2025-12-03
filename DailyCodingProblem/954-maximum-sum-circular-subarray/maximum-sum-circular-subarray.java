class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        // Combine total sum, max Kadane and min Kadane in one pass to reduce constant factors.
        int totalSum = nums[0];
        int currMax = nums[0];
        int maxSum = nums[0];
        int currMin = nums[0];
        int minSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int v = nums[i];
            totalSum += v;

            // Standard Kadane update for max subarray (use currMax + v or start new at v)
            currMax = Math.max(v, currMax + v);
            maxSum = Math.max(maxSum, currMax);

            // Standard Kadane update for min subarray (use currMin + v or start new at v)
            currMin = Math.min(v, currMin + v);
            minSum = Math.min(minSum, currMin);
        }

        // If all numbers are negative, maxSum already is the largest (least negative) element.
        if (maxSum < 0) {
            return maxSum;
        }

        int wrapSum = totalSum - minSum;
        return Math.max(maxSum, wrapSum);
    }
}
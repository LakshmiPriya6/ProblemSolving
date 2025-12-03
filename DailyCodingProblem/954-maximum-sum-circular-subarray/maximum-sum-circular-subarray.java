class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxKandaneSum = maxKandane(nums);

        if(maxKandaneSum < 0){
            return maxKandaneSum;
        }

        int totalSum = 0;
        for(int num : nums){
            totalSum += num;
        }

        int minKandaneSum = minKandane(nums);

        int wrapSum = totalSum - minKandaneSum;

        return Math.max(wrapSum, maxKandaneSum);
    }

    private int minKandane(int[] nums){
        int currSum = nums[0];
        int minSum = nums[0];

        for(int i=1;i<nums.length;i++){
            currSum = Math.min(nums[i], nums[i] + currSum);
            minSum = Math.min(currSum, minSum);
        }
        return minSum;
    }

    private int maxKandane(int[] nums){
        int currSum = nums[0];
        int maxSum = nums[0];

        for(int i=1;i<nums.length;i++){
            currSum = Math.max(nums[i], nums[i] + currSum);
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
}
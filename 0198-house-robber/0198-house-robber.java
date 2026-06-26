class Solution {
    
    HashMap<Integer, Integer> memo = new HashMap<>();
    
    
    public int rob(int[] nums) {
        // FIX: Handle edge cases for empty or single-element arrays
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        
        int[] dp = new int[nums.length];
        
        dp[0] = nums[0];
        dp[1] = Math.max(nums[1], dp[0]);
        
        for(int i=2;i<nums.length;i++){
            dp[i] = Math.max(dp[i-1], nums[i]+dp[i-2]);
        }
        return dp[nums.length-1];  // FIX: Return last computed value instead of out-of-bounds index    
        
    }
}
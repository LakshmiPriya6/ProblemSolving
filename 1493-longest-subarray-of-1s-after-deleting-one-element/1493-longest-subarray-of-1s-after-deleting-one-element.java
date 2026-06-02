class Solution {
    public int longestSubarray(int[] nums) {
       int left = 0;
       int curr = 0;
       int ans = 0;
       for(int right = 0; right < nums.length;right++){
            curr += (nums[right] == 0 ? 1 : 0);

            while(curr  > 1){
               curr -= nums[left] == 0 ? 1 : 0;
               left++;
            }
           
            ans = Math.max(ans, right - left);
       } 
       return ans;
    }
}
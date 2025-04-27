class Solution {
    public int singleNumber(int[] nums) {
       int ans = 0;
       int len = nums.length;
       for(int i=0;i<len;i++){
         ans = ans ^ nums[i];
       }
       return ans;
    }
}
class Solution {
    public int removeElement(int[] nums, int val) {
        int r = 0;
        int w = 0;
        while(r<nums.length){
            if(nums[r]==val){
                r++;
            } else {
                nums[w] = nums[r];
                r++;
                w++;
            }
        }
        return w;
    }
}
//[0,1,2,2,3,0,4,2] 2
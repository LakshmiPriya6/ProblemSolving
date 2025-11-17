class Solution {
    public void moveZeroes(int[] nums) {
       int left = 0;
       int right = 1;
       while(right<nums.length && left<nums.length){
        if(nums[left] != 0){
            left++;
            right = left +1;
        } else if(right < nums.length && nums[right]==0){
            right++;
        }else if(nums[left] == 0){
            if(right < nums.length  && nums[right] != 0){
                swap(nums, left, right);
                left++;
                right = left+1;
            }
        }
       }
    }
    private void swap(int[] nums, int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
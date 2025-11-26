class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        return binarySearch(nums, low, high, target);
    }
    
    private int binarySearch(int[] nums, int low, int high, int target){
        if (low > high) {
            return -1;
        }
            int mid = low + (high - low)/2;
            if(target == nums[mid]){
                return mid;
            } else if(target > nums[mid]){
                return binarySearch(nums, mid+1, high, target);
            } else {
                return binarySearch(nums, low, mid -1, target);
            }
    }
}
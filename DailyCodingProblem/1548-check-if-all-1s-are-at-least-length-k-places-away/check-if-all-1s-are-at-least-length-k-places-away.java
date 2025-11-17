class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        Integer lastOneIndex = null; 
        for (int i = 0; i < nums.length; i++) { 
            if (nums[i] == 1) {
                if (lastOneIndex != null) {
                    if (i - lastOneIndex - 1 < k) {
                        return false;
                    }
                }
                lastOneIndex = i;
            }
        }
        return true;
    }  
}
class Solution {
    public int minimumOperations(int[] nums) {
        int count =0;
        for(int num : nums){
            count+= (num%3) >0 ? 1 : 0;
        }
        return count;
    }
}
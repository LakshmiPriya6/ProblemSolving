class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result = new ArrayList<>();
        int currentRemainder = 0; 
        for(int num : nums){
            currentRemainder = (currentRemainder * 2 + num) % 5; 
            result.add(currentRemainder == 0); 
        }
        return result;
    }
}
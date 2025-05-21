class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;

        for(int i=0; i< nums.length; i++){
            int current = nums[i];
            int compliment = k - nums[i];
            if(map.getOrDefault(compliment, 0) > 0){
                map.put(compliment, map.get(compliment)-1);
                count++;
            } else {
                map.put(current, map.getOrDefault(current,0)+1);
            }
        }
        return count;
    }
}
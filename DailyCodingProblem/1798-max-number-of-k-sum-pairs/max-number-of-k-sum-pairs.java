class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(int i=0; i< nums.length; i++){
            int current = nums[i];
            int compliment = k - nums[i];
            if(map.getOrDefault(current, 0) > 0 && map.getOrDefault(compliment, 0) > 0){
                if((current == compliment) && map.get(current) < 2)
                    continue;
                map.put(current, map.get(current)-1);
                map.put(compliment, map.get(compliment)-1);
                count++;
            }
        }
        return count;
    }
}
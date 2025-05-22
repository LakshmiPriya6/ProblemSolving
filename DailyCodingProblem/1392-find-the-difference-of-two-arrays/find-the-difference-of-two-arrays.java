class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return Arrays.asList(getElementsOnlyInFirstList(nums1, nums2), getElementsOnlyInFirstList(nums2, nums1));
    }

    public List<Integer> getElementsOnlyInFirstList(int[] nums1, int[] nums2){
        Set<Integer> onlyInNums1 = new HashSet<>();

        Set<Integer> existInNum2 = new HashSet<>();

        for(int num: nums2){
            existInNum2.add(num);
        }
        for(int num: nums1){
            if(!existInNum2.contains(num)){
               onlyInNums1.add(num);
            }
        }
        
        return new ArrayList<>(onlyInNums1);
    }
    
}
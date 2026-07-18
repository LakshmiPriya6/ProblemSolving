class Solution {
    public int findGCD(int[] nums) {
        int largeNum = Integer.MIN_VALUE;
        int smallNum = Integer.MAX_VALUE;

        for(int num : nums){
            smallNum = Math.min(smallNum, num);
            largeNum = Math.max(largeNum, num);
        }
     
        int a = smallNum, b = largeNum;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
class Solution {
    public int heightChecker(int[] heights) {
        int[] sortedArr = Arrays.copyOfRange(heights, 0,heights.length);
        Arrays.sort(sortedArr);
        int i=0, count = 0;
        for(int height : heights){
            if(height != sortedArr[i++]){
                count+=1;
            }
        }
        return count;
    }
}
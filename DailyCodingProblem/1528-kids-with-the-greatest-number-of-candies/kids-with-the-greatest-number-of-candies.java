class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        ArrayList<Boolean> result = new ArrayList<Boolean>();
        for(int candy : candies){
            maxCandies = Math.max(maxCandies, candy);

        }
        for(int candy : candies){
            if(maxCandies <= candy + extraCandies){
                result.add(true);
            } else {
                result.add(false);
            }

        }
        return result;
    }
}
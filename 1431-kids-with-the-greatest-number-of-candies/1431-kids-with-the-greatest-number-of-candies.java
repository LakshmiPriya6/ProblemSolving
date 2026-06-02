class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        List<Boolean> maxCandy = new ArrayList<>();
        for(int candy = 0; candy < candies.length;candy++){
          maxCandies = Math.max(maxCandies, candies[candy]);
        }
        for(int candy = 0; candy < candies.length;candy++){
         maxCandy.add(maxCandies <= candies[candy] +extraCandies);
        }
        return maxCandy;
    }
}
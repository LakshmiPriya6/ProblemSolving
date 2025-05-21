class Solution {
    public int largestAltitude(int[] gain) {
        int currentAltitude = 0;

        int largestAltitude = 0;
        for(int i=0; i<gain.length;i++){
            currentAltitude += gain[i];
            largestAltitude = Math.max(largestAltitude,currentAltitude);
        }
        return largestAltitude;
    }
}
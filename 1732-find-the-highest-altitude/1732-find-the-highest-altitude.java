class Solution {
    public int largestAltitude(int[] gain) {
       int curr = 0;
       int large = 0;

       for(int i=0; i<gain.length;i++){
           curr += gain[i];
           large = Math.max(large, curr);
       }
       return large;
    }
}
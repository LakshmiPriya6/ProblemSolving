class Solution {
    public boolean isSubsequence(String s, String t) {
        int prev = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int idx=t.indexOf(c,prev + 1);
            if(idx==-1){
                return false;
            
            }
         prev=idx;

        }
        return true;
   }
}
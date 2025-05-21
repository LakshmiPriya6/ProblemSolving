class Solution {
    public boolean isSubsequence(String s, String t) {
        Integer p1 = 0;
        Integer p2 = 0;
        Integer leftBound = s.length();
        Integer rightBound = t.length();
        
            while(p1<s.length() && p2 < t.length()){
                
                    if(s.charAt(p1) == t.charAt(p2)){
                        p1 += 1;
                    } 
                        p2 +=1;
                }
                return p1 == s.length();
        }    
}
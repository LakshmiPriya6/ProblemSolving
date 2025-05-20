class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        StringBuilder result = new StringBuilder();
        int p1 = 0; int p2=0;
           while(p1<m || p2<n){
             if(p1<m){
             result.append(word1.charAt(p1++));
             } 
             if(p2<n){
             result.append(word2.charAt(p2++));
             }
           
        }
        return result.toString();
    }
}
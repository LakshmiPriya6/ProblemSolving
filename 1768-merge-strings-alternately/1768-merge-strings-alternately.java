class Solution {
    public String mergeAlternately(String word1, String word2) {
       int len1 = word1.length();
       int len2 = word2.length();
       int p1 = 0, p2 = 0;
       StringBuilder result = new StringBuilder();
       while(p1 < len1 || p2 < len2){
        if(p1<len1){
            result.append(word1.charAt(p1++));
        }
        if(p2<len2){
            result.append(word2.charAt(p2++));
        }
       }
       return result.toString();
    }
}
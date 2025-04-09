class Solution {
    public String mergeAlternately(String word1, String word2) {
       int n1 = word1.length();
       int n2 = word2.length();
       int p1 = 0, p2 =0;
       StringBuilder result = new StringBuilder();

       while(p1< n1 || p2 < n2){
         if(p1 < n1){
            result.append(word1.charAt(p1));
            p1++;
         }
         if(p2 < n2){
            result.append(word2.charAt(p2));
            p2++;
         }
        }

        return result.toString();
    }
}
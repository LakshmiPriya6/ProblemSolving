class Solution {
    public int maxVowels(String s, int k) {
        int[] noOfVowelsAtk = new int[s.length()-1];
        int count = 0;
        for(int i=0; i<k;i++){
            
            if(isVowel(s.charAt(i)) == 1){
               count++;
            }
        }
        int vowelInk = count;
        for(int i=k;i<s.length();i++){
           count += isVowel(s.charAt(i));
           count -= isVowel(s.charAt(i-k));
           vowelInk = Math.max(count, vowelInk);
        }
        return vowelInk;
    }

    public int isVowel(char c){
        return (c == 'a' || c == 'e' ||c == 'i' || c == 'o' ||c == 'u') ? 1 : 0;
    }
}
class Solution {
    public int maxVowels(String s, int k) {
       Set<Character> vowel = Set.of('a', 'e','i','o','u');

       int count = 0;

       for(int i=0;i<k;i++){
         count += vowel.contains(s.charAt(i)) ? 1 : 0;
       }

       int answer = count;
       for(int i=k;i<s.length();i++){
          count+=vowel.contains(s.charAt(i)) ? 1 : 0;
          count-= vowel.contains(s.charAt(i-k)) ? 1 : 0;
          answer = Math.max(answer, count);

       }
    return answer;
    }
}
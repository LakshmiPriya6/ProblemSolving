class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
       
        List<String> wordList = Arrays.asList(words);
     
        Collections.reverse(wordList);

        return String.join(" ", wordList);
    }
}
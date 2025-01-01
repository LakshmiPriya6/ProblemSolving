class Solution {
    public boolean isCircularSentence(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");
        
        // Check circular condition for each adjacent pair of words
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            String nextWord = words[(i + 1) % words.length];  // Ensure circular check for the last word

            // Check if last character of current word matches the first character of next word
            if (currentWord.charAt(currentWord.length() - 1) != nextWord.charAt(0)) {
                return false;
            }
        }

        // If all checks pass, the sentence is circular
        return true;
    }
}

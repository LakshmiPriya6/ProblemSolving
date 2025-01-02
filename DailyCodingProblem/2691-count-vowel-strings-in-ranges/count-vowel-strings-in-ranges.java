class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] vowelCountUpTo = new int[n];
        
        // Preprocess the words to check if the first and last characters are vowels
        vowelCountUpTo[0] = isVowel(words[0].charAt(0)) && isVowel(words[0].charAt(words[0].length() - 1)) ? 1 : 0;
        for (int i = 1; i < n; i++) {
            vowelCountUpTo[i] = vowelCountUpTo[i - 1] + (isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1)) ? 1 : 0);
        }

        // Process each query
        int[] result = new int[queries.length];
        for (int q = 0; q < queries.length; q++) {
            int l = queries[q][0], r = queries[q][1];
            if (l > 0) {
                result[q] = vowelCountUpTo[r] - vowelCountUpTo[l - 1];
            } else {
                result[q] = vowelCountUpTo[r];
            }
        }
        
        return result;
    }

    // Helper function to check if a character is a vowel
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}

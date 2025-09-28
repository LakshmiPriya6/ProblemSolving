class Solution {
    public boolean isSubsequence(String s, String t) {
        // Use primitive int for pointers to avoid boxing/unboxing overhead.
        int p1 = 0;
        int p2 = 0;
        
        while (p1 < s.length() && p2 < t.length()) {
            // If characters match, advance the pointer for s.
            if (s.charAt(p1) == t.charAt(p2)) {
                p1++;
            }
            // Always advance the pointer for t to scan through it.
            p2++;
        }
        
        // If p1 has traversed the entire length of s, it's a subsequence.
        return p1 == s.length();
    }
}
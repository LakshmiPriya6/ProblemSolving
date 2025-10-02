class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        // First, build a frequency map of the characters.
        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        // Second, iterate through the string to find the first character with a count of 1.
        for (int i = 0; i < s.length(); i++) {
            if (counts.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        // If no unique character is found, return -1.
        return -1;
    }
}
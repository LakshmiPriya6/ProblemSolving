class Solution {
    public boolean closeStrings(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }

        Map<Character, Integer> word1map = new HashMap<>();
        Map<Character, Integer> word2map = new HashMap<>();

        for(char c : word1.toCharArray()){
            word1map.put(c , word1map.getOrDefault(c, 0)+1);
        }
        for(char c : word2.toCharArray()){
            word2map.put(c , word2map.getOrDefault(c, 0)+1);
        }

        if(!word1map.keySet().equals(word2map.keySet())){
            return false;
        }

        List<Integer> freq1 = new ArrayList<>(word1map.values());
        List<Integer> freq2 = new ArrayList<>(word2map.values());

        Collections.sort(freq1);
        Collections.sort(freq2);

        return freq1.equals(freq2);
    }
}
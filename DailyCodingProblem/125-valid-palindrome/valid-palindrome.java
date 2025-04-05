class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();

        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                builder.append(Character.toLowerCase(c));
            }
    }

        String filteredString = builder.toString();
        String reversedString = builder.reverse().toString();

        return filteredString.equals(reversedString);
    }
}
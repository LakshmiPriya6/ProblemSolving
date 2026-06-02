class Solution {
    public String reverseVowels(String s) {
        int p1 = 0;
        int p2 = s.length()-1;
        char[] chars = s.toCharArray();
        while(p1<p2){
            if(isVowel(s.charAt(p1)) && isVowel(s.charAt(p2))){
                Swap(chars, p1, p2);
                p1++;
                p2--;
            } else if (isVowel(s.charAt(p1)) && !isVowel(s.charAt(p2)) ){
                p2--;
            } else if(!isVowel(s.charAt(p1)) && isVowel(s.charAt(p2)) ){
                p1++;
            } else {
                p1++;
                p2--;
            }
        }
        return new String(chars);
    }

    private boolean isVowel(char c_lower){
        return (c_lower == 'a' || c_lower == 'e' || c_lower == 'i' ||
        c_lower == 'o' || c_lower == 'u') || (c_lower == 'A' || c_lower == 'E' || c_lower == 'I' ||
        c_lower == 'O' || c_lower == 'U');
    }

    private void Swap(char[] str, int p1, int p2){
        char temp = str[p1];
        str[p1] = str[p2];
        str[p2] = temp;
      
    }
}
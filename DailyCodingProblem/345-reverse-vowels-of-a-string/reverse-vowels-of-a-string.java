class Solution {
    public String reverseVowels(String s) {
        char str[] = s.toCharArray();
        int i = 0;
        int j = str.length-1;

        

        while(i<j){
            while ( i < s.length() && !isVowel(str[i])){
                i++;
            } 
            while (j >= 0 && !isVowel(str[j])){
                j--;
            }
            if(i <j){
               swap(str, i++, j--);
            }
        }
        return new String(str);
    }

    public void swap(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

    public boolean isVowel(char a) {
        return a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' ||
                a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U';
    }
}
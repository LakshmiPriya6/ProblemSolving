class Solution {
    public String reverseVowels(String s) {

        char[] charArray = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        while(left < right){

            while(left<s.length() && !isVowel(charArray[left])){
                left++;
            }
            while(right>=0 && !isVowel(charArray[right])){
                right--;
            }
            if(left < right){
                swap(charArray, left++, right--);
            }
        }
        return new String(charArray);
    }
    boolean isVowel(char a) {
    a = Character.toLowerCase(a);
    return a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u';
    }

    void swap(char[] arr, int x, int y){
        char temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

}
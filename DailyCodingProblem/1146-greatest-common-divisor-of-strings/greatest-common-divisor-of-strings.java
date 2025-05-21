class Solution {
    /*public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        for(int i = Math.min(len1, len2); i>=1;i--){
            if(valid(str1, str2, i)){
                return str1.substring(0,i);
            }
        }
        return "";
    }

    public boolean valid(String str1, String str2, int k){
        int len1 = str1.length();
        int len2 = str2.length();
        if(len1 % k > 0 || len2 % k > 0){
            return false;
        } else{
            String base = str1.substring(0,k);
            return str1.replace(base,"").isEmpty() && str2.replace(base,"").isEmpty();
        }
    }**/

    public String gcdOfStrings(String str1, String str2){
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }

        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    public int gcd(int len1, int len2){
        if(len2==0){
            return len1;
        } else {
            return gcd(len2, len1%len2);
        }
    }
}
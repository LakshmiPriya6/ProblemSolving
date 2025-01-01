class Solution {
    public boolean isCircularSentence(String sentence) {
       String[] str = sentence.split(" "); Boolean flag = true;
       String firstStr = str[0];
       String lastStr = str[str.length-1];
       if(firstStr.charAt(0) != lastStr.charAt(lastStr.length()-1)){
        return false;
        }
        
       for (int i=0; i< str.length-1;i++){
        String newStr = str[i];
        String nextStr = str[i+1];
        if(newStr.charAt(newStr.length()-1) != nextStr.charAt(0)){
            flag = false;
        }
       }
       return flag;
    }
}
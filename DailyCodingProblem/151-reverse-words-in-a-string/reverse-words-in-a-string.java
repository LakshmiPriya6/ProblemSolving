class Solution {
    /**public String reverseWords(String s) {
        s = s.trim();
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
        
    }*/

    //Solution 2
    /*
    public StringBuilder trimSpaces(String s){
        int left =0, right = s.length() -1;

        while(left<=right && s.charAt(left) == ' ') ++left;

        while(right>= left && s.charAt(right) == ' ') --right;


        StringBuilder sb = new StringBuilder();
        while(left<=right){
            char c = s.charAt(left);
            if(c !=' ') sb.append(c);
            else if (sb.charAt(sb.length()-1) != ' ') sb.append(c);
            ++left;
        }
        return sb;
    }

    public void reverse(StringBuilder sb, int left, int right){
        while(left < right){
            char tmp = sb.charAt(left);
            sb.setCharAt(left++, sb.charAt(right));
            sb.setCharAt(right--, tmp);
        }
    }

    public void reverseEachWord(StringBuilder sb){
        int n = sb.length();
        int start = 0, end = 0;

        while(start < n){
            
            while( end < n && sb.charAt(end) != ' ') ++end;
            reverse(sb, start, end-1);
            start = end+1;
            ++end;
        }
    }

    public String reverseWords(String s) {
       StringBuilder sb = trimSpaces(s);

       reverse(sb, 0, sb.length()-1);

       reverseEachWord(sb);

       return sb.toString();
        
    }*/

    public String reverseWords(String s){
        int left=0, right = s.length()-1;

        while(left<=right && s.charAt(left) == ' ') ++left;
        while(left<=right && s.charAt(right) == ' ') --right;


        Deque<String> queue = new ArrayDeque();
        StringBuilder word = new StringBuilder();

        while(left <= right){
            char c = s.charAt(left);
            if(word.length()!=0 && c == ' '){
                queue.offerFirst(word.toString());
                word.setLength(0);
            } else if(c != ' '){
                word.append(c);
            }
            ++left;
        }
        queue.offerFirst(word.toString());
        return String.join(" ", queue);
    }
}
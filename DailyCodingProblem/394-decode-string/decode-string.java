class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack();
        for(char c : s.toCharArray()){
            if(c != ']'){
                stack.push(c);
            } else{
                StringBuilder decodedString = new StringBuilder();
                while(stack.peek() != '['){
                    decodedString.append(stack.pop());
                }
                stack.pop(); //'['
                int base = 1;
                int k = 0;
                while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                    k = k + (stack.pop()-'0') * base;
                    base*=10;
                }
                decodedString.reverse();
                while(k!=0){
                    for(int j=0; j<decodedString.length(); j++){ // FIX: Loop from start to end
                        stack.push(decodedString.charAt(j));
                    }
                    k--;
                }
            }
        }
        char[] result = new char[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return new String(result);
    }
}
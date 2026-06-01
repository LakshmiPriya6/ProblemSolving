class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        int[] answer = new int[length];
        Deque<Integer> stack = new ArrayDeque();
        
        for(int currDay = 0;currDay< length; currDay++){
            int currentTemp = temperatures[currDay];

            while(!stack.isEmpty() && temperatures[stack.peek()] < currentTemp){
                int prevDay = stack.pop();
                answer[prevDay] = currDay - prevDay;
            }
            stack.push(currDay);
        }
        
        return answer;
    }
}
public class Solution {
    public int maximumGain(String s, int x, int y) {
        if (x >= y) {
            // Remove "ab" first, then "ba"
            return removePair(s, 'a', 'b', x) +
                   removePair(removeFromString(s, 'a', 'b', x), 'b', 'a', y);
        } else {
            // Remove "ba" first, then "ab"
            return removePair(s, 'b', 'a', y) +
                   removePair(removeFromString(s, 'b', 'a', y), 'a', 'b', x);
        }
    }

    private int removePair(String s, char first, char second, int points) {
        int total = 0;
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == second && !stack.isEmpty() && stack.peek() == first) {
                stack.pop();
                total += points;
            } else {
                stack.push(c);
            }
        }
        return total;
    }

    private String removeFromString(String s, char first, char second, int points) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == second && !stack.isEmpty() && stack.peek() == first) {
                stack.pop(); // remove pair
            } else {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) sb.append(stack.removeLast());
        return sb.toString();
    }
}

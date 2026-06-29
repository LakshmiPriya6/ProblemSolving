class Solution {

    private Map<Integer, Integer> memo = new HashMap<>(Map.of(0, 0, 1, 1));

    public int fib(int N) {
         if(memo.containsKey(N)){
            return memo.get(N);
            }
            memo.put(N, fib(N-1)+fib(N-2));
            return memo.get(N);   
    }
}
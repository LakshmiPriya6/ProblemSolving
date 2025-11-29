class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack();
        for(int asteroid : asteroids){
            boolean flag = true;
            while(!stack.isEmpty() && (stack.peek() > 0 && asteroid < 0)){
                //top asteroid is small - will explode
                if(Math.abs(stack.peek()) < Math.abs(asteroid)){
                    stack.pop();
                    continue;
                } else if(Math.abs(stack.peek()) == Math.abs(asteroid)){
                    //both will explode;
                    stack.pop();
                }
                //asteroid incoming is small, will explode - dont push
                flag = false;
                break;
            }
            if(flag){
                stack.push(asteroid);
            }
        }

        int[] remAsteroids = new int[stack.size()];
        for(int i = remAsteroids.length-1;i>=0;i--){
            remAsteroids[i] = stack.peek();
            stack.pop();
        }
        return remAsteroids;
    }
}
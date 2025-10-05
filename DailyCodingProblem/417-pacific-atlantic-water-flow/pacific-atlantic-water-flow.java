class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        
        
        boolean[][] canReachPacific = new boolean[m][n];
        boolean[][] canReachAtlantic = new boolean[m][n];
        
        Queue<int[]> pacificQueue = new LinkedList<>();
        Queue<int[]> atlanticQueue = new LinkedList<>();
        
        // Initialize border cells for Pacific Ocean (top and left borders)
        for (int i = 0; i < m; i++) {
            pacificQueue.offer(new int[]{i, 0});
            canReachPacific[i][0] = true;
        }
        for (int j = 0; j < n; j++) {
            pacificQueue.offer(new int[]{0, j});
            canReachPacific[0][j] = true;
        }
        
        // Initialize border cells for Atlantic Ocean (bottom and right borders)
        for (int i = 0; i < m; i++) {
            atlanticQueue.offer(new int[]{i, n-1});
            canReachAtlantic[i][n-1] = true;
        }
        for (int j = 0; j < n; j++) {
            atlanticQueue.offer(new int[]{m-1, j});
            canReachAtlantic[m-1][j] = true;
        }
        
        // Run BFS for both oceans
        bfs(heights, canReachPacific, pacificQueue);
        bfs(heights, canReachAtlantic, atlanticQueue);
        
        // Find intersection - cells that can reach both oceans
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (canReachPacific[i][j] && canReachAtlantic[i][j]) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }
        
        return result;
    }

    // BFS approach using Queue
    private void bfs(int[][] heights, boolean[][] canReach, Queue<int[]> queue) {
        int m = heights.length;
        int n = heights[0].length;
        int[][] directions = {{-1,0}, {1,0}, {0,-1}, {0,1}}; // up, down, left, right
        
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int row = cell[0], col = cell[1];
            
            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                
                // Check bounds and conditions
                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n 
                    && !canReach[newRow][newCol] 
                    && heights[newRow][newCol] >= heights[row][col]) { // Key: reverse condition!
                    
                    canReach[newRow][newCol] = true;
                    queue.offer(new int[]{newRow, newCol});
                }
            }
        }
    }
}
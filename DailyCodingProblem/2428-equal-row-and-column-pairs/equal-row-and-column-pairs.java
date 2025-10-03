class Solution {
    public int equalPairs(int[][] grid) {
        int result = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0; j<grid.length;j++){
                boolean match = true;
                for(int k=0; k< grid.length;k++){
                    if(grid[i][k] != grid[k][j]){
                      match = false;
                      break;
                }
                }
                  if(match){
                result++;
            }
            }
        }
        return result;
    }
}
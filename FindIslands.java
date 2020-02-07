class Solution {
    public int numIslands(char[][] grid) {
      int count = 0;
      if(grid.length>0){
        boolean[][] color = new boolean[grid.length][grid[0].length];
        for(boolean[] ar:color){
          Arrays.fill(ar,false);
        }
      
      for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
          if(color[i][j] == false && grid[i][j]=='1'){
             dfs(grid,color,i,j);
            count++;
          }
        }
      }
      }
      return count;
    }
  
  private void dfs(char[][] grid, boolean[][]color,int r,int c){
    color[r][c] = true;
    if(grid[r][c] == '1'){
      if(r+1<grid.length && color[r+1][c]==false){
      dfs(grid,color,r+1,c);
      }
      if(c+1<grid[0].length && color[r][c+1]==false){
      dfs(grid,color,r,c+1);
      }
      if(r-1>=0 && color[r-1][c]==false){
      dfs(grid,color,r-1,c);
      }
      if(c-1>=0 && color[r][c-1]==false){
      dfs(grid,color,r,c-1);
      }
    }
  }
}
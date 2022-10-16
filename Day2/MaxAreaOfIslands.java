package Day2;

public class MaxAreaOfIslands {
   public int max=0;
    public int maxAreaOfIsland(int[][] grid) {
        int ret=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if(grid[i][j]==1)
                {
                    max=0;
                    dfs(i, j, grid);
                }
                ret=Math.max(max, ret);
            }
        }
        return ret;
    }

    public void dfs(int i,int j,int [][]grid)
    {
        if(i>=0&&j>=0&&i<grid.length&&j<grid[0].length&&grid[i][j]==1)
        {
            grid[i][j]=2;
            max++;
           
            dfs(i-1, j, grid);
            dfs(i+1, j, grid);
            dfs(i, j-1, grid);
            dfs(i, j+1, grid);
            

        }

    }
}

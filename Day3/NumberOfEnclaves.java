package Day3;

public class NumberOfEnclaves {

public static void main(String[] args) {
    int[][]grind=new int[][]{{0,0,0,1,1,1,0,1,0,0},{1,1,0,0,0,1,0,1,1,1},{0,0,0,1,1,1,0,1,0,0},{0,1,1,0,0,0,1,0,1,0},
    {0,1,1,1,1,1,0,0,1,0},{0,0,1,0,1,1,1,1,0,1},{0,1,1,0,0,0,1,1,1,1},{0,0,1,0,0,1,0,1,0,1},{1,0,1,0,1,1,0,0,0,0},{0,0,0,0,1,1,0,0,0,1}};    
    for (int i = 0; i < grind.length; i++) {
        for (int j = 0; j < grind[0].length; j++) {
            System.out.print(grind[i][j]+" ");
        }
        System.out.println();
    }
    
    dfs(max, max, grind);
}

    public static int  max;
    public static int numEnclaves(int[][] grid) {
      
      for (int i = 0; i < grid.length; i++) {
       if(grid[i][0]==1)
        dfs(i, 0, grid);
        if(grid[i][grid[0].length-1]==1)
        dfs(i, grid[0].length-1, grid);
      }
      for (int j = 0; j < grid[0].length; j++) {
        if(grid[0][j]==1)
        dfs(0, j, grid);
        if(grid[grid.length-1][j]==1)
        dfs(grid.length-1, j, grid);
      }
      
      max=0;
        for (int i = 1; i < grid.length-1; i++) {
        for (int j = 1; j < grid[0].length-1; j++) {
            if(grid[i][j]==1)
            {
                dfs(i, j, grid);
            }
        }
      }  
      
      return max; 
    }

    public static void dfs(int i,int j,int[][]grid)
    {
        if(i>=0&&j>=0&&i<grid.length&&j<grid[0].length&&grid[i][j]==1)
        {
            grid[i][j]=0;
            max++;
            dfs(i+1, j, grid);
            dfs(i-1, j, grid);
            dfs(i, j+1, grid);
            dfs(i, j-1, grid);

        }

    }
}

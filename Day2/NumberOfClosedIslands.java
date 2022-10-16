package Day2;

public class NumberOfClosedIslands {
    
public static void main(String[] args) {
    int [][]grid=new int[][]{{0,0,1,1,0,1,0,0,1,0},{1,1,0,1,1,0,1,1,1,0},{1,0,1,1,1,0,0,1,1,0},{0,1,1,0,0,0,0,1,0,1},{0,0,0,0,0,0,1,1,1,0},{0,1,0,1,0,1,0,1,1,1},{1,0,1,0,1,1,0,0,0,1},{1,1,1,1,1,1,0,0,0,0},{1,1,1,0,0,1,0,1,0,1},{1,1,1,0,1,1,0,1,1,0}};
   System.out.println( closedIsland(grid));
}


    public static int closedIsland(int[][] grid) {
        int count=0;
        
        for (int i = 0; i < grid.length; i++) {
            dfs(i, 0, grid);
            dfs(i, grid[0].length-1, grid);
        }
        for (int j = 0; j < grid[0].length; j++) {
            dfs(0, j, grid);
            dfs(grid.length-1,j, grid);
        }
        


        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                
                
                
               
                if(grid[i][j]==0)
                {
                    count++;
                    dfs(i, j, grid);
                }
                
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j]+" ");
            }
            System.err.println();
        }

        return count;
    }

    public static void dfs(int i,int j,int[][] grid)
    {
        if(i>=0&&j>=0&&i<grid.length&&j<grid[0].length&&grid[i][j]==0)
        {
            grid[i][j]=2;
           
           
            dfs(i-1, j, grid);
            dfs(i+1, j, grid);
            dfs(i, j-1, grid);
            dfs(i, j+1, grid);
            

        }

    }
}

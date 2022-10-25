package Day6;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestBridge {
    public int count;
    public int shortestBridge(int[][] grid) {
        int max=0;
        Queue<int[]> bfs=new LinkedList<>(); 
        boolean[][]b=new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]==1)
                {
                bfs.add(new int[]{i,j});
               
                }
            }
        }
       
        
        while (bfs.size()>0) {
            int size=bfs.size();
            for (int i = 0; i < size; i++) {
                int[] pk=bfs.poll();
               
               if(pk[0]>=0&&pk[1]>=0&&pk[0]<grid.length&&pk[1]<grid[0].length&&!b[pk[0]][pk[1]])
                {bfs.add(new int[]{pk[0]+1,pk[1]});
                bfs.add(new int[]{pk[0]-1,pk[1]});
                bfs.add(new int[]{pk[0],pk[1]+1});
                bfs.add(new int[]{pk[0],pk[1]-1});
                b[pk[0]][pk[1]]=true;
                 }
                
                  
            }
            max++;

        }
        return max;
    }
}

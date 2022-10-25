package Day5;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathINBinaryMatrix {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int max=0;
        if(grid[0][0]==1||grid[grid.length-1][grid[0].length-1]==1) return -1;
        Queue<int[]> bfs=new LinkedList<>();
        bfs.add(new int[]{0,0});
    
        while (bfs.size()>0) {
            int size=bfs.size();
            for (int i = 0; i < size; i++) {
                int[] pk=bfs.poll();
               
               if(pk[0]>=0&&pk[1]>=0&&pk[0]<grid.length&&pk[1]<grid[0].length&&grid[pk[0]][pk[1]]==0)
                {
                    bfs.add(new int[]{pk[0]+1,pk[1]+1});
                    bfs.add(new int[]{pk[0]-1,pk[1]-1});
                    bfs.add(new int[]{pk[0]-1,pk[1]+1});
                    bfs.add(new int[]{pk[0]+1,pk[1]-1});
                bfs.add(new int[]{pk[0]+1,pk[1]});
                bfs.add(new int[]{pk[0]-1,pk[1]});
                bfs.add(new int[]{pk[0],pk[1]+1});
                bfs.add(new int[]{pk[0],pk[1]-1});
                grid[pk[0]][pk[1]]=1;
                 }
                 
                 bfs.clear();
                 if(grid[grid.length-1][grid[0].length-1]==1)
                  break;
                  
            }
            max++;

        }
        return grid[grid.length-1][grid[0].length-1]==0?-1: max;
    }
}

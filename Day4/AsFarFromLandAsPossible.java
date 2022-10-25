package Day4;

import java.util.LinkedList;
import java.util.Queue;

public class AsFarFromLandAsPossible {
    public int maxDistance(int[][] grid) {
        int max=0;
        Queue<int[]> bfs=new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]==1)
                {
                bfs.add(new int[]{i,j});
                grid[i][j]=0;
                }
            }
        }
        if(bfs.size()==0||bfs.size()==(grid.length*grid[0].length)) return -1;
        boolean[][]b=new boolean[grid.length][grid[0].length];
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

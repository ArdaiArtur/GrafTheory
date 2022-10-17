public class CountSubIslands {
    public boolean b;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int count=0;
        for (int i = 0; i < grid2.length; i++) {
            for (int j = 0; j < grid2[0].length; j++) {
                 b=true;
                if(grid2[i][j]==1){
                dfs(i, j, grid1, grid2);
                if(b) count++;
                }
            }
        }
        
        return count;
    }
// referat cerere transcriere (model) prezentare pdf declaratie al anunti copie
//examen sctis algoritmica baza de date oop (sisteme de operare)
//alg sorteri backtracking (permutari aranjamente combinari ) divaid and concore
//bd un tabel cu concursuri 
//lista stiva coada arrays matrix




    public void dfs(int i,int j,int[][]grid1,int[][]grid2)
    {
        if(i>=0&&j>=0&&i<grid2.length&&j<grid2[0].length&&grid2[i][j]==1)
        {
            if(grid1[i][j]==0)
            b=false;

            grid2[i][j]=0;
            
            dfs(i+1, j, grid1,grid2);
            dfs(i-1, j, grid1,grid2);
            dfs(i, j+1, grid1,grid2);
            dfs(i, j-1, grid1,grid2);

        }

    }
}

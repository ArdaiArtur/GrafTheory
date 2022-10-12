package Day1;

/**
 * FloodFill
 */
public class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldcolor=image[sr][sc];
        if(oldcolor!=color)  dfs(image, sr, sc, color, oldcolor);
        return image;
       

    }
    public void dfs(int[][] image,int sr,int sc,int color,int oldcolor)
    {
       if(sr>=0&&sc<image[0].length&&sc>=0&&sr<image.length&&image[sr][sc]==oldcolor)
        {
            image[sr][sc]=color;
            dfs(image, sr+1, sc, color, oldcolor);
            dfs(image, sr-1, sc, color, oldcolor);
            dfs(image, sr, sc+1, color, oldcolor);
            dfs(image, sr, sc-1, color, oldcolor);

        }
    }
}
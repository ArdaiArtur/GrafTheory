from typing import List


class Solution(object):
    global ma
    def sol(self,grid:List[List[str]])->int:
        ret=0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j]=='1':
                    ma=0
                    self.dfs(grid,i,j)
                    ret=max(ret,ma)
        return ret            
    
    def dfs(self,grid,i,j):
        if i<0 or j<0 or i>=len(grid) or j>=len(grid[0]) or grid[i][j]!='1':
            return
        grid[i][j]='+'
        ma+=1
        self.dfs(grid,i+1,j)
        self.dfs(grid,i-1,j)
        self.dfs(grid,i,j-1)
        self.dfs(grid,i,j+1)



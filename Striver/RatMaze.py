class Solution:
    def findPath(self, grid):
        #your code goes here
        def safe(i,j,grid,temp):
            if i<0 or j<0 or i>=rows or j>=col:
                return False
            
            if grid[i][j] == 1 and temp[i][j] == 0:
                return True

            return False

        def solve(i,j,grid,res,ans):
            if i == rows-1 and j == col-1:
                res.append(ans)
                return

            temp[i][j] = 1


            if safe(i+1,j,grid,temp):
                solve(i+1,j,grid,res,ans+"D")

            if safe(i,j+1,grid,temp):
                solve(i,j+1,grid,res,ans+"R")

            if safe(i-1,j,grid,temp):
                solve(i-1,j,grid,res,ans+"U")

            if safe(i,j-1,grid,temp):
                solve(i,j-1,grid,res,ans+"L")

            temp[i][j] = 0

        res=[]
        ans=""
        rows=len(grid)
        col=len(grid[0])
        temp= []

        for i in range(rows):
            row = []
            for j in range(col):
                row.append(0)
            temp.append(row)
        if grid[0][0] == 0:
            return -1
        
        solve(0,0,grid,res,"")


        return res


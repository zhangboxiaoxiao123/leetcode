package 岛屿的周长;
//给定一个包含 0 和 1 的二维网格地图，其中 1 表示陆地 0 表示水域。
//网格中的格子水平和垂直方向相连（对角线方向不相连）。整个网格被水完全包围，
//但其中恰好有一个岛屿（或者说，一个或多个表示陆地的格子相连组成的岛屿）。
//岛屿中没有“湖”（“湖” 指水域在岛屿内部且不和岛屿周围的水相连）。
//格子是边长为 1 的正方形。网格为长方形，且宽度和高度均不超过 100 。
//计算这个岛屿的周长。
class Solution {
    public int islandPerimeter(int[][] grid) {
        int x=grid.length;
        int y=grid[0].length;
        int result = 0;
        int count=0;
        int[][] tempgrid=new int[x+2][y+2];
        for(int m=0;m<x;m++)for(int n=0;n<y;n++)tempgrid[m+1][n+1]=grid[m][n];
        for(int m=0;m<tempgrid.length;m++)
         {
       	for(int n=0;n<tempgrid[0].length;n++)
        {
        	if(tempgrid[m][n]==1)
        	{
        		result+=4;
        		if(tempgrid[m-1][n]==1)
        			count-=1;
        		if(tempgrid[m+1][n]==1)
        			count-=1;
        		if(tempgrid[m][n+1]==1)
        			count-=1;
        		if(tempgrid[m][n-1]==1)
        			count-=1;
        	}	
        }}
        return result+count;
    }
}
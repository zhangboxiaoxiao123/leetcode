package ������ܳ�;
//����һ������ 0 �� 1 �Ķ�ά�����ͼ������ 1 ��ʾ½�� 0 ��ʾˮ��
//�����еĸ���ˮƽ�ʹ�ֱ�����������Խ��߷�������������������ˮ��ȫ��Χ��
//������ǡ����һ�����죨����˵��һ��������ʾ½�صĸ���������ɵĵ��죩��
//������û�С������������� ָˮ���ڵ����ڲ��Ҳ��͵�����Χ��ˮ��������
//�����Ǳ߳�Ϊ 1 �������Ρ�����Ϊ�����Σ��ҿ�Ⱥ͸߶Ⱦ������� 100 ��
//�������������ܳ���
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
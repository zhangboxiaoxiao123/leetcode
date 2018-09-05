package 翻转图像;

import java.util.Arrays;

//给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
//
//水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
//
//反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
    int temp;
	for(int x=0;x<A.length;x++)
    {
    	for(int y=0;y<A[x].length/2;y++)
    	{
    		temp=A[x][y];
    		A[x][y]=A[x][A[x].length-y-1];
    		A[x][A[x].length-y-1]=temp;		
    	}System.out.println(Arrays.toString(A[x]));
    }
	for(int x=0;x<A.length;x++)
    {
    	for(int y=0;y<A[x].length;y++)
    	{
    		if(A[x][y]==0) A[x][y]=1;
    		else A[x][y]=0;
    	}
    	System.out.println(Arrays.toString(A[x]));
    }
    return A;
}
}

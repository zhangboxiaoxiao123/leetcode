package ��תͼ��;

import java.util.Arrays;

//����һ�������ƾ��� A����������ˮƽ��תͼ��Ȼ��תͼ�񲢷��ؽ����
//
//ˮƽ��תͼƬ���ǽ�ͼƬ��ÿһ�ж����з�ת�����������磬ˮƽ��ת [1, 1, 0] �Ľ���� [0, 1, 1]��
//
//��תͼƬ����˼��ͼƬ�е� 0 ȫ���� 1 �滻�� 1 ȫ���� 0 �滻�����磬��ת [0, 1, 1] �Ľ���� [1, 0, 0]��
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

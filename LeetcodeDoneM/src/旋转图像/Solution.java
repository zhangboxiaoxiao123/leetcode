package ��תͼ��;
//����һ�� n �� n �Ķ�ά�����ʾһ��ͼ��
//
//��ͼ��˳ʱ����ת 90 �ȡ�
//
//˵����
//
//�������ԭ����תͼ������ζ������Ҫֱ���޸�����Ķ�ά�����벻Ҫʹ����һ����������תͼ��
class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
    	int temp=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[n-j-1][n-i-1];
                matrix[n-j-1][n-i-1]=temp;
            }
        }
        for(int i=0;i<n/2;++i){
            for(int j=0;j<n;++j){
                temp=matrix[i][j];
                matrix[i][j]=matrix[n-i-1][j];
                matrix[n-i-1][j]=temp;
            }
        }

    }
}
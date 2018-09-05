package 旋转图像;
//给定一个 n × n 的二维矩阵表示一个图像。
//
//将图像顺时针旋转 90 度。
//
//说明：
//
//你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
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
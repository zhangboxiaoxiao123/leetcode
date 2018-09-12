package 二维数组中的查找;
//在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
//每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
//判断数组中是否含有该整数。
public class Solution {
    public boolean Find(int target, int [][] array) {
    	int xlength=array.length;
    	int ylength=array[0].length;
    	int[] nums=new int[0];
    	boolean bool1=false,bool2=false;
    	if(xlength<ylength)
    	{
    		nums=new int[xlength];
    		for (int i = 0; i < xlength; i++) {
				if(array[i][0]<=target&&array[i][xlength-1]>=0)	
					{
					nums=array[i];
					bool1=true;
					}
			}
    	}
    	else {
			nums=new int[ylength];
			for (int i = 0; i < array[0].length; i++) {
				if(array[0][i]<=target&&array[ylength-1][i]>=target)
					for (int j = 0; j < nums.length; j++) {
						{
							nums[j]=array[j][i];
							bool1=true;
						}
					}
			}
		}
    	if(bool1)
    	{
    	for (int i = 0; i <nums.length ; i++) {
    		System.out.println(nums[i]);
			if(nums[i]==target)
				bool2=true;
			}
    	}
		return bool1&&bool2;
		}
    public static void main(String[] args) {
		int[][] nums= {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		//int[][] nums= {{1,2,8,9},{4,7,10,13}};
		System.out.println(new Solution().Find(7, nums));
	}
}
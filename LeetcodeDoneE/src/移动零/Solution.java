package �ƶ���;
//����һ������ nums����дһ������������ 0 �ƶ��������ĩβ��ͬʱ���ַ���Ԫ�ص����˳��
class Solution {
    public void moveZeroes(int[] nums) {
    	int x=0;
    	for(int i=0;i<nums.length;i++)
        {
    		if(nums[i]==0)
    		{
        	for(int m=i;m<nums.length-1;m++)
        	{
        		nums[m]=nums[m+1];
        	}
        	nums[nums.length-1]=0;
        	x++;
    		}
        }
    	retry(nums, x);
    }
    public void retry(int[] nums,int x) {
    	for(int i=0;i<nums.length-x;i++)
    	{
    		if(nums[i]==0)
    			moveZeroes(nums);
    	}
		
	}
}
package 移动零;
//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
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
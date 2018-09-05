package 两数之和;
//给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
//
//你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
class Solution {
    public int[] twoSum(int[] nums, int target) {
    	int[] result=new int[2];
    	for(int i=0;i<nums.length-1;i++)
        	for(int index=i+1;index<nums.length;index++)
        		if(nums[i]+nums[index]==target)
        		{
        			result[0]=i;
        			result[1]=index;
        		}
    	return result;
    }
}
package ����֮��;
//����һ�����������һ��Ŀ��ֵ���ҳ������к�ΪĿ��ֵ����������
//
//����Լ���ÿ������ֻ��Ӧһ�ִ𰸣���ͬ����Ԫ�ز��ܱ��ظ����á�
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
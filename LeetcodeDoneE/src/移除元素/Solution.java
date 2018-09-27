package ÒÆ³ıÔªËØ;

class Solution {
	public int removeElement(int[] nums, int val) {
		int index=0,tempindex=0;
		while(tempindex<nums.length)
		{
			if(nums[index]==val)
			{
				while(nums[tempindex]==val)
				{
					tempindex++;
				}
				nums[index]=nums[tempindex];
			}
			else
			{
				index++;
				tempindex++;
			}
		}
		return index;
	}
}

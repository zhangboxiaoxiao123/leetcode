package ��Ч�����εĸ���;

import java.util.Arrays;

//����һ�������Ǹ����������飬���������ͳ�����п�����������������ߵ���Ԫ�������z
class Solution {
    public int triangleNumber(int[] nums) {
        
    	int num=0;
    	if(nums.length<=2) return 0;
        if(nums.length==3)
        {
        	if((nums[0]+nums[1]>nums[2])&&(nums[1]+nums[2]>nums[0])&&(nums[0]+nums[2]>nums[1]))
        		return 1;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
			for (int j = i+1; j < nums.length-1; j++) {
				int a=nums[i]+nums[j];
				for (int j2 = j+1; j2 < nums.length; j2++) {
					if(nums[j2]<a)
							num++;
				}
			}
		}
        return num;
    }
}
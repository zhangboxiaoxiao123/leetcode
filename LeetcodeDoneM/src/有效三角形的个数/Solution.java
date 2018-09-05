package 有效三角形的个数;

import java.util.Arrays;

//给定一个包含非负整数的数组，你的任务是统计其中可以组成三角形三条边的三元组个数。z
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
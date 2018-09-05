package 缺失数字;
//给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
class Solution {
    public int missingNumber(int[] nums) {
        int max=0,temp;
        for (int i = 0; i < nums.length; i++) {
			if(nums[i]>max)
			max=nums[i];
			System.out.println("max:"+max);
		}
        temp=max;
        for (int i = 0; i < nums.length; i++) {
			max+=i;
			max-=nums[i];
		}
        if(temp==max) max++;
        return max;
    }
}
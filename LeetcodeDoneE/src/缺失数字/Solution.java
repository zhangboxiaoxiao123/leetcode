package ȱʧ����;
//����һ������ 0, 1, 2, ..., n �� n ���������У��ҳ� 0 .. n ��û�г����������е��Ǹ�����
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
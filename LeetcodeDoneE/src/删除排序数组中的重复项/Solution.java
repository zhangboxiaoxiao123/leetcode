package ɾ�����������е��ظ���;
//����һ���������飬����Ҫ��ԭ��ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Σ������Ƴ���������³��ȡ�
//
//��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�
class Solution {
    public int removeDuplicates(int[] nums) {
        int index=1;  
        int count=nums.length;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                count--;
            }
            else
            {   
            	nums[index]=nums[i+1];
                index++;
            }
        }
               return count;
    }
}

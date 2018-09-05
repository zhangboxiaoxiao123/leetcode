package 删除排序数组中的重复项;
//给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
//
//不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
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

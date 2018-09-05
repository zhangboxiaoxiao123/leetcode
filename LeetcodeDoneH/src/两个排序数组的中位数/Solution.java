package 两个排序数组的中位数;
import java.util.ArrayList;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
    	int index1=0;
    	int index2=0;
    	int length=nums1.length+nums2.length;
    	ArrayList<Integer> list=new ArrayList<>();
    	for (int i = 0; i < length; i++) {
    		if(index1!=nums1.length&&index2!=nums2.length)
    		{
			if(nums1[index1]<=nums2[index2])
			{
				list.add(nums1[index1]);
				index1++;
			}
			else if(nums1[index1]>nums2[index2])
			{
				list.add(nums2[index2]);
				index2++;
			}
    		}
			else if(index1==nums1.length)
			{
				list.add(nums2[index2]);
				index2++;
			}
			else if(index2==nums2.length)
			{
				list.add(nums1[index1]);
				index1++;
			}
			
		}
    	if(list.size()==1) return(list.get(0));
    	if(list.size()==2) return ((double)list.get(0)+(double)list.get(1))/2;
    	if(list.size()%2==1) return list.get(list.size()/2);
    	else 
    		return ((double)list.get(list.size()/2)+(double)list.get(list.size()/2-1))/2;
    }
}
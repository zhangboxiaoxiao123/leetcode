package 至少是其他数字两倍的最大数;

class Solution {
	public int dominantIndex(int[] nums) {
		int tempmax = 0, max = 0, index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > tempmax) {
				index = i;
				max = tempmax;
				tempmax = nums[i];
			}
		}
		if (max > tempmax * 2)
			return index;
		else
			return -1;
	}
	
    public static void main(String[] args) {
		int[] nums= {0,0,0,0,1};
    	System.out.println(new Solution2().dominantIndex(nums));
	}
}
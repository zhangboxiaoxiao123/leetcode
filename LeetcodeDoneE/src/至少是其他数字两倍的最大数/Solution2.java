package �������������������������;

class Solution2 {
    public int dominantIndex(int[] nums) {
      if(nums.length==1) {
    		return 0;
    	}
        int max=Integer.MIN_VALUE;  //�����
        int second=Integer.MIN_VALUE;//�ڶ������
        int index=0;
        for(int i=0;i<nums.length;i++) {
        	if(nums[i]>max) {
        		max=nums[i];
        		index=i;
        	}
        }
        for(int i:nums) {
        	if(i>second&&i<max) {
        		second=i;
        	}
        }
        if(second*2<=max) {
        	return index;
        }
        
        System.out.println(max+" "+second);
        return -1;
    }
    public static void main(String[] args) {
		int[] nums= {0,0,0,0,1};
    	System.out.println(new Solution2().dominantIndex(nums));
	}
}
package 颜色分类;

//给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
//
//此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
class Solution {
	public void sortColors(int[] nums) {
		int[] num = new int[3];
		for (int i = 0; i < nums.length; i++) {
			switch (nums[i]) {
			case 0:
				num[0]++;
				break;
			case 1:
				num[1]++;
				break;
			case 2:
				num[2]++;
				break;
			default:
				break;
			}
		}
		int index = 0;
		for (int i = 0; i < 3; i++) {
			for (int time = 0; time < num[i]; time++) {
				nums[index] = i;
				index++;
			}
		}
	}

	public static void main(String[] args) {
		int[] nums= {2,0,2,1,1,0};
		new Solution().sortColors(nums);
		for(int i=0;i<nums.length;i++)
		{
			System.out.println(nums[i]);
		}
	}
}
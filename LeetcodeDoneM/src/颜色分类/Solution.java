package ��ɫ����;

//����һ��������ɫ����ɫ����ɫ��һ�� n ��Ԫ�ص����飬ԭ�ض����ǽ�������ʹ����ͬ��ɫ��Ԫ�����ڣ������պ�ɫ����ɫ����ɫ˳�����С�
//
//�����У�����ʹ������ 0�� 1 �� 2 �ֱ��ʾ��ɫ����ɫ����ɫ��
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
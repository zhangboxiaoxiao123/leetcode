package ��λ���;
//����һ���Ǹ����� num������������λ�ϵ�������ӣ�ֱ�����Ϊһλ����
class Solution 
{
	public int[] result=new int[3];
	public static void main(String[] args) {
		System.out.println(new Solution().addDigits(38));
		}
	public int addDigits(int num) 
	{
		result[1]=num%10;
		result[2]=num/10;
		result[0]=result[1]+result[2];
		if(result[0]>9)
			addDigits(result[0]);
		return result[0];
    }	
}
package 各位相加;
//给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
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
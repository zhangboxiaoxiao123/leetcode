package test;
//���� n ���Ǹ����� a1��a2��...��an��ÿ�������������е�һ���� (i, ai) ���������ڻ� n ����ֱ�ߣ���ֱ�� i �������˵�ֱ�Ϊ (i, ai) �� (i, 0)���ҳ����е������ߣ�ʹ�������� x �Ṳͬ���ɵ�����������������ˮ
class Solution {
    public int maxArea(int[] height) {
    	int result=0;
    	int x=0,y=0;
        for (int index = 0; index < height.length-1; index++) 
        {
			for (int i = index+1; i < height.length; i++) 
			{
				if(height[index]<=height[i])
				{
					if((height[index])*(i-index)>result)
						{
						result=(height[index])*(i-index);
						x=height[index];y=height[i];
						}
				}
				else {
					if((height[i])*(i-index)>result)
						{
						result=(height[i])*(i-index);
						x=height[index];y=height[i];
						}
				}
				
			}
		}
        return result;
    }
}

package �Գ���;

import java.util.ArrayList;
import java.util.List;

//�Գ��� ��ָ���Ա���������ÿһλ������������
//
//���磬128 ��һ���Գ�������Ϊ 128 % 1 == 0��128 % 2 == 0��128 % 8 == 0��
//
//���У��Գ������������ 0 ��
//
//�����ϱ߽���±߽����֣����һ���б��б��Ԫ���Ǳ߽磨���߽磩�����е��Գ�����
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
    	a:for (int i = left; i <= right; i++) {
			int num=i;
			while (num>0) {
				int x=num%10;
				System.out.println("x:"+x);
				if(x==0)
					continue a;
				if(i%x!=0)
					continue a;
				num=num/10;
			}
			list.add(i);
		}
        return list;
    }
}

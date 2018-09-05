package 自除数;

import java.util.ArrayList;
import java.util.List;

//自除数 是指可以被它包含的每一位数除尽的数。
//
//例如，128 是一个自除数，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。
//
//还有，自除数不允许包含 0 。
//
//给定上边界和下边界数字，输出一个列表，列表的元素是边界（含边界）内所有的自除数。
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

package 加一;
//给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
//
//最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
//
//你可以假设除了整数 0 之外，这个整数不会以零开头。
public class Solution {
	public int[] plusOne(int[] a) {
		for (int j = a.length - 1; j > -1; j--) {
			if (a[j] < 9) {
				a[j]++;
				break;
			} else {
				a[j] = 0;
			}
		}
		if (a[0] == 0) {
			int[] g = new int[a.length + 1];
			g[0] = 1;
			for (int i = 1; i < g.length; i++) 
			{
				g[i] = 0;
			}
			return g;
		}
		else {
			return a;
		}
    }
}

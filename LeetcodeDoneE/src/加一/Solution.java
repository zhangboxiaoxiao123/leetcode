package ��һ;
//����һ����������ɵķǿ���������ʾ�ķǸ��������ڸ����Ļ����ϼ�һ��
//
//���λ���ִ�����������λ�� ������ÿ��Ԫ��ֻ�洢һ�����֡�
//
//����Լ���������� 0 ֮�⣬��������������㿪ͷ��
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

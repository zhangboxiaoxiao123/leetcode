
public class mySheelSort {
	public void sheelSort(int[] a) {
		int len = a.length;// ���������鳤���ó��������Ч��
		while (len != 0) {
			len = len / 2;
			for (int i = 0; i < len; i++) {// ����
				for (int j = i + len; j < a.length; j += len) {// Ԫ�شӵڶ�����ʼ
					int k = j - len;// kΪ�����������һλ��λ��
					int temp = a[j];// Ҫ�����Ԫ��
					/*
					 * for(;k>=0&&temp<a[k];k-=len){ a[k+len]=a[k]; }
					 */
					while (k >= 0 && temp < a[k]) {// �Ӻ���ǰ����
						a[k + len] = a[k];
						k -= len;// ����ƶ�lenλ
					}
					a[k + len] = temp;
				}
			}
		}
	}
}

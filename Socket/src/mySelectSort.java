
public class mySelectSort {
	public void selectSort(int[] a) {
		int len = a.length;
		for (int i = 0; i < len; i++) {// ѭ������
			int value = a[i];
			int position = i;
			for (int j = i + 1; j < len; j++) {// �ҵ���С��ֵ��λ��
				if (a[j] < value) {
					value = a[j];
					position = j;
				}
			}
			a[position] = a[i];// ���н���
			a[i] = value;
		}
	}
}

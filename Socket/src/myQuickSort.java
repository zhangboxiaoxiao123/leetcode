
public class myQuickSort {
	public void quickSort(int[] a, int start, int end) {
		if (start < end) {
			int baseNum = a[start];// ѡ��׼ֵ
			int midNum;// ��¼�м�ֵ
			int i = start;
			int j = end;
			do {
				while ((a[i] < baseNum) && i < end) {
					i++;
				}
				while ((a[j] > baseNum) && j > start) {
					j--;
				}
				if (i <= j) {
					midNum = a[i];
					a[i] = a[j];
					a[j] = midNum;
					i++;
					j--;
				}
			} while (i <= j);
			if (start < j) {
				quickSort(a, start, j);
			}
			if (end > i) {
				quickSort(a, i, end);
			}
		}
	}
}


public class mySelectSort {
	public void selectSort(int[] a) {
		int len = a.length;
		for (int i = 0; i < len; i++) {// 循环次数
			int value = a[i];
			int position = i;
			for (int j = i + 1; j < len; j++) {// 找到最小的值和位置
				if (a[j] < value) {
					value = a[j];
					position = j;
				}
			}
			a[position] = a[i];// 进行交换
			a[i] = value;
		}
	}
}

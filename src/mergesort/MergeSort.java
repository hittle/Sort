package mergesort;

/**
 * ��Ŀ������MergeSort.java
 * 
 * @author lzl
 *         <p>
 *         �鲢����
 *         <p>
 *         ʱ�临�Ӷȣ�O(N*logN)
 * @date 2021��3��23������10:22:21
 * @version: V1.0
 */
public class MergeSort {

	public static void merge_sort(int[] arr, int first, int last) {
		if (first < last) {
			int mid = (first + last) / 2;
			merge_sort(arr, first, mid);
			merge_sort(arr, mid + 1, last);
			mergeArray(arr, first, mid, last);//�ϲ�������������
		}
	}

	public static void mergeArray(int[] arr, int first, int mid, int end) {
		int i = first;
		int m = mid;
		int j = mid + 1;
		int n = end;
		int k = 0;
		int[] temp = new int[end-first+1];
		while (i <= m && j <= n) {
			if (arr[i] <= arr[j]) {
				temp[k] = arr[i];
				k++;
				i++;
			} else {
				temp[k] = arr[j];
				k++;
				j++;
			}
		}
		while (i <= m) {
			temp[k] = arr[i];
			k++;
			i++;
		}
		while (j <= n) {
			temp[k] = arr[j];
			k++;
			j++;
		}
		for (int ii = 0; ii < k; ii++) {
			arr[first + ii] = temp[ii];
		}
	}
	public static void main(String args[]) {
		int arr[] = {1,3,5,4,7,0,10,6,11};
		merge_sort(arr,0,arr.length-1);
		for(int i = 0; i<arr.length;i++) {
		System.out.print(arr[i]);
		}
	}
}

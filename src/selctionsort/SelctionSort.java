package selctionsort;

/**
 * ��Ŀ������SelctionSort.java
 * @author lzl
 * <p> ѡ������
 * <p> ʱ�临�Ӷȣ�O(n2)
 * @date 2021��3��22������8:19:14
 * @version: V1.0
 */
public class SelctionSort {
	public static void  selectSort(int[] arr) {
		
		for(int i = 0;i<arr.length-1;i++) {
			int min = i;
			//�ҳ�δ������С��
			for(int j = i+1;j<arr.length -1;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			//���ź���ĺ��������λ
			if(min != i) {
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
	}
	public static void main(String args[]) {
		int arr[] = {1,3,5,4,7};
		selectSort(arr);
		for(int i = 0; i<arr.length;i++) {
		System.out.print(arr[i]);
		}
	}
}

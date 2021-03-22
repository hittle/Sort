package selctionsort;

/**
 * 项目描述：SelctionSort.java
 * @author lzl
 * <p> 选择排序
 * <p> 时间复杂度：O(n2)
 * @date 2021年3月22日下午8:19:14
 * @version: V1.0
 */
public class SelctionSort {
	public static void  selectSort(int[] arr) {
		
		for(int i = 0;i<arr.length-1;i++) {
			int min = i;
			//找出未排序处最小的
			for(int j = i+1;j<arr.length -1;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			//和排好序的后面的数换位
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

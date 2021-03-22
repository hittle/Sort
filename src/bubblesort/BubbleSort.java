package bubblesort;

/**
 * 项目描述：BubbleSort.java
 * @author lzl
 * <p>冒泡排序
 * <p>大的往后走
 * <p>时间复杂度O(n2)
 * @date 2021年3月22日下午8:09:02
 * @version: V1.0
 */
public class BubbleSort {

	public static  void bubbleSort(int[] arr) {
		int temp;//临时变量
		for(int i = 0; i<arr.length; i++) {
			for(int j = i; j<arr.length-1;j++) {
				//大的往后走
				//往后一步一步比较
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void main(String args[]) {
		int arr[] = {1,3,5,4,7};
		bubbleSort(arr);
		for(int i = 0; i<arr.length;i++) {
		System.out.print(arr[i]);
		}
	}
}

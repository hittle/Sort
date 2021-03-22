package insertionsort;

/**
 * 项目描述：InsertionSort.java
 * @author lzl
 * <p> 插入排序
 * <p> 时间复杂度：O(n2)
 * @date 2021年3月22日下午9:15:46
 * @version: V1.0
 */
public class InsertionSort {

	public static void insertionSort(int[] arr) {
		int temp;
		for(int i = 0;i<arr.length-1;i++) {
			for(int j = i+1;j>0;j--) {
				
				if(arr[j]<arr[j-1]) {//向前移动
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}else {
					//不需交换
					//跳出当前循环
					break;
				}
			}
		}
	}
	public static void main(String args[]) {
		int arr[] = {1,3,5,4,7,0,10,6};
		insertionSort(arr);
		for(int i = 0; i<arr.length;i++) {
		System.out.print(arr[i]);
		}
	}
}

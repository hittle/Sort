package shellsort;

/**
 * 项目描述：ShellSort.java
 * @author lzl
 * <p> 希尔排序
 * <p> 时间复杂度：O(n1.5)
 * @date 2021年3月23日上午9:19:13
 * @version: V1.0
 */
public class ShellSort {

	public static void shellSort(int[] arr) {
		if(arr==null)return;
		int temp;
		int incre = arr.length;
		while(true) {
			incre = incre/2;
			for(int i=0;i<incre;i++) {
				for(int j=i+incre;j<arr.length;j+=incre) {
					for(int k = j;k>i;k-=incre) {
						if(arr[k]<arr[k-incre]) {
							temp = arr[k-incre];
							arr[k-incre] = arr[k];
							arr[k] = temp;
						}else {
							break;
						}
					}
				}
			}
			if(incre == 1) {
				break;
			}
		}
	}
	public static void main(String args[]) {
		int arr[] = {1,3,5,4,7,0,10,6,11};
		shellSort(arr);
		for(int i = 0; i<arr.length;i++) {
		System.out.print(arr[i]);
		}
	}
}

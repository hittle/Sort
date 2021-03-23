package quicksort;

/**
 * ��Ŀ������QuickSort.java
 * @author lzl
 * <p> ��������
 * <p> ʱ�临�Ӷȣ�O(N*logN)
 * @date 2021��3��23������9:43:28
 * @version: V1.0
 */
public class QuickSort {

	public static void quickSort(int[] arr,int l,int r) {
		if(l >= r)return;
		if(arr == null)return;
		int i = l;
		int j = r;
		int key = arr[l];
		while(i<j) {
			while(i<j && arr[j]>=key) {//�Ӻ���ǰ�ң��ҵ���һ����keyС��
				j--;
			}
			if(i<j) {
				arr[i]=arr[j];
				i++;
			}
			while(i<j && arr[i]<key) {//��ǰ����ң��ҵ���һ����key���
				i++;
			}
			if(i<j) {
				arr[j]=arr[i];
				j--;
			}
		}
		arr[i] = key;
		quickSort(arr, l, i-1);
		quickSort(arr, i+1, r);
	}
	public static void main(String args[]) {
		int arr[] = {1,3,5,4,7,0,10,6,11};
		quickSort(arr,0,arr.length-1);
		for(int i = 0; i<arr.length;i++) {
		System.out.print(arr[i]);
		}
	}
}

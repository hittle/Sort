package insertionsort;

/**
 * ��Ŀ������InsertionSort.java
 * @author lzl
 * <p> ��������
 * <p> ʱ�临�Ӷȣ�O(n2)
 * @date 2021��3��22������9:15:46
 * @version: V1.0
 */
public class InsertionSort {

	public static void insertionSort(int[] arr) {
		int temp;
		for(int i = 0;i<arr.length-1;i++) {
			for(int j = i+1;j>0;j--) {
				
				if(arr[j]<arr[j-1]) {//��ǰ�ƶ�
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}else {
					//���轻��
					//������ǰѭ��
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

package bubblesort;

/**
 * ��Ŀ������BubbleSort.java
 * @author lzl
 * <p>ð������
 * <p>���������
 * <p>ʱ�临�Ӷ�O(n2)
 * @date 2021��3��22������8:09:02
 * @version: V1.0
 */
public class BubbleSort {

	public static  void bubbleSort(int[] arr) {
		int temp;//��ʱ����
		for(int i = 0; i<arr.length; i++) {
			for(int j = i; j<arr.length-1;j++) {
				//���������
				//����һ��һ���Ƚ�
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

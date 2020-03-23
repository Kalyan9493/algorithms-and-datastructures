package sortingAlgorithms;

public class BubbleSort {
	
	public static int[] bubbleSort(int [] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					arr[i]=arr[i]+arr[j]-(arr[j]=arr[i]);
				}
			}
		}
		return arr;
		
	}
	public static void main(String[] args) {
		int[] arr= {5,3,2,2,1};
		int[] arr1=bubbleSort(arr);
		for (int i : arr1) {
			System.out.println(i);
		}
	}

}

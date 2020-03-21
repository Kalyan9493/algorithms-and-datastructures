package searchingAlgorithms;

public class BinarySearch {
	
	
	public boolean binarySearch(int[] arr,int key) {
		int low=0;
		int high=arr.length-1;
		return binarySearchRecursion(arr,low,high,key);
	}

	private boolean binarySearchRecursion(int[] arr, int low, int high, int key) {
		if(low<=high) {
			int mid=(low+high)/2;
			
			
			if(arr[mid]==key) {
				return true;
			}
			else if(key<arr[mid]) {
			return	binarySearchRecursion(arr,low,mid-1,key);
			}
			else {
			return	binarySearchRecursion(arr,mid+1,high,key);
			}
				
		}
		return false;
		
	}
	public static void main(String[] args) {
		int [] arr= {10,15,20,25,30,35,40,45,50,60};
		
		BinarySearch bs=new BinarySearch();
		System.out.println(bs.binarySearch(arr, 70));
	} 

}

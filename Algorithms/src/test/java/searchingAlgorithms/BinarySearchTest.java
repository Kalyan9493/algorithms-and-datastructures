package searchingAlgorithms;

import org.junit.Test;

import junit.framework.Assert;

public class BinarySearchTest {
	int [] arr= {10,15,20,25,30,35,40,45,50,60};
	
	BinarySearch bs=new BinarySearch();
	@Test
	public void binarySearchTest() {
		Assert.assertEquals(true, bs.binarySearch(arr, 10));
		Assert.assertEquals(true, bs.binarySearch(arr, 30));
		Assert.assertEquals(true, bs.binarySearch(arr, 15));
		Assert.assertEquals(false, bs.binarySearch(arr, 70));
		Assert.assertEquals(false, bs.binarySearch(arr, 0));
		Assert.assertEquals(false, bs.binarySearch(arr, 28));
	}

}

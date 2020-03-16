package searchingAlgorithms;

import org.junit.Test;

import junit.framework.Assert;

public class LinearSearchTest {
	
	
	int [] arr= {1,12,13,18,62,25,23};
	LinearSearch ls=new LinearSearch();
	
	@Test
	public void linearSearchTest() {
		Assert.assertEquals(true, ls.linearSearch(arr, 1));
		Assert.assertEquals(true, ls.linearSearch(arr, 18));
		Assert.assertEquals(true, ls.linearSearch(arr, 23));
		Assert.assertEquals(false, ls.linearSearch(arr, 0));
		Assert.assertEquals(false, ls.linearSearch(arr, 50));
	}

}

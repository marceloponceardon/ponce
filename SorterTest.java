import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import junit.framework.TestCase;

public class SorterTest extends TestCase {

	private SorterUtilities utility = new SorterUtilities();
	private Sorter sorter = new Sorter();
	
	public void testQuickSortRandom() {

		int[] arrayToSort = utility.createRandomArray(10);
		long originalCheckSum = utility.checkSum(arrayToSort);
		sorter.doQuickSort(arrayToSort);
		assertEquals(true, utility.verifySort(arrayToSort) );
		long sortedCheckSum = utility.checkSum(arrayToSort);
		assertEquals(originalCheckSum, sortedCheckSum);
		
		arrayToSort = utility.createRandomArray(1000);
		sorter.doQuickSort(arrayToSort);
		assertEquals(true, utility.verifySort(arrayToSort) );		
	}

	public void testQuickSortNearlySorted() {

		int[] arrayToSort = utility.createNearlySortedArray(10);
		sorter.doQuickSort(arrayToSort);
		assertEquals(true, utility.verifySort(arrayToSort) );
		
		arrayToSort = utility.createNearlySortedArray(1000);
		sorter.doQuickSort(arrayToSort);
		assertEquals(true, utility.verifySort(arrayToSort) );		
	}

	public void testQuickSortFewUniqueArray() {

		int[] arrayToSort = utility.createFewUniqueArray(10);
		sorter.doQuickSort(arrayToSort);
		assertEquals(true, utility.verifySort(arrayToSort) );
		
		arrayToSort = utility.createFewUniqueArray(1000);
		sorter.doQuickSort(arrayToSort);
		assertEquals(true, utility.verifySort(arrayToSort) );		
	}
	
	public void testQuickSortReverseOrder() {

		int[] arrayToSort = utility.createReverseOrderArray(10);
		long originalCheckSum = utility.checkSum(arrayToSort);
		sorter.doQuickSort(arrayToSort);
		assertEquals(true, utility.verifySort(arrayToSort) );
		long sortedCheckSum = utility.checkSum(arrayToSort);
		assertEquals(originalCheckSum, sortedCheckSum);
		
		arrayToSort = utility.createReverseOrderArray(1000);
		sorter.doQuickSort(arrayToSort);
		assertEquals(true, utility.verifySort(arrayToSort) );		
	}

	public void testMergeSortRandom() {

		int[] arrayToSort = utility.createRandomArray(10);
		sorter.doMergeSort(arrayToSort);
		assertEquals(true, utility.verifySort(arrayToSort) );
		
		arrayToSort = utility.createRandomArray(1000);
		sorter.doMergeSort(arrayToSort);
		assertEquals(true, utility.verifySort(arrayToSort) );		
	}

	public void testMergeSortNearlySorted() {

		int[] arrayToSort = utility.createNearlySortedArray(10);
		sorter.doMergeSort(arrayToSort);
		assertEquals(true, utility.verifySort(arrayToSort) );
		
		arrayToSort = utility.createNearlySortedArray(1000);
		sorter.doMergeSort(arrayToSort);
		assertEquals(true, utility.verifySort(arrayToSort) );		
	}

	public void testMergeSortFewUniqueArray() {

		int[] arrayToSort = utility.createFewUniqueArray(10);
		sorter.doMergeSort(arrayToSort);
		assertEquals(true, utility.verifySort(arrayToSort) );
		
		arrayToSort = utility.createFewUniqueArray(1000);
		sorter.doMergeSort(arrayToSort);
		assertEquals(true, utility.verifySort(arrayToSort) );		
	}
	
	public void testMergeSortReverseOrder() {

		int[] arrayToSort = utility.createReverseOrderArray(10);
		sorter.doMergeSort(arrayToSort);
		assertEquals(true, utility.verifySort(arrayToSort) );
		
		arrayToSort = utility.createReverseOrderArray(1000);
		sorter.doMergeSort(arrayToSort);
		assertEquals(true, utility.verifySort(arrayToSort) );		
	}
	
	public void testReset() {

		int[] arrayToSort = utility.createRandomArray(10);
		sorter.doQuickSort(arrayToSort);
		assertEquals(true, sorter.getReads() > 0);
		assertEquals(true, sorter.getWrites() > 0);
		sorter.reset();
		assertEquals(0, sorter.getReads());
		assertEquals(0, sorter.getWrites());		

		arrayToSort = utility.createRandomArray(10);
		sorter.doMergeSort(arrayToSort);
		assertEquals(true, sorter.getReads() > 0);
		assertEquals(true, sorter.getWrites() > 0);
		sorter.reset();
		assertEquals(0, sorter.getReads());
		assertEquals(0, sorter.getWrites());		

	}
	
		
}

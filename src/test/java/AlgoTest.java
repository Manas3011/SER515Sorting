package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import main.java.Item;
import main.java.SortAlgos;

public class AlgoTest {

	private SortAlgos algo;

	@Before
	public void setUp() throws Exception {
		algo = new SortAlgos();
	}

	@After
	public void tearDown() throws Exception {
		algo = null;
		assertNull(algo);

	}

	// Task 2.2
	// Bubble Sort null elements- EDGE & CONDITION COVERAGE
	@Test(expected = java.lang.NullPointerException.class)
	public void testkNullBubbleSort() {
		algo.bubbleSort(null);
	}

	// Bubble Sort NODE, EDGE, CONDITION COVERAGE Normal Cases
	@Test
	public void testNormalBubbleSort() {
		int[] arr = { 10, 61, 44, 55, 31, 12 };
		Item[] elements = new Item[6];
		for (int index = 0; index < arr.length; index++)
			elements[index] = new Item(arr[index]);

		int[] sortedArray = { 10, 12, 31, 44, 55, 61 };
		Item[] sorted = new Item[6];
		for (int index = 0; index < sortedArray.length; index++)
			sorted[index] = new Item(sortedArray[index]);

		SortAlgos.bubbleSort(elements);
		for (int index = 0; index < elements.length; index++) {
			assertEquals("Testing Bubble Sort for node, edge and condition coverage", elements[index].key,
					sorted[index].key);}
	}

	
	// Selection Sort empty elements EDGE, CONDITION COVERAGE
	@Test(expected = java.lang.NullPointerException.class)
	public void testNullSelectionSort() {
		SortAlgos.selectionSort(null);
	}

	// Selection Sort NODE, EDGE, CONDITION COVERAGE Normal Cases
	@Test
	public void testNormalSelectionSort() {
		int[] arr = { 10, 61, 44, 55, 31, 12  };
		Item[] elements = new Item[6];
		for (int index = 0; index < arr.length; index++)
			elements[index] = new Item(arr[index]);

		int[] sortedArray = { 10, 12, 31, 44, 55, 61 };
		Item[] sorted = new Item[6];
		for (int index = 0; index < sortedArray.length; index++)
			sorted[index] = new Item(sortedArray[index]);

		SortAlgos.selectionSort(elements);
		for (int index = 0; index < elements.length; index++)
			assertEquals("Testing Selection Sort for node, edge and condition coverage", elements[index].key, 
					sorted[index].key);
	}


	// Insertion Sort empty elements EDGE, CONDITION COVERAGE
	@Test(expected = java.lang.NullPointerException.class)
	public void testNullInsertionSort() {
		SortAlgos.insertionSort(null);
	}

	// Insertion Sort NODE, EDGE, CONDITION COVERAGE Normal Cases
	@Test
	public void testNormalInsertionSort() {
		int[] arr = {  10, 61, 44, 55, 31, 12 };
		Item[] elements = new Item[6];
		for (int index = 0; index < arr.length; index++)
			elements[index] = new Item(arr[index]);

		int[] sortedArray = { 10, 12, 31, 44, 55, 61 };
		Item[] sorted = new Item[6];
		for (int index = 0; index < sortedArray.length; index++)
			sorted[index] = new Item(sortedArray[index]);

		SortAlgos.insertionSort(elements);
		for (int index = 0; index < elements.length; index++)
			assertEquals("Testing Insertion Sort for node, edge and condition coverage", elements[index].key, 
					sorted[index].key);
	}
	// Merge Sort empty elements EDGE, CONDITION COVERAGE
	@Test(expected = java.lang.NullPointerException.class)
	public void testNullMergeSort() {
		SortAlgos.mergeSort(null);
	}

	// Merge Sort NODE, EDGE, CONDITION COVERAGE Normal Cases
	@Test
	public void testNormalMergeSort() {
		int[] arr = { 10, 61, 44, 55, 31, 12 };
		Item[] elements = new Item[6];
		for (int index = 0; index < arr.length; index++)
			elements[index] = new Item(arr[index]);

		int[] sortedArray = { 10, 12, 31, 44, 55, 61 };
		Item[] sorted = new Item[6];
		for (int index = 0; index < sortedArray.length; index++)
			sorted[index] = new Item(sortedArray[index]);

		SortAlgos.mergeSort(elements);
		for (int index = 0; index < elements.length; index++)
			assertEquals("Testing Merge Sort for node, edge and condition coverage", elements[index].key, 
					sorted[index].key);
	}

	// Quick Sort empty elements EDGE, CONDITION COVERAGE
	@Test(expected = java.lang.NullPointerException.class)
	public void testNullQuickSort() {
		Item[] emptyelements = null;
		SortAlgos.quickSort(emptyelements);
	}

	// Quick Sort NODE, EDGE, CONDITION COVERAGE Normal Cases
	@Test
	public void testNormalQuickSort() {
		int[] arr = {  10, 61, 44, 55, 31, 12 };
		Item[] elements = new Item[6];
		for (int index = 0; index < arr.length; index++)
			elements[index] = new Item(arr[index]);

		int[] sortedArray = { 10, 12, 31, 44, 55, 61  };
		Item[] sorted = new Item[6];
		for (int index = 0; index < sortedArray.length; index++)
			sorted[index] = new Item(sortedArray[index]);

		SortAlgos.quickSort(elements);
		for (int index = 0; index < elements.length; index++)
			assertEquals("Testing Quick Sort for node, edge and condition coverage", elements[index].key, 
					sorted[index].key);
	}
	// Heap Sort empty elements EDGE, CONDITION COVERAGE
	@Test(expected = java.lang.NullPointerException.class)
	public void testNullHeapSort() {
		Item[] emptyelements = null;
		SortAlgos.heapSort(emptyelements);
	}

	// Heap Sort NODE, EDGE, CONDITION COVERAGE Normal Cases
	@Test
	public void testHeapSort() {
		int[] arr = { 10, 61, 44, 55, 31, 12 };
		Item[] elements = new Item[6];
		for (int i = 0; i < arr.length; i++)
			elements[i] = new Item(arr[i]);

		int[] sortedArray = { 10, 12, 31, 44, 55, 61 };
		Item[] sorted = new Item[6];
		for (int index = 0; index < sortedArray.length; index++)
			sorted[index] = new Item(sortedArray[index]);

		SortAlgos.heapSort(elements);
		for (int index = 0; index < elements.length; index++)
			assertEquals("Testing Heap Sort for node, edge and condition coverage", elements[index].key, 
					sorted[index].key);
	}
	
}

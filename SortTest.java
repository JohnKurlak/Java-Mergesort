import junit.framework.TestCase;

/**
 * This class tests the Sort class.
 * 
 * @author  John Kurlak
 * @version 10.22.2009
 */
public class SortTest extends TestCase
{
	/**
	 * This method tests the mergeSort method with balanced array.
	 */
	public void testMergeSort1()
	{
		Integer[] nums = new Integer[10];
		nums[0] = 4;
		nums[1] = 39;
		nums[2] = 27;
		nums[3] = 17;
		nums[4] = 8;
		nums[5] = 9;
		nums[6] = 46;
		nums[7] = 72;
		nums[8] = 72;
		nums[9] = 21;
		
		Integer[] sorted = new Integer[10];
		sorted[0] = 4;
		sorted[1] = 8;
		sorted[2] = 9;
		sorted[3] = 17;
		sorted[4] = 21;
		sorted[5] = 27;
		sorted[6] = 39;
		sorted[7] = 46;
		sorted[8] = 72;
		sorted[9] = 72;
		
		Sort.mergeSort(nums);
		
		assertEquals(areArraysEqual(nums, sorted), true);
	}
	
	/**
	 * This method tests the mergeSort method with an already sorted array.
	 */
	public void testMergeSort2()
	{
		Integer[] nums = new Integer[10];
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		nums[3] = 4;
		nums[4] = 5;
		nums[5] = 6;
		nums[6] = 7;
		nums[7] = 8;
		nums[8] = 9;
		nums[9] = 10;
		
		Integer[] sorted = new Integer[10];
		sorted[0] = 1;
		sorted[1] = 2;
		sorted[2] = 3;
		sorted[3] = 4;
		sorted[4] = 5;
		sorted[5] = 6;
		sorted[6] = 7;
		sorted[7] = 8;
		sorted[8] = 9;
		sorted[9] = 10;
		
		Sort.mergeSort(nums);
		
		assertEquals(areArraysEqual(nums, sorted), true);
	}
	
	/**
	 * This method tests the mergeSort method with a reverse sorted array.
	 * It is doing the most work.
	 */
	public void testMergeSort3()
	{
		Integer[] nums = new Integer[10];
		nums[0] = 10;
		nums[1] = 9;
		nums[2] = 8;
		nums[3] = 7;
		nums[4] = 6;
		nums[5] = 5;
		nums[6] = 4;
		nums[7] = 3;
		nums[8] = 2;
		nums[9] = 1;
		
		Integer[] sorted = new Integer[10];
		sorted[0] = 1;
		sorted[1] = 2;
		sorted[2] = 3;
		sorted[3] = 4;
		sorted[4] = 5;
		sorted[5] = 6;
		sorted[6] = 7;
		sorted[7] = 8;
		sorted[8] = 9;
		sorted[9] = 10;
		
		Sort.mergeSort(nums);
		
		assertEquals(areArraysEqual(nums, sorted), true);
	}
	
	/**
	 * This method tests the mergeSort method on an array of strings.
	 */
	public void testMergeSort4()
	{
		String[] cheese = new String[10];
		cheese[0] = "a";
		cheese[1] = "b";
		cheese[2] = "c";
		cheese[3] = "e";
		cheese[4] = "z";
		cheese[5] = "Q";
		cheese[6] = "r";
		cheese[7] = "A";
		cheese[8] = "v";
		cheese[9] = "q";
		
		String[] sorted = new String[10];
		sorted[0] = "A";
		sorted[1] = "Q";
		sorted[2] = "a";
		sorted[3] = "b";
		sorted[4] = "c";
		sorted[5] = "e";
		sorted[6] = "q";
		sorted[7] = "r";
		sorted[8] = "v";
		sorted[9] = "z";
		
		Sort.mergeSort(cheese);
		
		assertEquals(areArraysEqual(cheese, sorted), true);
	}
	
	/**
	 * This method provides an easy way to compary the before and after arrays.
	 * 
	 * @param <T>	A generic object that implements the Comparable interface.
	 * @param a		The first array.
	 * @param b		The second array.
	 * @return		Returns true if they are identical.
	 */
	public static <T extends Comparable<? super T>> boolean
	areArraysEqual(T[] a, T[] b)
	{
		for (int i = 0; i < a.length; ++i)
		{
			if (a[i].compareTo(b[i]) != 0)
			{
				return false;
			}
		}
		
		return true;
	}
}

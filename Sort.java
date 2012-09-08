/**
 * This class implements the Merge Sort algorithm.
 * 
 * @author  John Kurlak
 * @version 10.22.2009
 */
public final class Sort
{
	/**
	 * Merge Sort algorithm.
	 * 
	 * @param	<T>	A generic object that implements the Comparable interface.
	 * @param	a	An array of Comparable items.
	*/
	@SuppressWarnings("unchecked")
	public static <T extends Comparable<? super T>> void mergeSort(T[] a)
	{
		T[] tmpArray = (T[]) new Comparable[a.length];
		mergeSort(a, tmpArray, 0, a.length - 1);
	}

	/**
	 * Internal method that makes recursive calls.
	 * 
	 * @param	a			An array of Comparable items.
	 * @param	tmpArray	An array to place the merged result.
	 * @param	left		The left-most index of the subarray.
	 * @param	right		The right-most index of the subarray.
	 */
	private static <T extends Comparable<? super T>> void mergeSort(T[] a,
		T[] tmpArray, int left, int right)
	{
		if (left < right)
		{
			int center = (left + right) / 2;
			
			mergeSort(a, tmpArray, left, center);
			mergeSort(a, tmpArray, center + 1, right);
			merge(a, tmpArray, left, center + 1, right);
		}
	} 

	/**
	 * Internal method that merges two sorted halves of a subarray.
	 * 
	 * @param	a			An array of Comparable items.
	 * @param	tmpArray	An array to place the merged result.
	 * @param	leftPos		The left-most index of the subarray.
	 * @param	rightPos	The index of the start of the second half.
	 * @param	rightEnd	The right-most index of the subarray.
	 */
	private static <T extends Comparable<? super T>> void merge(T[] a,
		T[] tmpArray, int leftPos, int rightPos, int rightEnd)
	{	
		int leftEnd = rightPos - 1;
		int tmpPos = leftPos;
		int numElements = rightEnd - leftPos + 1;

		// Main loop
		while (leftPos <= leftEnd && rightPos <= rightEnd)
		{
			if (a[leftPos].compareTo(a[rightPos]) <= 0)
			{
				tmpArray[tmpPos++] = a[leftPos++];
			}
			else
			{
				tmpArray[tmpPos++] = a[rightPos++];
			}
		}
		
		// Copy rest of left half
		while (leftPos <= leftEnd)
		{
			tmpArray[tmpPos++] = a[leftPos++];
		}
		
		// Copy rest of right half
		while (rightPos <= rightEnd)
		{
			tmpArray[tmpPos++] = a[rightPos++];
		}
			
		// Copy tmpArray back
		for (int i = 0; i < numElements; i++, --rightEnd)
		{
			a[rightEnd] = tmpArray[rightEnd];
		}
	}
}
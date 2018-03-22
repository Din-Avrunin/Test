package zzz;

import java.util.Arrays;


public class QuickSortFirst {
	private static int partition(int[] array, int low, int high){
		int pivot = low++;
		while (low <= high){
			if (array[low] <= array[pivot]) low++;
			else if (array[high] >= array[pivot]) high--;
			else swap(array, low, high);
		}
		swap(array, high, pivot);
		return high;//pivot = high;
	}
	public static void quick_sort(int[] array, int low, int high){
		if (low <= high){
			int pivot = partition(array, low, high);
			quick_sort(array, low, pivot-1);
			quick_sort(array, pivot+1, high);
		}
	}
	public static void quickSort(int[] array){
		// sort
		quick_sort(array, 0, array.length-1);
	}
	//Swap
	public static void swap(int [] array, int i, int j){
		int temp = array[i]; //
		array[i] = array[j];
		array[j] = temp;
	}
	public static void main(String[] args) {
		int[]arr = {7,3,9,5,4,8,1};
		quickSort(arr);
		System.out.println("Quick Sort is sorted? "+MyLibrary.isSorted(arr));
		////////
		int size = 1000;
		System.out.println("size = "+size);
		int [] a = MyLibrary.randomIntegerArray(size);
		int[]b = Arrays.copyOf(a, size);
		long  timeBefore,timeAfter;
		double elapse;
// java sort
		timeBefore = System.currentTimeMillis();
		Arrays.sort(a);
		timeAfter = System.currentTimeMillis();
		elapse = (timeAfter-timeBefore)/1000.0;
		System.out.println("Java Sort time = " + elapse+" seconds, is sorted? "+MyLibrary.isSorted(a));
/// quick sort 
		timeBefore = System.currentTimeMillis();
		quickSort(b);
		timeAfter = System.currentTimeMillis();
		elapse = (timeAfter-timeBefore)/1000.0;
		System.out.println("Quick Sort time = " + elapse+" seconds, is sorted? "+MyLibrary.isSorted(b));
/// quick sort sorted array
/*		timeBefore = System.currentTimeMillis();
		quickSort(b);
		timeAfter = System.currentTimeMillis();
		elapse = (timeAfter-timeBefore)/1000.0;
		System.out.println("Quick Sort (sorted array) time = " + elapse+" seconds, is sorted? "+isSorted(b));
*/	}
}
/*array : {7,3,9,5,4,8,1};
	7, 3, 9, 5, 4, 8, 1, 
	7, 3, 1, 5, 4, 8, 9, 
	4, 3, 1, 5, 7, 8, 9, 
	1, 3, 4, 5, 7, 8, 9, 
	1, 3, 4, 5, 7, 8, 9, 
	1, 3, 4, 5, 7, 8, 9, 
	quickSort time = 0.0 seconds
	Comparisons: 11
	Exchanges:   5
	1, 3, 4, 5, 7, 8, 9, 
	JavaSort time = 0.156 seconds
 */
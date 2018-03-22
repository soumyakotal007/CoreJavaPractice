package com.soumya.util;

public class SortingUtil {
   /**
    * Insertion sorting maintains to part within an Array 1 . Left side Sorted Part and 2. Right side unsorted part.
    * Everytime the intention is that to insert an element from unsorted area to the sorted area than again sort the Sorting Area.
    * @param arr
    */
	public static void insertionSort(int[] arr)
	  {
		  int valueToSort = 0;
	      int j = 0;
		  for(int i = 1 ; i < arr.length ; i++)
		  { 
			j = i;
			valueToSort = arr[j];
			while(j > 0 && arr[j - 1] > valueToSort )
			{
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = valueToSort;
		  }
	  }
	
	public static void bubbleSort(int[] arr)
	{
		int temp = 0;
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = 1 ; j < arr.length - i ; j++ )
			{
				if(arr[j-1] > arr[j])
				{
				 temp = arr[j];
				 arr[j] = arr[j-1];
				 arr[j-1]=temp;
				}
			}
		}
	}
	
	public static void selectionSort(int[] arr)
	{
		int min_idx = 0;
		int temp = 0;
		for(int i = 0 ; i < arr.length - 1 ; i++)
		{
			min_idx = i;
			for(int j = i + 1 ; j < arr.length ; j++ )
			{
				if(arr[j] < arr[min_idx] )
				{
					min_idx = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min_idx];
			arr[min_idx] = temp;	
		}
	}
}

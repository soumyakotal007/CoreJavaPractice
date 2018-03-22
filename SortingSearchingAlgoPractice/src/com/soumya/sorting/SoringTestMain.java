package com.soumya.sorting;

import java.util.Arrays;

import com.soumya.util.SortingUtil;

public class SoringTestMain {
 public static void main(String[] args) {
	int[] unsortedArr = {23 , 44 , 12 , 11 , 56 , 47 , 27 , 88 , 99 , 77 , 67 , 900 , 850 , 800 , 750 , 700 , 650 , 600 , 550 , 500 , 450 , 400 , 350 , 300 , 250 , 200 , 150 , 150 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9};
	System.out.println("Unsorted Array -- ");
	System.out.println(Arrays.toString(unsortedArr));
	
	System.out.println("################################# After insertion sort####################################");
	System.out.println("@SYSTEM TIME-----" + System.currentTimeMillis());
	SortingUtil.selectionSort(unsortedArr);
	System.out.println(Arrays.toString(unsortedArr));
	System.out.println("@SYSTEM TIME-----" + System.currentTimeMillis());
	System.out.println("##########################################################################################");
	
}
 
}

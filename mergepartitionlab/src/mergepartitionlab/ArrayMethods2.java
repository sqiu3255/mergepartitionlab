/*
*  Author: Sophia Qiu
*  Period 2
*  Date Created: 01.17.2018
*  Project Name: Lab 3.1 In Place Sorts
*/

package mergepartitionlab;

import java.util.Arrays;

public class ArrayMethods2 {
	
	public static void main(String[] args)
	{
		// testing arrays
		
		String[] test1 = new String[] {"apple", "cucumber", "microsoft", "zorro"};
		String[] test2 = new String[] {"banana", "cherry", "mahogany", "oreos", "pinata"};
		int[] test3 = new int[] {3, 4, 2, 7, 12, 22, 0, 1};
		
		// Merge Test 
		
		long start = System.nanoTime();
		String[] mergeResult = merge(test1, test2);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Merge test took: " + time + "nanoseconds");
		System.out.println(Arrays.toString(mergeResult)); //Should print the array with all words in alpha order
		
		//Partition Test 
		start = System.nanoTime();
		int pivotFinalPos = partition(test3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Partition test took: " + time + "nanoseconds");
		System.out.println("Final Pivot Position: " + pivotFinalPos);  //Should print 3
		System.out.println(Arrays.toString(test3)); //Should have all elements partitioned around the pivot
		
	}
	
	// swap code 
	
	public static void swapPartition(int[]arr, int a, int b)
	{
		int temp;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	// merge + partition
	
	public static String[] merge(String[] list1, String[] list2)
	{
		String[] finalList = new String[list1.length + list2.length];
		
		while(leftIndex)
		
		return finalList;
	}
	
	
	public static int partition(int[] list)
	{
		int i = list[0];
		int j = list[list.length - 1];
		int pivot = list[0];
		
		while (i <= j);
		{
			while (list[i] < pivot)
			{
				i++;
			}
			
			while (list[j] > pivot)
			{
				j--;
			}
			
			if (list[i] <= list[j])
			{
				swapPartition(list, i, j);
				i++;
				j--;
			}
		}
		
		if (list[0] < j)
		{
			partition(list);
		}
		
		if (list[list.length - 1] > i)
		{
			partition(list);
		}
		
		return 0;
		
	}
	
}

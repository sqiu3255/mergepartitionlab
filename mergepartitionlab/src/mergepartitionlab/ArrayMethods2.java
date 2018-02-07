/*
*  Author: Sophia Qiu
*  Period 2
*  Date Created: 01.17.2018
*  Project Name: Lab 3.1 In Place Sorts
*/

package mergepartitionlab;

public class ArrayMethods2 {
	
	public static void main(String[] args)
	{
		// testing arrays
		
		String[] list1 = new String[] {"boo", "zebra", "foo", "carrot"};
		String[] list2 = new String[] {"rabbit", "car", "monkey", "fly"};
		int[] list = new int[] {4, 7, 1, 1, 9, 2, 5};
		
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
		
	}
	
}

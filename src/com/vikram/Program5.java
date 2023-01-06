package com.vikram;

public class Program5 {
   public static void main(String[] args) {
	   
	   //5. WAP to sort an array using Selection Sort Algorithm.
	   
	   Program5 ob1 = new Program5();
	   
	   int[] arr = {10,8,20,5,16,14,19,12,25};
	   
	   ob1.selectionSort(arr);
	   ob1.printArray(arr);
   }
   

	void selectionSort(int arr[])
	{
		int n = arr.length;

		for (int i = 0; i < n-1; i++)
		{
			int min_idx = i;
			for (int j = i+1; j < n; j++)
				if (arr[j] < arr[min_idx]) {
					min_idx = j;
				}
			
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}
	
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}


}

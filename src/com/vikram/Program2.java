package com.vikram;

public class Program2 {
   public static void main(String[] args) {
	   //2. WAP to sort an array using Quick Sort Algorithm
	   
	   int[] arr= {14,9,7,13,11,16,4,18,10};
	   int leng = arr.length;
	   
	   Program2 ob = new Program2();
	   ob.quickSortRecursion(arr,0,leng-1);
	   ob.printArray(arr);
	   
   }
   
  int partition(int[] arr,int low, int high) {
	   int pivot=arr[(low+high)/2];
	   
	   while(low<=high) {
		   while(arr[low]<pivot) {
			  low++; 
		   }
		   while(arr[high]>pivot) {
			   high--;
		   }
		   if(low<=high) {
			   int temp=arr[low];
			   arr[low] = arr[high];
			   arr[high] = temp;
			   low++;
			   high--;
		   }
	   }
	   return low;
   }
   
   void quickSortRecursion(int[] arr,int low,int high) {
	        int pi=partition(arr,low,high);
	        if(low<pi-1) {
	        	quickSortRecursion(arr,low,pi-1);
	        }
	        if(pi<high) {
	        	quickSortRecursion(arr,pi,high);
	        }
   }
   
 void printArray(int[]arr) {
	   for(int a: arr ) {
		   System.out.print(a+" ");
	   }
   }
}

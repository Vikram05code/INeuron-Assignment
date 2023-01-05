package com.vikram;

public class Program3 {
   public static void main(String[] args) {
	   //3. WAP to sort an array using Bubble Sort Algorithm
	   
	   int[] arr = {12,8,10,15,11,16,5,14,9,17};
	   
	   for(int i=0; i<arr.length; i++) {
		   for(int j=1; j<arr.length-i; j++) {
			   if(arr[j]<arr[j-1]) {
				   int temp=arr[j];
				   arr[j]=arr[j-1];
				   arr[j-1]=temp;
			   }
		   }
		  
	   }
	   for(int a : arr) {
		   System.out.print(a+" ");
	   }
   }
}

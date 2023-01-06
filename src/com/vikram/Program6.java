package com.vikram;

public class Program6 {
   public static void main(String[] args) {
	   
	   //6. WAP to check whether an array is a subset of another array
	   
	   int[] arr1= {10,8,15,12,16,18,13};
	   int[] arr2= {12,16,15,8};
	   
	   int n=arr1.length;
	   int m=arr2.length;
	   
	   if(isSubset(arr1,arr2,m,n)) {
		   System.out.print("arr2[] is subset of arr1[]");
	   }
	   else {
		   System.out.print("arr2[] is not a subset of arr1[]");
	   }
   }
   
   static boolean isSubset(int[] arr1, int[] arr2, int m, int n) {
	   int i=0;
	   int j=0;
	   for(i=0; i<n; i++) {
		   for(j=0; j<m; j++) {
			   if(arr1[i]==arr2[j]) {
				   break;
			   }
			   
			   if(j==m) {
				   return false;
			   }
		   }
		   
	   }
	   return true;
   }
}

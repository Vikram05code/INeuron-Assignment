package com.vikram;

public class Program1 {
  public static void main(String[] args) {
	  
	  //1. WAP to find the duplicates present in an array
	  
	 int[] arr = {15,8,13,15,4,7,8,4};
	 System.out.println("Duplicates presents in Array are :");
	 
	 for(int i=0; i<arr.length; i++) {
		 for(int j=i+1; j<arr.length; j++) {
			 if(arr[i]==arr[j]) {
				 System.out.print(arr[j]+" ");
			 }
		 }
	 }
  }
}

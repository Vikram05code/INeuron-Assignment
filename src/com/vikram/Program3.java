package com.vikram;

//3. WAP to check if “2552” is palindrome or not

public class Program3 {
   public static void main(String[] args) {
	   String str = "2552";
	   String str1 = "";
	   
	   for(int i=str.length()-1; i>=0; i--) {
		   str1 = str1+str.charAt(i);
	   }
	   System.out.println(str1);
	   
	   if(str.equals(str1)){
		  System.out.println(str +" is a palindrome"); 
	   }
	   else {
		   System.out.println(str +" is not a plaindrome");
	   }
   }
}

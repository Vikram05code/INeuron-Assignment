package com.vikram;

//4. WAP to count the number of consonants, vowels, special characters in a String.

public class Program4 {
   public static void main(String[] args) {
	   String str = "Hello, World!";
	   int vowels=0, consonant=0, specialChar=0;
	   for(int i=0; i<str.length(); i++) {
		   char ch = str.charAt(i);
		   if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
			   vowels++;
		   }
		   else if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
			   consonant++;
		   }
		   else {
			   specialChar++;
		   }
	   }
	   System.out.println("Vowels count = "+vowels+", Consonant count = "+consonant+", specialChar count = "+specialChar);
   }
}

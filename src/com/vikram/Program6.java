package com.vikram;

//6. WAP to implement Pangram Checking with least inbuilt methods being used.

public class Program6 {
	
	public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean[] alphabetCheck = new boolean[26];
        int index = 0;
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                index = input.charAt(i) - 'a';
                alphabetCheck[index] = true;
            }
        }
        for (int i = 0; i <= 25; i++) {
            if (alphabetCheck[i] == false) {
                System.out.println("The given string is not a pangram");
                return;
            }
        }
        System.out.println("The given string is a pangram");
    }	
		
}

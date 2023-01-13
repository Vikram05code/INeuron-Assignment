package com.vikram;

//7. WAP to find if String contains all unique characters.

public class Program7 {
    
	public static void main(String[] args) {
        String input = "abcdefghijklmnopqrstuvwxyz";
        boolean[] charCheck = new boolean[256];
        boolean isUnique = true;
        for (int i = 0; i < input.length(); i++) {
            int val = input.charAt(i);
            if (charCheck[val]) {
                isUnique = false;
                break;
            }
            charCheck[val] = true;
        }
        if (isUnique) {
            System.out.println("The given string contains all unique characters");
        } else {
            System.out.println("The given string does not contain all unique characters");
        }
    }
	
}

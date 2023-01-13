package com.vikram;

import java.util.Arrays;

//5. WAP to implement Anagram Checking least inbuilt methods being used.

public class Program5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="silent";
		String s2="listen";
		
		s1=s1.replace(" ", "");
		s2=s2.replace(" ", "");
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("It's Anagram");
		}
		else
		{
			System.out.println("It's not Anagram");
		}
		
		
		
		
	}
}

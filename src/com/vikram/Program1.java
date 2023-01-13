package com.vikram;

//1. WAP to remove Duplicates from a String.(Take any String ex with duplicates character)


public class Program1 { 
	        
	    public static void removeDuplicates(String str)   
	    {   
	        String newstr = new String();   
	      
	        int length = str.length();   
	              
	        for (int i = 0; i < length; i++)    
	        {   
	            char charAtPosition = str.charAt(i);   
	                
	            if (newstr.indexOf(charAtPosition) < 0)   
	            {   
	                newstr += charAtPosition;   
	            }   
	        }   
	        
	        System.out.println(newstr);  
	    }   
	      
	    public static void main(String[] args)   
	    {     
	    	String str = "Hello world";
	        removeDuplicates(str);   
	    }     
    
}

package com.vikram;

//2. WAP to print Duplicates characters from the String.

public class Program2 {
    
	public static void main(String[] args) {  
        String string1 = "Java Development";  
        int count;  
            
        char string2[] = string1.toCharArray();  
          
        System.out.println("Duplicate characters in a given string: ");  
         
        for(int i = 0; i <string2.length; i++) {  
            count = 1;  
            for(int j = i+1; j <string2.length; j++) {  
                if(string2[i] == string2[j] && string2[i] != ' ') {  
                    count++;  
                      
                    string2[j] = '0';  
                }  
            }  
          
            if(count > 1 && string2[i] != '0')  
                System.out.println(string2[i]);  
        }  
    }  
	
}

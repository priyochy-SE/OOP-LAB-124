package com.mycompany.validatepassword_01;

import java.util.Scanner;

public class ValidatePassword_01 
{
    public static int pass_length = 10;
    public static void main(String[] args) 
            
    {
        int letterCount = 0;
        int digitCount = 0;
        int whitespaceCount = 0;
        int special = 0;
        
        Scanner in = new Scanner(System.in);
         
        System.out.print("""
                         1. A password must have at least ten characters.
                         2. A password consists of only letters and digits.
                         3. A password must contain at least two digits. 
                         4. A password must contain a whitespace. 
                         
                         Enter your password (You are agreeing to the above Conditions.) : \n""");
         
        String input = in.nextLine();
        int inputLen = input.length();
         
         //Character:
        for (int i = 0; i < inputLen; i++) 
        {
           char ch = input.charAt(i);
            
           if (Character.isLetter(ch))
                letterCount++;
           else if (Character.isDigit(ch))
                digitCount++;
           else if(Character.isWhitespace(ch))
                whitespaceCount++;
           else if(ch >= 33 && ch <= 46||ch == 64)
                special++;
        }
         
        if (letterCount >= 2 && digitCount >= 2 && whitespaceCount >= 1 && inputLen >= 10 && special ==0)
             System.out.println("\nYour given password is validate.");
         
        else 
             System.out.println("\nYour given password is invalid.");
    }
}

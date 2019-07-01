/*Write a Java method to Reverse the given input & Check if it is a Palindrome.*/

package com.stackroute.junit;

public class Palindrome {
    public static String palindromecheck(String original)//initialized a string for checking palindrome or not
    {
        String reverse = "";
        int length = original.length(); //fnding length of the string
        for ( int i = length - 1; i >= 0; i-- ) //logic for reverse of a string
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse)) //comparing original string and reversed string are equal or not
        {
            return "String is a palindrome"; //if equal returning as palindrome string
        }

        else {
            return "Not a palidrome"; //if not returning as not a palindrome
        }
    }
}



/*Write a Java method to Reverse the given input & Check if it is a Palindrome.*/

package com.stackroute.junit;

public class Palindrome {
    public static String palindromecheck(String original)
    {
        String reverse = "";
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse)){
            return "String is a palindrome";
        }

        else {
            return "Not a palidrome";
        }
    }
}



package com.stackroute.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome palindrome;
    @Before
    public void setUp() {
        System.out.println("Before");


    }
    @After
    public void tearDown(){
        palindrome=null;

    }
    @Test
    public void givenStringShouldReturnPalindrome(){
        //arrange
        Palindrome palindrome=new Palindrome();
        //Act
        String result= palindrome.palindromecheck("abba");
        //Assert
        assertEquals("String is a palindrome",result);
    }
    @Test
    public void givenStringShouldReturnNullString(){
        //arrange
        Palindrome palindrome=new Palindrome();
        //Act
        String result= palindrome.palindromecheck("");
        //Assert
        assertEquals("String is a palindrome",result);
    }
    @Test
    public void givenStringShouldReturnNullPalindromeWithSpaces() {
        //arrange
        Palindrome palindrome = new Palindrome();
        //Act
        String result = palindrome.palindromecheck("ABCD DCBA");
        //Assert
        assertEquals("String is a palindrome", result);

    }
    @Test
    public void givenStringShouldReturnNotaPalindrome() {
        //arrange
        Palindrome palindrome = new Palindrome();
        //Act
        String result = palindrome.palindromecheck("stackroute");
        //Assert
        assertEquals("Not a palidrome", result);

    }

}


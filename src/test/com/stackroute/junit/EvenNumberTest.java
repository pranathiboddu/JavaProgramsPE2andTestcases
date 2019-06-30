package com.stackroute.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class EvenNumberTest {
    EvenNumberCheck evenNumber=new EvenNumberCheck();

    @Before
    public void setUp() {
        System.out.println("Before");


    }

    @After
    public void tearDown() {
        System.out.println("After");
        evenNumber = null;

    }

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("BeforeClass");


    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("AfterClass");


    }

    @Test
    public void givenNumbershouldReturnTrue() {

        //arrange
        EvenNumberCheck evenNumber=new EvenNumberCheck();

        //Act
        boolean result = evenNumber.isEven(64);
        //Assert
        assertEquals(true, result);
    }
    @Test
    public void givenNumbershouldReturnTrueforNegativeNumber() {

        //arrange
        EvenNumberCheck evenNumber=new EvenNumberCheck();

        //Act
        boolean result = evenNumber.isEven(-70);
        //Assert
        assertEquals(true, result);
    }
    @Test
    public void givenNumbershouldReturnFalseForOdd() {

        //arrange
        EvenNumberCheck evenNumber=new EvenNumberCheck();

        //Act
        boolean result = evenNumber.isEven(11);
        //Assert
        assertEquals(false, result);
    }
    @Test
    public void givenNumbershouldReturnTrueForZero() {

        //arrange
        EvenNumberCheck evenNumber=new EvenNumberCheck();

        //Act
        boolean result = evenNumber.isEven(0);
        //Assert
        assertNotEquals(true,result);
    }

}


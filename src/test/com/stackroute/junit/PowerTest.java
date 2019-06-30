package com.stackroute.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class PowerTest {
    PowerofFour power;

    @Before
    public void setUp() {
        System.out.println("Before");


    }

    @After
    public void tearDown() {
        System.out.println("After");
        power = null;

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
        PowerofFour power = new PowerofFour();
        //Act
        boolean result = power.poweroffour(64);
        //Assert
        assertEquals(true, result);
    }
    @Test
    public void givenNumbershouldReturnFalse() {

        //arrange
        PowerofFour power = new PowerofFour();
        //Act
        boolean result = power.poweroffour(14);
        //Assert
        assertEquals(false, result);
    }
    @Test
    public void givenNumbershouldReturnFalseForZero() {

        //arrange
        PowerofFour power = new PowerofFour();
        //Act
        boolean result = power.poweroffour(0);
        //Assert
        assertEquals(false, result);
    }
    @Test
    public void givenNumbershouldReturnFalseForNegativeNumber() {

        //arrange
        PowerofFour power = new PowerofFour();
        //Act
        boolean result = power.poweroffour(-64);
        //Assert
        assertEquals(false, result);
    }


}


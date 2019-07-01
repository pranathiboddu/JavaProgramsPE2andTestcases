package com.stackroute.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class PowerTest {
    PowerofFour power;

    @Before
    public void setUp()
    {

    }

    @After
    public void tearDown() {
        power = null;

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


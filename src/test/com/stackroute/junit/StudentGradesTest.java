package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradesTest {
    StudentGrades studentGrades;

    @Before
    public void setUp() throws Exception {

        studentGrades= new StudentGrades();
    }

    @After
    public void tearDown() throws Exception {
        studentGrades = null;
    }

    @Test
    public void givenNumberShouldReturnGradeswithMinMaxAndAvg()
    {
        int Grades[] = {98,67,99,77};
        String Result = studentGrades.gradeInput(4,Grades);
        assertEquals("The average is 85.25 The minimum is 67 The maximum is 99",Result);
    }

    @Test
    public void givenNumberShouldReturnAvg()
    {
        String Avg = studentGrades.avg(456,4);
        assertEquals("114.0",Avg);
    }

    @Test
    public void givenNumberShouldReturnGradeswithMin()
    {
        int Grades[] = {98,67,99,77};
        int Min = studentGrades.min(Grades,4);
        assertEquals(67,Min);
    }

    @Test
    public void givenNumberShouldReturnGradeswithMax()
    {
        int Grades[] = {98,67,99,77};
        int Max = studentGrades.max(Grades,4);
        assertEquals(99,Max);
    }

    @Test
    public void givenNumberShouldReturnError()
    {
        int Grades[] = {55,99,67,99};
        String Result = studentGrades.gradeInput(99,Grades);
        assertEquals("Wrong Input",Result);
    }

    @Test
    public void givenNumberShouldReturnWithGradesAreWrong()
    {
        int Grades[] = {55,141,67,99};
        String Result = studentGrades.gradeInput(89,Grades);
        assertEquals("Wrong Input",Result);
    }

    @Test
    public void givenNumberShouldReturnStudentInputIsWrong()
    {
        int Grades[] = {55,89,67,99};
        String Result = studentGrades.gradeInput(209,Grades);
        assertEquals("given students input is wrong",Result);
    }

}

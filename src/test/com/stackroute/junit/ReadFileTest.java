package com.stackroute.junit;

import org.junit.*;

import java.io.IOException;

import static org.junit.Assert.*;

public class ReadFileTest {
    ReadFile ob;

    @Before
    public void setUp() throws Exception {
        ob=new ReadFile();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void readFileFromDirectory() throws IOException {
        String result=ob.readFile("/home/pranathi/Desktop/file.txt");
        assertEquals("HI I AM PRANATHI\nTHE LENGTH IS 17",result);


    }
}



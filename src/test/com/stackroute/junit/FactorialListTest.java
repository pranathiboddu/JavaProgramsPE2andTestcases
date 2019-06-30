package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialListTest {

    FactorialList factorial;
    @Before
    public void setUp() throws Exception {
        factorial=new FactorialList();
    }

    @After
    public void tearDown() throws Exception {
        factorial=null;
    }

    @Test
    public void GivenInputShouldReturnlongFactorialCheck() {
        String res=factorial.longFactorial();
        assertEquals("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n",res);
    }
    @Test
    public void GivenInputShouldReturnintFactorialCheck() {
        String res=factorial.intFactorial();
        assertEquals("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n",res);
    }
}
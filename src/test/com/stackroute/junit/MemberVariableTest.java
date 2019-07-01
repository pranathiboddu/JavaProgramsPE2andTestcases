package com.stackroute.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class MemberVariableTest {
    MemberVariable membervariable;

    @Before
    public void setUp() throws Exception {
        membervariable=new MemberVariable();
    }

    @After
    public void tearDown() throws Exception {
        membervariable=null;
    }

    @Test
    public void givenInputShouldReturnsetDetailsOfMembers() {
        String result=membervariable.set("Pranathi",21,27000.00);
        assertEquals("Members Name: Pranathi\nMembers Age: 21\nMembers Salary: 27000.0\n",result);

    }
    @Test
    public void givenInputShouldReturnsetDetailsOfMember2() {
        String result2=membervariable.set("Harry",30,2500.03);
        assertEquals("Members Name: Harry\nMembers Age: 30\nMembers Salary: 2500.03\n",result2);

    }

}
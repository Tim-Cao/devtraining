package com.liferay.examples;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyFirstTest {

    @Test
    public void testConvertIntegerToInt() {
        Integer integer = new Integer("5");

        assertEquals("intValue returns int 5", 5, integer.intValue());
    }

    @Test
    public void testTwoPlusTwo() {
        int answer = 2 + 2;

        assertEquals("2+2=4", 4, answer);
    }

}
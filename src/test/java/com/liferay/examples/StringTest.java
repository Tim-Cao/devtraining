package com.liferay.examples;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * In this test class you will learn how to manipulate strings with StringBuilder.
 */
public class StringTest {

    @Test
    public void testBuildString() {
        StringBuilder sb = new StringBuilder();
        sb.append("> ");
        sb.append(1);
        sb.append(" + ");
        sb.append(2);
        char[] ca = {' ', '=', ' ', '3'};
        sb.append(ca);

        assertEquals("> 1 + 2 = 3", sb.toString());
    }

}
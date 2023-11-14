package com.liferay.examples;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConditionTest {

    @Test
    public void testAssertURLPattern() {
        String url = "http://www.liferay.com";

        assertTrue(url.startsWith("http://"));
    }

}
package com.liferay.examples;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * In this test class you will learn how to use the assertTrue.
 */
public class ConditionTest {

    @Test
    public void testAssertURLPattern() {
        String url = "http://www.liferay.com";

        assertTrue(url.startsWith("http://"));
    }

}
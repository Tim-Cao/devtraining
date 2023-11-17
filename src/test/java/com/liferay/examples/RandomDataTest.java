package com.liferay.examples;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * In this test class you will learn how to generate a random string with RandomStringUtils.
 */
public class RandomDataTest {

    @Test
    public void testGenerateRandomPassword() {
        String password = RandomStringUtils.randomAlphanumeric(10);

        assertEquals(10, password.length());
        assertTrue(password.matches("^[A-Za-z0-9]+$"));
    }

}
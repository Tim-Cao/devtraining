package com.liferay.examples;

import org.junit.Test;
import org.apache.commons.lang3.RandomStringUtils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RandomDataTest {

    @Test
    public void testGenerateRandomPassword() {
        String password = RandomStringUtils.randomAlphanumeric(10);

        assertEquals(10, password.length());
        assertTrue(password.matches("^[A-Za-z0-9]+$"));
    }
}
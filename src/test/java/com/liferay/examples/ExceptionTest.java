package com.liferay.examples;

import com.liferay.model.User;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * In this test class you will learn how to use the @Test(expected = ...) annotation.
 */
public class ExceptionTest {

    @Test(expected = IllegalArgumentException.class)
    public void testAddUserWithInvalidPassword() {
        User user = new User("test@liferay.com", "a");

        assertNull(user);
    }

}
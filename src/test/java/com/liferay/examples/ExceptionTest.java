package com.liferay.examples;

import com.liferay.model.User;
import org.junit.Test;

import static org.junit.Assert.assertNull;

public class ExceptionTest {

    @Test(expected = IllegalArgumentException.class)
    public void testAddUserWithInvalidPassword() {
        User user = new User("test@liferay.com", "a");

        assertNull(user);
    }

}
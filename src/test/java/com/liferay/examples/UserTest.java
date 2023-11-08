package com.liferay.examples;

import com.liferay.model.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void testAddUser() {
        User user = new User("test@liferay.com", "test");

        assertEquals("test@liferay.com", user.getEmailAddress());

        assertEquals("test", user.getPassword());
    }

}

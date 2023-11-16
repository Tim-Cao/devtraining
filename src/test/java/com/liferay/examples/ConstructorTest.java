package com.liferay.examples;

import com.liferay.constants.GroupConstants;
import com.liferay.model.Group;
import com.liferay.model.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorTest {

    @Test
    public void testAddUser() {
        User user = new User("test@liferay.com", "test");

        assertEquals("test@liferay.com", user.getEmailAddress());

        assertEquals("test", user.getPassword());
    }

    @Test
    public void testAddUserToDefaultGroup() {
        User user = new User("test@liferay.com", "test");

        user.addUserGroupUser(GroupConstants.DEFAULT_GROUP_ID);

        assertEquals(GroupConstants.DEFAULT_GROUP_ID, user.getGroupId());
    }

    @Test
    public void testAddUserToGroup() {
        User user = new User("test@liferay.com", "test");

        Group group = new Group("Test Site Name");

        user.addUserGroupUser(group.getGroupId());

        assertEquals(group.getGroupId(), user.getGroupId());
    }

    @Test
    public void testUpdateUser() {
        User user = new User("test@liferay.com", "test");

        user.setEmailAddress("userea@liferay.com");

        user.setPassword("password");

        assertEquals("userea@liferay.com", user.getEmailAddress());

        assertEquals("password", user.getPassword());
    }

}
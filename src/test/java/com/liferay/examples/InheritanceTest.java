package com.liferay.examples;

import com.liferay.model.AdminUser;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * In this test class you will learn how to use the Inheritance class in test method.
 */
public class InheritanceTest {

    @Test
    public void testGetAdminUserPassword() {
        AdminUser adminUser = new AdminUser();

        assertEquals("admin", adminUser.getPassword());
    }

}
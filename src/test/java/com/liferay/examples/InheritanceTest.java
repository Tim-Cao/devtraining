package com.liferay.examples;

import com.liferay.model.AdminUser;
import org.junit.Test;

import static org.junit.Assert.*;

public class InheritanceTest {

    @Test
    public void testGetAdminUserPassword() {
        AdminUser adminUser = new AdminUser();

        assertEquals("admin", adminUser.getPassword());
    }

}
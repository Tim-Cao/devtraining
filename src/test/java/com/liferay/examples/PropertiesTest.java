package com.liferay.examples;

import org.junit.Test;

import java.util.Properties;

import static org.junit.Assert.*;

public class PropertiesTest {

    @Test
    public void testGetProperties() {
        Properties properties = new Properties();
        properties.setProperty("title", "Welcome to Liferay");
        properties.setProperty("viewableBy", "Anyone");

        assertEquals("Welcome to Liferay", properties.getProperty("title"));
        assertEquals("Anyone", properties.getProperty("viewableBy"));
    }

}
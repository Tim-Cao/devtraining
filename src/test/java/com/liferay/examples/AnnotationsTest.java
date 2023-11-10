package com.liferay.examples;

import org.junit.*;

public class AnnotationsTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("Run once, before any @Test methods are run");
    }
    @Before
    public void setUp() {
        System.out.println(" Run before each @Test method");
    }

    @Test
    public void testHelloWorld() {
        System.out.println("Hello World");
    }
    @Test
    public void testWelcomeToLiferay() {
        System.out.println("Welcome to Liferay");
    }

    @Ignore("Prevent a @Test method from running")
    @Test
    public void testIgnoreAnnotation() {
        System.out.println("This test won't run");
    }

    @After
    public void tearDown() {
        System.out.println("Run after each @Test method");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("Run once, after all @Test methods have run");
    }

}

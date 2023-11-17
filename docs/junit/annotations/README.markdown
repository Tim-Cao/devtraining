## JUnit Annotations

1. ***@Test*** - Annotate a method as a JUnit Test

1. ***@Test(expected=...)*** - Expect a specific exception class thrown

    1. If the specific exception is not thrown then the test will fail.

    1. If the specific exception is thrown then the test will pass.

1. ***@Rule*** - For ExpectedException to check for exceptions

1. ***@BeforeClass*** - Run once, before any ***@Test*** methods are run

1. ***@AfterClass*** - Run once, after all ***@Test*** methods have run

1. ***@Before*** - Run before each ***@Test*** method

1. ***@After*** - Run after each ***@Test*** method

1. ***@Ignore*** - Prevent a ***@Test*** method from running
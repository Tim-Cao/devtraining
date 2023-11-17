## JUnit Annotations

1. ***@Test*** - Annotate a method as a JUnit Test

1. ***@Test(expected=...)*** - Expect a specific exception class thrown

    1. If the specific exception is not thrown then the test will fail.

    1. If the specific exception is thrown then the test will pass.

1. ***@BeforeClass*** - Run once, before any ***@Test*** methods are run

1. ***@AfterClass*** - Run once, after all ***@Test*** methods have run

1. ***@Before*** - Run before each ***@Test*** method

1. ***@After*** - Run after each ***@Test*** method

1. ***@Ignore*** - Prevent a ***@Test*** method from running

1. ***@Rule*** - Allow very flexible addition or redefinition of the behavior of each test method in a test class.\
   Testers can reuse or extend one of the provided Rules below, or write their own.

    1. **Timeout Rule** - Apply the same timeout to all test methods in a class:
       ```
       @Rule
       public final TestRule globalTimeout = Timeout.millis(20);

    1. **ExpectedException Rule** - Allow in-test specification of expected exception types and messages:
       ```
       @Rule
       public final ExpectedException thrown = ExpectedException.none();

    1. **TemporaryFolder Rule** - Allow creation of files and folders that are deleted when the test method finishes\
       (whether it passes or fails). By default, no exception is thrown if resources cannot be deleted:
       ```
       @Rule
       public final TemporaryFolder folder = new TemporaryFolder();

    1. **ClassRule** - ***@ClassRule*** affects the operation of a whole class with static fields
        ```
       @ClassRule
       @Rule
       public static TemporaryFolder folder = new TemporaryFolder();

    1. **Custom Rules** - Implement the TestRule interface.

        1. **Custom Rule** - ***TestLogger.java***
           ```
           package org.example.junit;

           import java.util.logging.Logger;

           import org.junit.rules.TestRule;
           import org.junit.runner.Description;
           import org.junit.runners.model.Statement;

           public class TestLogger implements TestRule {
              private Logger logger;

              public Logger getLogger() {
                 return this.logger;
              }

              @Override
              public Statement apply(final Statement base, final Description description) {
                 return new Statement() {
                    @Override
                    public void evaluate() throws Throwable {
                       logger = Logger.getLogger(description.getTestClass().getName() + '.' + description.getDisplayName());
                       base.evaluate();
                    }
                 };
              }
           }

        1. **Custom Rule Usage** - ***MyLoggerTest.java***
            ```
            import java.util.logging.Logger;
   
            import org.example.junit.TestLogger;
            import org.junit.Rule;
            import org.junit.Test;
   
            public class MyLoggerTest {
   
                @Rule
                public final TestLogger logger = new TestLogger();
   
                @Test
                public void checkOutMyLogger() {
                    final Logger log = logger.getLogger();
                    log.warn("Your test is showing!");
                }
            }
## JUnit Test Exercises

Practice makes prefect. We would recommend our QA members to finish the following exercises\
in the [ExercisesTest](../../../src/test/java/com/liferay/exercises) class under `com.liferay.exercises` package.

1. **Exercise: Check for 5 instead of 4**

    1. Modify the assertion of ***MyFirstTest.testTwoPlusTwo*** to make a check for 5\
       as the expected value instead of 4:

        1. Run the method and see what happens.

        1. This will get you used to seeing the result of a failing method.

1. **Exercise: Create an Array of Users**

    1. Create an array containing 3 User objects.

    1. Iterate over the array and assert the name of each User.

1. **Exercise: Create and manipulate a Collection of Users**

    1. Create a Collection of Users

    1. Assert that the `size()==0` and `isEmpty()==true`

    1. Create two User objects

    1. Add the User objects to the collection

    1. Assert that the `size()==2` and `isEmpty()==false`

    1. Create a second collection with two different users

    1. `addAll` the second collection to the first collection

    1. Check that the first collection now contains objects from the second collection

    1. `removeAll` the User objects from the second collection

    1. Clear the first collection

    1. Check the first collection is empty

1. **Exercise: Use a different exception instead of IllegalArgumentException**

    1. Replace IllegalArgumentException of ***ExceptionTest.testAddUserWithInvalidPassword***\
       with NullPointerException. What happens?

1. **Exercise: Create a @Test method which uses all the asserts**

    1. Experiment with the JUnit asserts by creating a @Test annotated method\
       which passes, with all the asserts in [JUnit Annotations](../../../docs/junit/annotations).

1. **Exercise: Create a Properties object**

    1. Creates a Properties object

    1. Add the following “key, value” pairs: name=bob, gender=male, password=paSSw0rd

    1. Assert that the size of the Properties object is 3

    1. Check the “key, value” pairs by iterating over the keys

1. **Exercise: Store and Load a Saved Properties File**

    1. Create a Properties object

    1. Add some “key, value” pairs to the Properties

    1. Store the Properties file in the project root dir

    1. Read the Properties file and assert on the values

    1. Delete the Properties file when you are finished
## Run JUnit test

### Run all the @Test annotated methods in the class

#### Intellij

1. Right-click on the class name in the Project Hierarchy and select:

    1. Run ***MyFirstTest***

1. Click on the class in the Project Hierarchy and press the key combination:

    1. ***ctrl + shift + F10***

1. Right-click on the class name in the code editor and select:

    1. Run ***MyFirstTest***

#### Command Line

1. Run  `./gradlew clean test --tests *MyFirstTest`

### Run a single @Test annotated method in the class

#### Intellij

1. Right-click on the method name in the code editor and select:

    1. Run ***testTwoPlusTwo()***

1. Click on the method name in the code editor and press the key combination:

    1. ***ctrl + shift + F10***

#### Command Line

1. Run  `./gradlew clean test --tests *MyFirstTest.testTwoPlusTwo`
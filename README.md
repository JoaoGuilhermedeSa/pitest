# PiTest Demo Project

This project is a simple Java application that demonstrates the use of mutation testing with Pitest. The project consists of a `Calculator` class with several methods and a corresponding set of JUnit tests.

## About the Project

The `Calculator` class provides the following functionalities:

*   Basic arithmetic operations: `add`, `subtract`, `multiply`, `divide`.
*   A method to check if a number is even: `isEven`.
*   A method to calculate the factorial of a number: `factorial`.
*   A method to find the maximum of two numbers: `max`.
*   A method to check if a number is prime: `isPrime`.

The `isPrime` method has a subtle bug to demonstrate how mutation testing can help in finding such issues.

## Technologies Used

*   [Java](https://www.java.com/)
*   [Maven](https://maven.apache.org/) - Dependency Management
*   [JUnit](https://junit.org/junit4/) - Testing Framework
*   [Pitest](https://pitest.org/) - Mutation Testing Framework

## How to Run

### Prerequisites

*   Java Development Kit (JDK) 11 or higher.
*   Apache Maven.

### Compilation

To compile the project, run the following command from the root directory:

```bash
mvn compile
```

### Running Tests

To run the unit tests, use the following command:

```bash
mvn test
```

### Mutation Testing with Pitest

To run the mutation tests with Pitest, execute the following command:

```bash
mvn org.pitest:pitest-maven:mutationCoverage
```

After the execution, the mutation testing report will be available in the `target/pit-reports` directory. You can open the `index.html` file in your browser to view the report.

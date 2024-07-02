# JUnitTesting

This repository contains code for a basic database connection management system `(DatabaseConnectionManagementSystem)` and a `Pessoa` class representing a person with associated functionalities. 
It also includes unit tests for both classes utilizing the JUnit framework.

## JUnit

JUnit is an open-source Java framework for unit testing. By incorporating JUnit into their workflow, Java programmers can write small, targeted tests that ensure each piece of code functions as intended, ultimately leading to more robust and stable applications.

## Code Structure
The codebase is organized into two packages:

- `main:` This package contains the core functionalities of the application;
- `test:` This package contains unit tests for the classes in the main package:

### Main Package

**Class 01: _DatabaseConnectionManagementSystem.java_**

```java 

package JUnitTesting.lib.src.main;

import java.util.logging.Logger;

```

The first snippet of the code imports the `Logger`, an object that belongs to a logging framework and is used to record messages about the application's activities.
In our case, it is used for logging messages about connection events. 

```java

public class DatabaseConnectionManagementSystem {

    private static final Logger LOGGER = Logger.getLogger(DatabaseConnectionManagementSystem.class.getName());

    public static void startConnection(){
        LOGGER.info("Connection started.");
    }

    public static void endConnection(){
        LOGGER.info("Connection ended.");
    }
    public static void insertUserData(Pessoa pessoa){
        LOGGER.info("Inserted user data.");
    }

    public static void removeUserData(Pessoa pessoa){
        LOGGER.info("Removed user data.");
    }
}

```
The above class handles establishing and closing database connections, along with methods for inserting and removing user data. 
Currently, it uses logging for demonstration purposes. The `getLogger` method retrieves a logger instance associated with the class name.


**Class 02: _Pessoa.java_**

```java 

package JUnitTesting.lib.src.main;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

```

* `java.time.LocalDateTime:` Import used for handling date and time information.
* `java.time.temporal.ChronoUnit:` An enum (enumeration) that represents different units of time.It is used in the `getIdade` method to calculate age.
* `java.util.Objects:` A utility class that provides a collection of static methods for operating on objects. In this case, we use it for object comparison methods.


```java 
public class Pessoa {

    private String nome;

    private LocalDateTime nascimento;

    public Pessoa(String nome, LocalDateTime nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }
```

The code defines a public class named `Pessoa` with private attributes for `nome` (String) and `nascimento` (`LocalDateTime` from java.time). 
The public constructor allows creating new `Pessoa` objects by initializing these attributes with a person's name and date of birth.
   
```java

public int getIdade() {
        return (int) ChronoUnit.YEARS.between(nascimento, LocalDateTime.now());
    }

    public boolean ehMaiorDeIdade() {
        return getIdade() >= 18; 
    }

```    
These methods within the `Pessoa` class calculate a **person's age `(getIdade)`** in years and check if they are an adult `(ehMaiorDeIdade)` based on the stored birth date `(nascimento)`.
    
```java

     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return nome.equals(pessoa.nome) && Objects.equals(nascimento, pessoa.nascimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nascimento);
    }
}

```
The above methods in the `Pessoa` class **override the default behavior** for object comparison `(equals)` and hash code generation `(hashCode)` to ensure two `Pessoa` objects are considered equal only if both their `nome` (name) and `nascimento` (birthday) are equal, and it leverages the `java.util.Objects` class for null-safe comparisons and hash code generation.

### Test Package

**Class 01: _DatabaseConnectionManagementSystemTest.java_**

```java

package JUnitTesting.lib.src.test.java;

import JUnitTesting.lib.src.main.*;
import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

```
The snippet above provides the essential imports to run the test:
`- JUnitTesting.lib.src.main.*:` Imports all classes from the main package.
`- org.junit.jupiter.api.*:` Imports _JUnit annotations_ used for test execution management.
`- java.time.LocalDateTime:` Imports the LocalDateTime class for date and time manipulation.

```java

public class DatabaseConnectionManagementSystemTest {

    @BeforeAll
    static void setupConnection() {
        DatabaseConnectionManagementSystem.startConnection();
    }

    @BeforeEach
    void insertTestData(){
        DatabaseConnectionManagementSystem.insertUserData(new Pessoa("John", LocalDateTime.of(2000,1,1,13,0,53)));
    }

    @AfterEach
    void removeTestData(){
        DatabaseConnectionManagementSystem.removeUserData(new Pessoa("John", LocalDateTime.of(2000,1,1,13,0,53)));
    }
}

```
The `@BeforeAll` annotated static method `setupConnection` is **_executed only once before all test methods_** in the class due to the annotation. This ensures a single database connection is established specifically for the entire test suite, improving efficiency and avoiding redundant connection creation for each test.

The `@BeforeEach` annotation ensures that the `insertTestData` method is **_executed before each individual test_** (`@Test`) within the class. This method simulates adding a sample user to the database using the `DatabaseConnectionManagementSystem.insertUserData` method, providing a clean and consistent test environment for each test case.

The `@AfterEach` annotation in this case ensures that the `removeTestData` method is **_executed after each individual test method_** (`@Test`) finishes running. This method simulates removing the sample user data that was inserted before each test using `@BeforeEach` to help maintain a clean and isolated testing environment.

```java

@Test
void validateReturnData(){
    Assertions.assertTrue(true);
}

@Test
void validateNullData(){
    Assertions.assertNull(null);
}

@AfterAll
static void endConnection(){
    DatabaseConnectionManagementSystem.endConnection();
}
}

```

The `@Test` annotations mark the methods `validateReturnData` and `validateNullData` as test methods. These methods are intended to verify specific functionalities of the code. 

The `@AfterAll` annotated static method `endConnection` is executed **_only once after all test methods_**  in the class.

**Class 02: _PessoaTest.java_**

```java

package JUnitTesting.lib.src.test.java;

import JUnitTesting.lib.src.main.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

```

The snippet above provides the essential imports to run the test:

`- JUnitTesting.lib.src.main.Pessoa:` Imports the class from the main package that is going to be tested.

`- org.junit.jupiter.api.Assertions:` Imports methods for _JUnit tests_ to check if code behaves as expected.

`- org.junit.jupiter.api.Test:`Imports the `@Test` annotation used to mark methods as test cases.

`- java.time.LocalDateTime:` Imports the `LocalDateTime` class for date and time manipulation.


```java

public class PessoaTest {

    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
        Assertions.assertEquals(24, jessica.getIdade());
    }
    
```
The snippet above establishes the `PessoaTest` class, which will contain the tests.

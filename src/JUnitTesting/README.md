# JUnitTesting

This repository contains code for a basic database connection management system `(DatabaseConnectionManagementSystem)` and a `Pessoa` class representing a person with associated functionalities. 
It also includes unit tests for both classes utilizing the JUnit framework.

## JUnit

JUnit is an open-source Java framework for unit testing. By incorporating JUnit into their workflow, Java programmers can write small, targeted tests that ensure each piece of code functions as intended, ultimately leading to more robust and stable applications.

## Code Structure
The codebase is organized into two main packages:

- main: This package contains the core functionalities of the application:
`DatabaseConnectionManagementSystem (main/DatabaseConnectionManagementSystem.java):`


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

```java 

package JUnitTesting.lib.src.main;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

```

* **`java.time.LocalDateTime:`** This import is used for handling date and time information associated with the person's birth date.
java.time.temporal.ChronoUnit: This import provides access to temporal units like years, used in the getIdade method to calculate age.
java.util.Objects: This import is used for object comparison methods like equals and hashCode.

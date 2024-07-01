# Java Utility Library

This repository houses a collection of reusable Java programs designed to streamline development and enhance your existing applications. While not intended as a learning resource, these well-structured programs offer practical solutions for common tasks.

## Key Features:

**`- Production-Ready Code:`** The code prioritizes functionality and avoids extensive documentation, making it ideal for integration into real-world projects.

**`- Modular Design:`** Each program is self-contained and can be incorporated independently, allowing you to choose the specific functionalities you need.

**`- Flexibility and Customization:`** The provided code serves as a solid foundation. You can easily adapt and extend it to suit your specific requirements.

### Programs Included:

- [currencyconverter](https://github.com/amandaestevez/00-JAVA-PROGRAMMING/tree/50cc973b9afe2fe06dac6635bca4bfe2333c9b64/src/currencyconverter): A program that converts dollar amounts to euros based on a user-defined exchange rate.

```

Classes included:

- OldConverter: defines the original functionality for converting USD to GBP.

- CurrencyAdapter: builds upon the existing OldConverter. 
  It takes an instance of the "OldConverter" and utilizes its functionality
  to achieve USD to EUR conversion indirectly.

- Main: the entry point for the program. 
  It interacts with the "OldConverter" (through the adapter) and user input/output. 

```

- [designpatterns:](https://github.com/amandaestevez/00-JAVA-PROGRAMMING/tree/50cc973b9afe2fe06dac6635bca4bfe2333c9b64/src/designpatterns) Practical examples showcasing the `Facade`, `Strategy`, and `Singleton` design patterns implemented in Java. 

```

Packages included:

- Facade: provides a simplified interface for interacting with subsystems.

- Singleton: contains the Singleton Lazy, Eager, and LazyHolder design patterns.

- Strategy: lets you choose an algorithm at runtime by encapsulating different approaches.

```

- [ecommerce:](https://github.com/amandaestevez/00-JAVA-PROGRAMMING/tree/50cc973b9afe2fe06dac6635bca4bfe2333c9b64/src/ecommerce) This program tackles essential aspects of e-commerce.

```

Packages included:

- creatingusercatalog: Let users subscribe to your ecommerce list.

- discountcalculator: Let users choose the discount they prefer.

```

- [javacalculator:](https://github.com/amandaestevez/00-JAVA-PROGRAMMING/tree/29712724f52decd0aafae0fd313d2a290890ca12/src/javacalculator) A program that performs basic arithmetic operations: addition, subtraction, multiplication, and division. This can serve as a building block for more complex calculator applications.

```

Classes included:

- Operation (interface): defines the contract for all mathematical operations.

- AddOperation: implements the 'Operation' interface to perform the addition.

- SubtractOperation: implements the 'Operation' interface to perform the subtraction.

```


- [JUnitTesting:](https://github.com/amandaestevez/00-JAVA-PROGRAMMING/tree/51e11c824903f04cb0028bd322b23ccb6dbb6d0c/src/JUnitTesting) This program demonstrates unit testing using the JUnit framework.

```

Packages included:

- Main: contains the classes "DatabaseConnectionSystem", which has methods to start and end connections, 
  and insert and remove user data, and "Pessoa", simulating  a person with a name and birth date.

- Tests: contains the unit tests with JUnit.

 ```

- [mailsystem:](https://github.com/amandaestevez/00-JAVA-PROGRAMMING/tree/51e11c824903f04cb0028bd322b23ccb6dbb6d0c/src/mailsystem) This program offers functionalities related to user management and simulated interactions with external systems,

```

Packages included:

- cep: contains the "CepApi" class, a Singleton that provides methods to 
  simulate retreiving cities and States based on a postal code.

- crm: contains the "CrmService" class, a Singleton simulating a CRM system. 
 Provides a static method gravarCliente to save customer information 
 (name, CEP, city, state).

- usermanagementsystemwithscanner: This package implements a user management system 
  using a Scanner for user input. It contains the following classes>
  
      - User: defines a simple data structure for a user with an ID and a name.
      
      - UserManager: manages the user data using a static list (users). 
       It utilizes the User class to create and store user objects.
      
      - Main: the entry point for the user management system. 
      It interacts with the UserManager instance to add and list users. 
      It also uses the Scanner class (part of the Java library) for user input.  

- usermanagementwithbufferedreader: This package (optional) implements a 
  similar user management system but uses a BufferedReader for user input.

```

### How to Use:

Each program is a standalone application, ready to be used independently.

1. Clone this repository.

2. Navigate to the directory of the program you want to use (e.g., cd e-commerce).

3. Ensure you have any necessary dependencies installed (refer to the specific program's instructions for details, if applicable).

4. Run the program using the appropriate command (e.g., java Main for some programs, refer to the code for specific instructions).

### Customization and Integration:

These programs are provided as a starting point and can be easily customized to fit your specific needs. Feel free to modify, extend, and integrate them into your existing projects to streamline development and enhance functionality.

- **Disclaimer:** While these programs are functional, you might need to make adjustments to ensure seamless integration into your project's architecture and requirements.

### Contributing

We welcome contributions to this project! Here are some ways you can get involved:

* **Bug Reports:** If you encounter a bug in the code, please open an issue on the repository. Describe the bug in detail and provide any relevant steps to reproduce it.

* **Feature Requests:** If you have an idea for a new feature or program, feel free to open an issue to discuss it. Be sure to explain the functionality you envision and how it would benefit the project.

* **Pull Requests:** If you've made improvements to the code or added a new program, you can submit a pull request. Make sure to follow the coding style and conventions used in the existing codebase.

**Before submitting a pull request:**

* Please ensure your _code is well-formatted_ and documented.

* Consider _adding unit tests_ for any new code you contribute.

* _Open an issue_ to discuss your changes if they are significant.

We appreciate your contributions to this project! 

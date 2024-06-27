# Java Utility Library

This repository houses a collection of reusable Java programs designed to streamline development and enhance your existing applications. While not intended as a learning resource, these well-structured programs offer practical solutions for common tasks.

## Key Features:

**`- Production-Ready Code:`** The code prioritizes functionality and avoids extensive documentation, making it ideal for integration into real-world projects.

**`- Modular Design:`** Each program is self-contained and can be incorporated independently, allowing you to choose the specific functionalities you need.

**`- Flexibility and Customization:`** The provided code serves as a solid foundation. You can easily adapt and extend it to suit your specific requirements.

### Programs Included:

- [currencyconverter](https://github.com/amandaestevez/00-JAVA-PROGRAMMING/tree/50cc973b9afe2fe06dac6635bca4bfe2333c9b64/src/currencyconverter): A program that converts dollar amounts to euros based on a user-defined exchange rate. Integrate this functionality into your applications to provide users with dynamic currency conversion.

```
Classes included:
- OldConverter: defines the original functionality for converting USD to GBP.
- CurrencyAdapter: builds upon the existing OldConverter. It takes an instance of the OldConverter and utilizes its functionality to achieve USD to EUR conversion indirectly.
- Main: the entry point for the program. It interacts with both the OldConverter (through the adapter) and user input/output. 
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
- creatingusercatalog: Manage a comprehensive catalog of users for your e-commerce platform. Create, edit, and store user information efficiently.
- discountcalculator: Implement a discount system tailored to your business needs. This program provides a foundation for calculating discounts based on pre-defined rules (specific implementation details may vary).
```

- javacalculator: A fundamental calculator program that performs basic arithmetic operations: addition, subtraction, multiplication, and division. This can serve as a building block for more complex calculator applications.

- JUnitTesting: This program demonstrates the power of unit testing using the JUnit framework. Leverage this as a template to write unit tests for your own projects, ensuring the reliability and maintainability of your codebase.
- 
- mailsystem: Manage your customer relationships and streamline email communication. This program provides functionalities for capturing and managing CRM data and email addresses.

### How to Use:

Each program is a standalone application, ready to be used independently.

1. Clone this repository.
2. Navigate to the directory of the program you want to use (e.g., cd e-commerce).
3. Ensure you have any necessary dependencies installed (refer to the specific program's instructions for details, if applicable).
4. Run the program using the appropriate command (e.g., java Main for some programs, refer to the code for specific instructions).

### Customization and Integration:

These programs are provided as a starting point and can be easily customized to fit your specific needs. Feel free to modify, extend, and integrate them into your existing projects to streamline development and enhance functionality.

- Disclaimer: While these programs are functional, you might need to make adjustments to ensure seamless integration into your project's architecture and requirements.
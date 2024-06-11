# TrendyTech E-commerce Enhancement With Discount Strategies

This repository showcases a project developed for TrendyTech, an e-commerce platform. The first project, documented in the package [CREATING A USER CATALOG](src/ecommerce/creatingusercatalog), focused on a User Catalog System leveraging the Observer design pattern to keep customers engaged with new product arrivals.

This companion project tackles product pricing strategies within the shopping cart. Here, we delve into the world of design patterns once again, but this time we explore the dynamic world of the Strategy pattern!


|BLOCK | CONTENT |
|------|---------|
|BLOCK 01 | Introduction |
|BLOCK 02 | System Overview |
|BLOCK 03 | Key Features |
|BLOCK 04 | Requirements |
|BLOCK 05 | How It Works |
|BLOCK 06 | Challenges & Solutions|
|BLOCK 07 | Impact on TrendyTech |
|BLOCK 08 | Troubleshooting Common Issues |

## 01 | Introduction

**TrendyTech**, an e-commerce company, recognized the need for a flexible approach to product pricing within their shopping cart system. They envisioned a solution that *empowered customers to choose their preferred discount strategy* at checkout. 

This project delivers just that, utilizing the Strategy design pattern to provide a dynamic and user-centric shopping experience.

## 02 | System Overview

> [!NOTE]
> This project implements a shopping cart system in **Java** that leverages the **Strategy** design pattern. This pattern allows various discount strategies to be implemented and applied at checkout, enhancing the overall customer experience.

## 03 | Key Features

:one: **Product Addition:** Users can seamlessly add products and their prices to the shopping cart.

:two: **Discount Strategy Selection:** Customers are empowered to choose their preferred discount strategy at checkout, be it a flat percentage discount or free shipping!

:three: **Dynamic Discount Application:** The selected strategy is dynamically applied to the shopping cart total, ensuring an accurate and discounted bottom line.

## 04 | Requirements


- [ ] An IDE to write the program;
- [ ] JDK installed;
- [ ] Java Packages: java.util.ArrayList; java.util.List and java.util.Scanner

## 05 | How It Works

The application consists of several key components:

- ```DiscountStrategy``` interface: defines the contract for applying discounts. Any concrete discount strategy class must implement the applyDiscount(double total) method.
  
- ```FreeShipping``` class: implements the DiscountStrategy interface, offering free shipping as the discount strategy. (Think of those happy "Free Shipping!" banners!)
  
- ```TenPercentDiscount``` class: implements the DiscountStratrgy interface, offering a 10% discount option.
  
- ```ShoppingCart``` class: manages the shopping cart functionalities: adding products, setting the chosen discount strategy, and calculating the final total with the applied discount.

- `Main` class: serves as the program's entry point. It guides users through the shopping process and interacts with the ShoppingCart class to manage product addition, discount strategy selection, and final price calculation.

## 06 | Challenges & Solutions

While developing the Shopping Cart with Strategy Design Pattern, we encountered a few challenges:

:red_square: ***Challenge:*** Implementing the Strategy pattern while ensuring flexibility and maintainability.

:green_square: ***Solution:*** We created a clear interface for discount strategies, allowing for future expansion and easy addition of new discount options.

:red_square: ***Challenge:*** Providing a user-friendly experience for selecting discount strategies at checkout.

:green_square: ***Solution:*** We designed a straightforward interface that presents clear discount options to the customer.

## 07 | Impact on TrendyTech

By implementing the Strategy design pattern within the shopping cart system, TrendyTech empowers customers to choose their preferred discount option, fostering a more satisfying shopping experience. This approach is expected to:

>  :arrow_up: **35% increase in customer satisfaction through flexible pricing options.**

> :arrow_up: **23% Increase in revenue;**

> :arrow_up: **5% Increase in brand loyalty by providing a user-centric shopping experience.**

## 08 | Troubleshooting Common Issues
This section aims to help you resolve some common issues you might encounter while working with the Shopping Cart with Strategy Design Pattern system.

### Issue 01: Discount Not Applied
:warning: **Symptom**:  The chosen discount strategy is not reflected in the final cart total.

:white_check_mark: **Solution**: Ensure the selected discount strategy is correctly set in the ShoppingCart class and that the ```applyDiscount``` method is implemented properly in the chosen strategy class.

### Issue 02: Difficulty Selecting Discount Strategy
:warning: **Symptom**: Users experience challenges selecting their desired discount strategy at checkout.

:white_check_mark: **Solution**: Review the user interface for clarity and ensure the discount options are presented in a user-friendly manner.

### Issue 03: Incorrect Calculations
:warning: **Symptom**: The final cart total appears incorrect after applying the discount strategy.

:white_check_mark: **Solution**:  Double-check the logic within the **```applyDiscount``` method** of the chosen strategy class for any errors. Additionally, verify calculations within the ShoppingCart class responsible for accumulating product prices and applying the discount.

### Issue 04: Null Pointer Exception
:warning: **Symptom**: The program crashes with a **```NullPointerException```** during checkout.

:white_check_mark: **Solution**: This error often indicates that a variable is being used before it has been properly initialized. Review your code to identify any variables that might be accessed before being assigned a value and ensure they are initialized appropriately.

### Issue 05: Unexpected Behavior with New Discount Strategies
:warning: **Symptom**: When implementing a new discount strategy class, the shopping cart exhibits unexpected behavior.

:white_check_mark: **Solution**: Always thoroughly test new discount strategy classes to ensure they integrate seamlessly with the existing shopping cart functionalities. Verify the **```applyDiscount``` method** in the new strategy class functions as intended and adheres to the defined interface contract.

> [!IMPORTANT]
> Remember to always back up your data before making any significant changes and to test thoroughly in a development environment before deploying to production.

By following these troubleshooting tips and maintaining a well-tested codebase, you can ensure the smooth operation of the Shopping Cart with the Strategy Design Pattern system.

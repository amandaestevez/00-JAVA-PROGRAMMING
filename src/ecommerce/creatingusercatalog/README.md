# TrendyTech User Catalog System

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

**TrendyTech**, an e-commerce company, recognized the need for a dynamic way to keep its customers engaged with the latest product offerings. They reached out for a custom solution, and the result was the User Catalog System - a Java-based application that implements the Observer design pattern to notify users about new products.

## 02 | System Overview

> [!NOTE]
> The User Catalog System is a sophisticated notification mechanism that allows users to subscribe and receive updates on new product additions. It's built on a robust Observer pattern, ensuring that notifications are both efficient and user-specific.

## 03 | Key Features

- **Observer Pattern**: At the heart of the system lies the Observer pattern, enabling real-time updates and seamless communication between the catalog and its subscribers.
- **User Subscription**: Users can easily subscribe to the catalog, opting in to receive notifications about new products that match their interests.
- **Product Management**: The system provides a simple process for the user to set the notification he wishes to receive.
- **Flexibility**: Users have complete control over their subscription, with the option to unsubscribe at any time.

## 04 | Requirements


- [ ] An IDE to write the program;
- [ ] JDK installed;
- [ ] Java Packages: java.util.ArrayList; java.util.List and java.util.Scanner

## 05 | How It Works

The application consists of several key components:

- ```Observer``` interface: Defines the `update` method that observers must implement.
- ```User``` class: Implements the `Observer` interface and handles the receipt of product notifications.
- `CatalogObservable` interface: Establishes the methods for adding and removing observers, as well as notifying them.
- `Catalog` class: Implements the `CatalogObservable` interface and manages the list of observers and product updates.
- `Main` class: Orchestrates the user interaction with the catalog, handling subscriptions, product additions, and user inputs.

## 06 | Challenges & Solutions

While developing the User Catalog System, we faced several challenges that tested our problem-solving skills and technical expertise. Here’s a brief overview of some of the hurdles we encountered and the strategies we employed to overcome them:

### Technical Challenges

**Observer Pattern Complexity:** Implementing the Observer pattern in a way that ensured thread safety and scalability was initially challenging. We addressed this by employing synchronized blocks and carefully managing the state of objects to prevent race conditions.

**Performance Optimization:** As the number of users and products grew, we noticed a performance bottleneck. To resolve this, we optimized our data structures and implemented lazy loading, significantly reducing the load time and improving the user experience.

### Business Challenges
**Client Requirements Clarification:** At times, there was a gap in communication with the client regarding specific requirements. We overcame this by scheduling regular meetings and creating detailed documentation to ensure alignment with the project goals and expectations.

**Adapting to Changing Market Trends:** The e-commerce market is dynamic, and staying ahead of the curve is essential. We maintained flexibility in our design to accommodate future enhancements without overhauling the core system.

## 07 | Impact on TrendyTech

With the User Catalog System, TrendyTech has seen a remarkable increase in customer engagement. The personalized notifications approach has led to a more informed and satisfied customer base, driving sales and fostering brand loyalty.

> [!NOTE]
>  :arrow_up: **15% increase in customer satisfaction** :arrow_up: **30% Increase in revenue** 

## 08 | Troubleshooting Common Issues
This section aims to help you resolve some common issues you might encounter while working with the User Catalog System.

### Issue 01: Observer Not Receiving Updates
:warning: **Symptom**: A user subscribes to the catalog but does not receive notifications when new products are added.

:white_check_mark: **Solution**: Ensure that the user object is properly registered with the catalog as an observer. Check that the `update` method is correctly implemented and invoked when the catalog's state changes.

### Issue 02: Slow Performance with Large User Base
:warning: **Symptom**: The system experiences slow performance or delays when the number of users is large.

:white_check_mark: **Solution**: Review the system's design for any potential bottlenecks. Consider implementing more efficient data structures, caching mechanisms, or load-balancing strategies.

### Issue 03: Inconsistent State After Product Update
:warning: **Symptom**: After adding a new product, some users see the update while others do not.

:white_check_mark: **Solution**: Verify the synchronization of the methods that modify the catalog's state. Ensure that the state changes are atomic and thread-safe.

### Issue 04: Difficulty in Unsubscribing from Notifications
:warning: **Symptom**: Users find it challenging to unsubscribe from the catalog's notifications.

:white_check_mark: **Solution**: Provide a clear and intuitive option for users to unsubscribe. Check the `removeObserver` method for any logical errors that might prevent a successful subscription.

### Issue 05: User Notified After Unsubscription
:warning: **Symptom**: A user continues receiving notifications after they have unsubscribed from the catalog.

:white_check_mark: **Solution**: This could be due to the user's object not being properly removed from the observer list. Ensure that the `removeObserver` method is correctly implemented and that it removes the user object completely. Also, check if notifications are sent out before the unsubscription process is completed and add checks to prevent this race condition.

> [!IMPORTANT]
> Remember to always back up your data before making any significant changes and to test thoroughly in a development environment before deploying to production.


# 163446-Cat-2
## Project Overview
This project demonstrates key concepts in Java, specifically focusing on encapsulation, method overloading, and polymorphism.

## Key Concepts Explored
### 1. **Encapsulation**
Demonstrated in the Student class by using private attributes with public getters and setters to control access.

### 2. **Method Overloading**
Demonstrated in the MathOperations class by providing multiple multiply() methods with different parameter lists.

### 3. **Polymorphism**
Demonstrated through method overriding in the Animal, Dog, and Cat classes.

## Project Structure

``
Student.java            // Defines a student with encapsulated attributes

MathOperations.java // Defines overloaded methods for multiplication

Animal.java            // Base class defining a generic makeSound() method

Dog.java                // Subclass overriding makeSound()

Cat.java                 // Subclass overriding makeSound()

Main.java               // Main class demonstrating encapsulation, method overloading, and polymorphism
``
## Code Explanation

1. Student.java (Encapsulation)

Defines private attributes name and grade.

Provides getter and setter methods with validation to ensure grade values are between 0-100.

2. MathOperations.java (Method Overloading)

Defines two multiply() methods:

multiply(int a, int b): Multiplies two numbers.

multiply(int a, int b, int c): Multiplies three numbers.

3. Animal.java (Parent Class)

Defines a makeSound() method to be overridden by subclasses.

4. Dog.java (Subclass)

Extends Animal and overrides makeSound() to print "Dog barks: Woof! Woof!"

5. Cat.java (Subclass)

Extends Animal and overrides makeSound() to print "Cat meows: Meow!"

6. Main.java

Demonstrates:

Encapsulation: Creating Student objects and modifying attributes through setters.

Method Overloading: Using MathOperations to multiply numbers.

Polymorphism: Calling overridden methods in Dog and Cat objects.

Uses Scanner for user input to test multiplication methods.

Question 2
Project Overview

This project demonstrates key concepts in Java (OOP), specifically focusing on abstraction and exception handling.

Key Concepts Explored

1. Abstraction

Demonstrated in the Appliance class by defining an abstract method turnOn().

Implemented in the subclasses Fan and TV by providing specific implementations of turnOn().

2. Exception Handling

Demonstrated in DivisionCalculator by handling ArithmeticException when dividing numbers.

Uses try-catch-finally to handle user input and prevent division by zero.

Project Structure

Appliance.java             // Abstract class defining turnOn() method

Fan.java                        // Concrete class extending Appliance and implementing turnOn()

TV.java                          // Concrete class extending Appliance and implementing turnOn()

Main.java                      // Main class demonstrating abstraction with Fan and TV

DivisionCalculator.java  // Class implementing division with exception handling

Code Explanation

1. Appliance.java (Abstract Class)

Defines an abstract class Appliance with an abstract method turnOn().

2. Fan.java (Concrete Subclass)

Extends Appliance and provides an implementation for turnOn().

Prints: "Fan starts rotating".

3. TV.java (Concrete Subclass)

Extends Appliance and provides an implementation for turnOn().

Prints: "TV displays picture and plays sound".

4. Main.java

Demonstrates abstraction by creating Fan and TV objects and calling turnOn().

5. DivisionCalculator.java (Exception Handling)

Accepts two numbers from the user.

Handles ArithmeticException when dividing by zero.

Displays an appropriate error message if division by zero occurs.

Uses finally to ensure resources like Scanner are closed properly.

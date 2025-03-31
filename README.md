# 163446-Cat-2
Project Overview

This project demonstrates key concepts in Java, specifically focusing on encapsulation, method overloading, and polymorphism.

Key Concepts Explored

1. Encapsulation

Demonstrated in the Student class by using private attributes with public getters and setters to control access.

2. Method Overloading

Demonstrated in the MathOperations class by providing multiple multiply() methods with different parameter lists.

3. Polymorphism

Demonstrated through method overriding in the Animal, Dog, and Cat classes.

Project Structure

Student.java            // Defines a student with encapsulated attributes

MathOperations.java // Defines overloaded methods for multiplication

Animal.java            // Base class defining a generic makeSound() method

Dog.java                // Subclass overriding makeSound()

Cat.java                 // Subclass overriding makeSound()

Main.java               // Main class demonstrating encapsulation, method overloading, and polymorphism

Code Explanation

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

# oop-concepts

## Object Oriented Programming Concepts

### 1. Encapsulation
Encapsulation is the mechanism that binds together code and the data it manipulates, and keeps both safe from outside interference and misuse. One way to think about encapsulation is as a protective wrapper that prevents the code and data from being arbitrarily accessed by other code defined outside the wrapper.

### 2. Abstraction
Abstraction is the concept of object-oriented programming that “shows” only essential attributes and “hides” unnecessary information. The main purpose of abstraction is hiding the unnecessary details from the users.

For example, when you make a call to a friend, you only need to know the number to dial and the sequence of buttons to press. You don’t need to know the details of how the call is being made, how the signal is being transferred, or how the voice is being transmitted.

### 3. Inheritance
Inheritance is the mechanism that allows one class to inherit properties and behavior from another class. The class that inherits is called the subclass, and the class that is inherited from is called the superclass. Inheritance is a powerful feature of object-oriented programming that allows you to create a new class based on an existing class.


### 4. Polymorphism
Polymorphism is the ability of an object to take on many forms. The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object. Any Java object that can pass more than one IS-A test is considered to be polymorphic.

An "IS-A test" is a way to determine if an object is an instance of a particular class or interface. This is typically done using the instanceof operator in Java. For example, if you have a class Dog that extends Animal and implements the Pet interface, an instance of Dog can pass both instanceof Animal and instanceof Pet tests. This means the Dog object is polymorphic because it can be treated as both an Animal and a Pet.

### Abstraction vs Interface

| Abstraction | Interface |
| ----------- | --------- |
| Abstraction is a process of hiding the implementation details and showing only functionality to the user. | Interface is a blueprint of a class that have static constants and abstract methods. |
| Abstraction lets you focus on what the object does instead of how it does it. | Interface is used to implement multiple inheritance in Java. |
| Can have concrete methods with implementation.| Cannot have concrete methods with implementation.|
| Methods can have any access modifier.	| Methods are public and abstract by default. |
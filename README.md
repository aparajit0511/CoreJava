Core Java Coding Interview Questions
________________________________________
# 1. Object-Oriented Programming (OOP)
## Question 1: Implement Encapsulation
Design a BankAccount class that follows encapsulation principles, with private fields for account number and balance, and public methods to deposit and withdraw money.
## Question 2: Implement Inheritance and Polymorphism
Create a class hierarchy for Animal with subclasses like Dog and Cat. Override the makeSound() method for different animal sounds.
## Question 3: Implement an Interface	
Define an interface Vehicle with methods start() and stop(), and implement it in Car and Bike classes.
________________________________________
# 2. Exception Handling
## Question 4: Custom Exception
Create a custom exception InsufficientFundsException and throw it when a bank account balance goes below zero.
## Question 5: Try-Catch-Finally Behavior
Write a program to demonstrate how try-catch-finally works when an exception is thrown inside a method.
________________________________________
# 3. Multithreading & Concurrency
## Question 6: Print Even & Odd Numbers Using Two Threads
Create two threads:
•	Thread 1 prints even numbers
•	Thread 2 prints odd numbers
Ensure proper synchronization so numbers are printed in order.
## Question 7: Implement a Thread-safe Singleton
Implement a thread-safe Singleton pattern using Double-Checked Locking.
## Question 8: Producer-Consumer Problem
Use wait() and notify() to implement a Producer-Consumer problem where one thread produces data and another thread consumes it.
## Question 9: Deadlock Scenario
Write a program to create a deadlock and resolve it using proper locking mechanisms.
## Question 10: Callable vs Runnable
Write a program using Callable and Future to execute a thread that returns a computed result.
________________________________________
# 4. Java Collections Framework (JCF)
## Question 11: Remove Duplicates from a List
Write a program to remove duplicates from an ArrayList using a HashSet.
## Question 12: Find First Non-Repeating Character
Given a string, find the first non-repeating character using a LinkedHashMap.
## Question 13: Sort a List of Employees
Create an Employee class with name and salary. Sort a list of employees by salary using Comparable and Comparator.
## Question 14: Implement a LRU Cache
Design an LRU Cache using LinkedHashMap.
## Question 15: Difference Between HashMap and ConcurrentHashMap
Write a program demonstrating concurrent modifications on a HashMap vs ConcurrentHashMap.
________________________________________
# 5. Streams & Functional Programming
## Question 16: Find Sum of Even Numbers in a List
Use Java Streams to filter even numbers and find their sum.
## Question 17: Convert List to Map
Given a List<Employee>, convert it to a Map<Integer, Employee> where the key is the employee ID.
## Question 18: Find Second Highest Number in an Array
Use Java 8 Streams to find the second highest number in an array.
________________________________________
# 6. Memory Management & Garbage Collection
## Question 19: Demonstrate Garbage Collection
Write a program that creates many objects and prints when they are garbage collected using finalize().
## Question 20: OutOfMemoryError Simulation
Write a program that causes OutOfMemoryError by creating too many objects.
________________________________________


README — Java OOP Concepts (Real-Time Banking Example)

This project demonstrates all core Object-Oriented Programming (OOP) concepts in Java using a real-time example:
A Banking System with Savings & Current accounts.

It is designed for beginners and students to understand how real Java projects are structured.

🚀 Concepts Covered
✔ Core OOP Concepts

Class & Object

Encapsulation

Inheritance

Polymorphism

Abstraction

Interface

Abstract Class

✔ Additional Java Essentials

Default & Parameterized Constructors

Method Overloading / Overriding

super & this keyword

static keyword

static block

Inner Classes

Interface Default Methods

Project Structure

src/
 ├── Transaction.java
 ├── BankAccount.java
 ├── SavingsAccount.java
 ├── CurrentAccount.java
 └── BankingDemo.java

 
 Description of Each Class
1. Transaction (Interface)

Defines operations every bank account must support:

deposit()

withdraw()

default method: showTransactionLimit()

2. BankAccount (Abstract Class)

Represents a generic bank account with:

Encapsulated fields

Getters/Setters

Abstract method: getInterestRate()

static block for initialization

Inner class: StatementPrinter

3. SavingsAccount (Child Class)

Implements:

Interest rate 4.5%

Minimum balance rules

Calls parent constructor using super

4. CurrentAccount (Child Class)

Implements:

No interest

No overdraft allowed

5. BankingDemo (Main Class)

Demonstrates:

Polymorphism

Interface default method

Inner class usage

static methods

📚 What You Will Learn

By studying this project, you will understand:

🎯 OOP Design

How to design real-life use cases using OOP.

🎯 Encapsulation & Security

Why we keep fields private and use getters.

🎯 Polymorphism

How method overriding enables dynamic behavior.

🎯 Constructors

Difference between default & parameterized constructors.

🎯 static concepts

How static variables, blocks & methods are used in applications.

🎯 Real-world class relations

IS-A & HAS-A relationships.

🖥️ How to Run

Create a Java project (IntelliJ/Eclipse/VS Code).

Add all .java files with the given structure.

Run the BankingDemo class.


Interview Questions Included

This project includes essential interview topics such as:

Abstract class vs Interface

Overloading vs Overriding

Why use super?

What is polymorphism?

Why static block is used?

What is encapsulation?

Can interface have concrete methods?



Java Features You May Add (Optional)

If you want to make this project even more complete for teaching basic Java, you can add:

✔ 1. Method Overloading Example

Same method name, different parameters.

✔ 2. Final keyword

final variables

final methods

final classes

✔ 3. Exception Handling

try

catch

finally

custom exception (e.g., InsufficientBalanceException)

✔ 4. Collections

ArrayList for storing multiple accounts

HashMap for customer → account mapping

✔ 5. Packages

Organize classes into packages:


bank.accounts
bank.transactions
bank.main

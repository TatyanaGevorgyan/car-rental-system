# car-rental-system

A lightweight, console-based Car Rental Management System built using pure Java Core. This project focuses on strong Object-Oriented Programming  principles, clean software architecture, and Java 8+ features.

## Features
> In-Memory Data Storage: Uses Java Collections (HashMap, List) to manage and persist simulation data.
> Stream API & Lambdas: Leverages modern Java features for filtering and searching available vehicles.
> Custom Business Logic: Validates vehicle availability and automatically calculates total costs based on rental duration.
> Robust Error Handling: Uses core Java exception handling techniques to manage edge cases (e.g., trying to rent an already booked car).

##  Architecture & Design Patterns
The project follows the Model-Service-Repository architectural pattern to ensure loose coupling and separation of concerns:

> Model Layer: Contains pure domain entities (Car, Customer, RentalReceipt) with encapsulated data.
> Repository Layer:Simulates data access operations using a generic In-Memory database pattern.
> Service Layer: Encapsulates the core business logic, isolating rules from data access.

##  Technologies Used
> Language:Java SE (Version 8 or higher)
> Concepts: Object-Oriented Programming (Encapsulation, Polymorphism), Java Collections Framework, Stream API, Optional API.

## How to Run

1. Clone the repository:
   ```bash
   git clone [https://github.com/YOUR_USERNAME/car-rental-system.git](https://github.com/TatyanaGevorgyan/car-rental-system.git)
   cd car-rental-system/src

 2.  Navigate to the source files,compile and run the project
```bash
javac com/carrental/Main.java
java com.carrental.Main

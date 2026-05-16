# 💼 Employee Payroll System

A professional management system built in Java that calculates and manages payroll data for various types of workers. This project demonstrates advanced **Object-Oriented Programming (OOP)** principles, specifically showcasing the use of **Abstraction**, **Inheritance**, and **Polymorphism** to solve real-world architectural problems.

---

## 🚀 Key Features

* **Flexible Architecture:** Utilizes an `abstract class Employee` as a base blueprint, allowing the system to easily scale if new employee types (e.g., Interns, Commission-based) are added in the future.
* **Dynamic Salary Calculations:** Automatically computes wages based on employment type using method overriding:
  * **Full-Time Employees:** Managed via a fixed monthly structure.
  * **Part-Time Employees:** Computed dynamically using an `hourly rate × hours worked` formula.
* **Database Operations:** Implements core business logic through a central `PayrollSystem` class capable of:
  * Dynamically adding new records.
  * Removing employees instantly using their unique ID.
  * Displaying formatted employee rosters and real-time salary details.

---

## 🛠️ Concepts Demonstrated

* **Abstraction:** The core `Employee` class cannot be instantiated directly, protecting the architecture and forcing specific sub-class implementations.
* **Inheritance (`extends`):** Shared traits like `name` and `id` are inherited from the parent class, drastically reducing code redundancy.
* **Polymorphism:** The system handles an array/list of generic `Employee` references but executes the correct, specific `calculateSalary()` math at runtime depending on the object type.
* **Encapsulation:** All internal attributes (`name`, `id`, `salary`) are kept `private` and accessed securely using public getters.

---

## 📂 Project Architecture

* `Employee.java` — The abstract base class defining core worker attributes.
* `FullTimeEmployee.java` — Extends Employee; implements fixed monthly salary logic.
* `PartTimeEmployee.java` — Extends Employee; implements hourly wage calculation.
* `PayrollSystem.java` — The engine that stores and manages employee collections.
* `EmployeePayrollSystem.java` — The main execution driver containing test datasets.

---

## 🎮 How It Runs

1. Open the project in your IDE (IntelliJ, Eclipse, or BlueJ).
2. Execute the `main` method located inside `EmployeePayrollSystem.java`.
3. The terminal will display:
   * The initial loaded data of employees.
   * Dynamic calculations of their respective payroll values.
   * An updated staff listing after an employee removal operation is simulated.

---

## 📜 License
This project is licensed under the **GNU General Public License v3.0**.

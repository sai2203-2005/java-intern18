# Employee Lookup System

A console-based Employee Management and Lookup application built with Java. The system demonstrates object-oriented programming (OOP) principles and efficient in-memory data management using the Java Collections Framework (`HashMap`).

---

## 🚀 Features

- **Add Employee**: Register a new employee with a unique ID, Name, Department, and Salary (includes duplicate ID validation).
- **Search Employee**: Look up employee details instantly using their Employee ID ($O(1)$ average time complexity).
- **Display All Employees**: View a complete list of all registered employees.
- **Remove Employee**: Delete an employee record by their ID.
- **Pre-loaded Sample Data**: Comes seeded with initial sample employee records for quick testing.

---

## 🛠️ Technologies Used

- **Language**: Java (JDK 8 or higher)
- **Data Structure**: `java.util.HashMap` for key-value pair mapping (`Employee ID -> Employee`)
- **Input Handling**: `java.util.Scanner` for console user interaction

---

## 📂 Project Structure

```text
├── EmployeeLookup.java   # Contains Employee model and EmployeeLookup main application
├── README.md             # Project documentation
```

---

## ⚙️ Getting Started

### Prerequisites

Make sure you have the Java Development Kit (JDK) installed on your system. You can verify your installation by running:

```bash
java -version
javac -version
```

### Compilation

Compile the Java source file:

```bash
javac EmployeeLookup.java
```

This will generate `EmployeeLookup.class` and `Employee.class`.

### Execution

Run the compiled application:

```bash
java EmployeeLookup
```

---

## 💻 Menu Options & Usage

Upon launch, the application displays an interactive command-line menu:

```text
--- Employee Lookup System ---
1. Add Employee
2. Search Employee
3. Display All Employees
4. Remove Employee
5. Exit
Enter choice:
```

### Pre-loaded Records

| ID | Name | Department | Salary |
| :--- | :--- | :--- | :--- |
| `1001` | Siva | IT | ₹45,000 |
| `1002` | Rahul | HR | ₹40,000 |
| `1003` | Priya | Finance | ₹50,000 |

---

## 🧩 Code Overview

- **`Employee` Class**:
  - Encapsulates employee attributes (`id`, `name`, `department`, `salary`).
  - Includes getter methods and an overridden `toString()` method for clean formatting.
- **`EmployeeLookup` Class**:
  - Houses the `main` method and menu loop.
  - Manages employee records using a `Map<Integer, Employee>` backed by `HashMap`.

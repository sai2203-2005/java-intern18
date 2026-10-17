# 📦 Inventory Management System

A robust, console-based Inventory Management System developed in Java. This application provides an interactive command-line interface to manage product records, track stock quantities, update pricing, and maintain catalog integrity through validation rules.

---

## 🚀 Features

- **➕ Add Product**:
  - Add new products with custom IDs, names, prices, and quantities.
  - Automatically prevents duplicate product IDs.
  - Validates that price and quantity values are non-negative.

- **🗑️ Remove Product**:
  - Delete existing items from the inventory by product ID with real-time confirmation.

- **🔍 Search Product**:
  - Instant lookup of any item by ID with formatted product details.

- **✏️ Update Product**:
  - Update product name, unit price, and available stock.
  - Enforces non-negative value checks on updated values.

- **📋 Display Inventory**:
  - View all registered items presented in a structured tabular format with aligned columns and currency formatting.

---

## 🛠️ Project Structure & Architecture

The project is structured with clean Object-Oriented Programming (OOP) principles in [`Practise.java`](file:///c:/Users/sivas/OneDrive/Desktop/java%20intership/Practise.java):

| Class / Component | Description |
|---|---|
| [`Product`](file:///c:/Users/sivas/OneDrive/Desktop/java%20intership/Practise.java#L4-L44) | Data model encapsulating product attributes (`id`, `name`, `price`, `quantity`), getters, setters, and formatted row display. |
| [`Practise`](file:///c:/Users/sivas/OneDrive/Desktop/java%20intership/Practise.java#L46-L208) | Main application class handling the CLI loop, standard I/O scanner, in-memory `ArrayList` storage, and CRUD operations. |
| [`Practise.findProduct()`](file:///c:/Users/sivas/OneDrive/Desktop/java%20intership/Practise.java#L96-L103) | Helper search method utilizing linear traversal over inventory records. |
| [`Practise.addProduct()`](file:///c:/Users/sivas/OneDrive/Desktop/java%20intership/Practise.java#L105-L132) | Handles product insertion, duplicate ID verification, and boundary validation. |
| [`Practise.removeProduct()`](file:///c:/Users/sivas/OneDrive/Desktop/java%20intership/Practise.java#L134-L146) | Handles product removal by ID. |
| [`Practise.searchProduct()`](file:///c:/Users/sivas/OneDrive/Desktop/java%20intership/Practise.java#L148-L163) | Searches for an item and prints its details in tabular format. |
| [`Practise.updateProduct()`](file:///c:/Users/sivas/OneDrive/Desktop/java%20intership/Practise.java#L165-L194) | Modifies existing product details with validation. |
| [`Practise.displayProducts()`](file:///c:/Users/sivas/OneDrive/Desktop/java%20intership/Practise.java#L196-L207) | Renders all products in a formatted table. |

---

## 📋 Prerequisites

- **Java Development Kit (JDK)**: JDK 8 or higher (JDK 17 or JDK 21 LTS recommended).

To verify your Java installation:
```powershell
javac -version
java -version
```

---

## 💻 How to Compile and Run

### 1. Open Terminal in Project Directory
Navigate to the repository directory:
```powershell
cd "c:\Users\sivas\OneDrive\Desktop\java intership"
```

### 2. Compile the Java Source File
```powershell
javac Practise.java
```

### 3. Run the Application
```powershell
java Practise
```

---

## 🎮 Interactive Menu & Usage

When launched, the program displays an interactive menu:

```text
===== INVENTORY MANAGEMENT =====
1. Add Product
2. Remove Product
3. Search Product
4. Update Product
5. Display All Products
6. Exit
Enter your choice: 
```

### Sample Session

#### 1. Adding a Product
```text
Enter your choice: 1
Enter product ID: 101
Enter product name: Wireless Mouse
Enter price: 29.99
Enter quantity: 50
Product added successfully!
```

#### 2. Displaying Products
```text
Enter your choice: 5
ID         Name                 Price        Quantity  
----------------------------------------------------
101        Wireless Mouse       29.99        50        
```

#### 3. Searching a Product
```text
Enter your choice: 3
Enter product ID to search: 101

Product found:
ID         Name                 Price        Quantity  
101        Wireless Mouse       29.99        50        
```

---

## 🛡️ Validation Rules

- **Duplicate ID Prevention**: Prevents adding a product if its ID already exists in the catalog.
- **Non-negative Bounds**: Prices and quantities cannot be less than `0`.
- **Existence Checks**: Update, search, and delete operations notify the user gracefully when a product ID is not found.

---

## 📄 License

This project is created for educational and internship training purposes.

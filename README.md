# 🏧 ATM Management System (Java GUI - Single Frame)

This project is a GUI-based ATM Machine Simulation developed using Java Swing.

The entire application runs inside **one single JFrame**.  
There are no multiple windows or extra frames used in this project.

All user interactions (Login and ATM operations) are handled within the same frame.

---

## 📌 Project Overview

The ATM Management System simulates basic banking operations.

When the application starts, the user must:

- Enter User ID
- Enter PIN (Password)
- Select City (ATM Location)

After successful login, the user can perform different ATM operations.

---

## 🔐 Default Account Details

User ID  : user123  
PIN      : 1234  
Initial Balance : ₹10,000  

Available Cities:
- Delhi
- Mumbai
- Bangalore
- Chennai
- Kolkata

These details can be modified inside the code.

---

## 🚀 Features

- Login Authentication
- City Selection
- Deposit Money
- Withdraw Money
- Transfer Money
- Check Balance
- Transaction History
- Exit Option

All features are displayed and controlled inside the same main frame.

---

## 🏗 Project Files

- ATMSystem.java (Main class)
- ATMFrame.java (Only JFrame used in the project)
- UserAccount.java (Account data and logic)

---

## 🧠 How It Works

1. The program starts and shows the login screen.
2. The user enters credentials and selects a city.
3. After successful validation, ATM functions become available.
4. Transactions update the balance.
5. Transaction history stores all operations with city information.
6. The application runs continuously inside one frame until the user exits.

---

## 🛠 Technologies Used

- Java
- Java Swing
- OOP (Object-Oriented Programming)
- ArrayList for transaction storage

---

## ▶ How to Run

Compile:
javac *.java

Run:
java ATMSystem

---

This project is created for learning and academic purposes.

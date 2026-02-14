# 🏧 ATM Management System (Java GUI)

![Java](https://img.shields.io/badge/Java-17+-blue)
![GUI](https://img.shields.io/badge/GUI-Swing-orange)
![Type](https://img.shields.io/badge/Application-Desktop-brightgreen)
![Frame](https://img.shields.io/badge/Design-Single%20JFrame-blueviolet)
![Status](https://img.shields.io/badge/Project-Completed-success)
![License](https://img.shields.io/badge/License-Educational-lightgrey)

---

## 📌 Project Overview

The ATM Management System is a Java-based desktop application developed using Java Swing.
It simulates real-world ATM functionality where a user can log in, select a city, and perform banking operations such as deposit, withdrawal, transfer, balance checking, and viewing transaction history.

The entire application runs inside **one single JFrame**. No multiple frames or extra windows are created. All interactions including login and ATM operations are handled within the same main window.

This project demonstrates:

* Object-Oriented Programming (OOP)
* GUI Development using Swing
* Event-Driven Programming
* Transaction Management
* Balance Validation Logic

---

## 🔐 Default Login Credentials

| Field           | Value   |
| --------------- | ------- |
| User ID         | user123 |
| PIN             | 1234    |
| Initial Balance | ₹10,000 |

### 🏙 Available Cities

* Delhi
* Mumbai
* Bangalore
* Chennai
* Kolkata

> Credentials and balance are hardcoded inside `UserAccount.java` for academic purposes.

---

## 🧩 System Modules

### 1️⃣ Login Module

* Accepts User ID
* Accepts PIN
* Allows City Selection (Dropdown Menu)
* Validates credentials
* Displays error for invalid login
* Redirects to ATM dashboard on success

### 2️⃣ ATM Dashboard Module

After successful login, the user can:

* 💰 Deposit Money
* 💸 Withdraw Money
* 🔁 Transfer Money
* 💳 Check Current Balance
* 📜 View Transaction History
* 🚪 Exit Application

All features operate inside the same JFrame.

---

## 📊 Transaction Management

* Updates account balance after each transaction
* Prevents withdrawal or transfer if balance is insufficient
* Stores transaction type, amount, and selected city
* Saves records using an ArrayList
* Displays complete transaction history on request

---

## 🏗️ Project Architecture

ATMSystem.java
├── ATMFrame (Single JFrame)
├── LoginPanel
├── DashboardPanel
└── UserAccount

---

## 📂 Project Structure

ATM-Management-System/
├── ATMSystem.java
├── ATMFrame.java
├── LoginPanel.java
├── DashboardPanel.java
├── UserAccount.java
└── README.md

---

## 🛠️ Technologies Used

| Technology | Purpose             |
| ---------- | ------------------- |
| Java       | Core Programming    |
| Swing      | GUI Development     |
| AWT        | Event Handling      |
| OOP        | System Structure    |
| ArrayList  | Transaction Storage |

---

## ▶️ How to Run

Step 1: Compile
javac *.java

Step 2: Run
java ATMSystem

---

## 🎯 Concepts Implemented

* Classes & Objects
* Encapsulation
* ActionListener Events
* Swing Components (JFrame, JPanel, JButton, JLabel, JTextField, JPasswordField, JComboBox, JOptionPane)
* Layout Management
* Balance Validation
* Single Frame Application Design

---

## 🔒 System Limitations

* Password stored as plain text (educational use only)
* No database integration
* Single-user simulation
* Data not stored permanently
* Not production-ready

---

## 🚀 Future Enhancements

* MySQL Database Integration
* Multiple User Accounts
* PIN Change Feature
* Date & Time in Transaction History
* Receipt Generation (PDF)
* Admin Panel
* Enhanced UI using JavaFX

---

## 🎓 Academic Use

Suitable for:

* BCA Mini Project
* BSc Computer Science
* Diploma Final Year Project
* Java GUI Assignment
* OOP Lab Project

---

## 👨‍💻 Author

Your Name
Java Developer | Student Project

---

## 📄 License

This project is developed for educational and academic purposes only.

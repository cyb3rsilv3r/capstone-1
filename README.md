<img width="1403" height="1121" alt="image" src="https://github.com/user-attachments/assets/8f57d331-3638-440e-8081-441a1306d722" />

# Silver’s (Definitely Legal) Apothecary of Oddities 🕯️✨

“A ledger… but make it magical.”

A command-line Java application that tracks financial transactions through a themed grimoire-style interface.

---

## ✧ Features

- Add deposits (coffer gains)
- Record payments (emptying coffers)
- View all transactions, deposits, or payments
- Generate reports:
  - Month To Date
  - Previous Month
  - Year To Date
  - Previous Year
  - Search by Vendor

---

## ✧ How to Run

1. Open the project in IntelliJ
2. Run the `HomeScreen` class
3. Follow the prompts in the terminal

---

## ✧ File Format

Each transaction is stored as:

date|time|description|vendor|amount

---

## ✧ Favorite Piece of Code

My favorite part of this project was implementing the transaction input methods (`addDeposit` and `makePayment`).

These methods handle the most interaction and bring together user input, formatting, object creation, and file writing. Watching everything connect and work together smoothly was really satisfying.

I also loved designing the ASCII art interface. It was surprisingly fiddly to format, but it gave the program personality and made it feel like more than just a standard ledger.

---

## ✧ Challenges & Lessons Learned

One of the biggest challenges was working with multiple classes that interact with each other. While separating logic across classes made the code more organized, it also made debugging harder since I had to trace issues through loops and method calls across different files.

Even so, I don’t regret this approach. It helped me better understand how programs are structured and made the project easier to manage overall.

---

## ✧ Future Improvements

- Add a more advanced search system with filters
- Add color to the terminal output
- Expand reporting features for more flexibility

---

## ✧ About

Built as part of a Java capstone project to demonstrate file handling, object-oriented design, and user interaction… with a little personality 🐰✨

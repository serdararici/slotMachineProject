# 🎰 Java Slot Machine

Welcome to **Java Slot Machine**, a console-based game written in Java. The game simulates a simple slot machine experience, where the user places bets and spins to win based on random symbols.

![Slot Machine Game](https://github.com/serdararici/slotMachineProject/blob/main/images/slotMachineProject_home.JPG)

![Slot Machine Game](https://github.com/serdararici/slotMachineProject/blob/main/images/slotMachineProject_final.JPG)

## 🎮 Game Description

- This project is a simple terminal-based **slot machine simulator**.
- It uses **random symbol generation** and **basic betting mechanics**.
- The game continues until the player's balance is depleted or the user chooses to exit.

---

## ✅ Features

- Starting balance of **$100**
- Symbols: 🍒, 🍉, 🍋, 🔔, ⭐
- Randomized symbol generation using `java.util.Random`
- Betting system with payout logic
- Console output for an interactive experience
- Input validation for incorrect bet entries
- Simple and clean code structure

---

## 🧠 Pseudo-code

1. **Initialize game**
   - Set initial balance (e.g., `$100`)
   - Create scanner and random generator

2. **Display welcome message**
   - Show instructions and symbols used (🍒 🍉 🍋 🔔 ⭐)

3. **Start main game loop (while balance > 0):**

   1. Display current balance  
   2. Ask user to enter bet amount  

   3. **Validate bet:**
      - If bet > balance → show "Insufficient funds", restart loop
      - If bet ≤ 0 → show "Bet must be greater than 0", restart loop  
      - Otherwise, subtract bet from balance

   4. Spin slot machine (generate 3 random symbols)  
   5. Display the result (e.g., 🍒 | 🍋 | 🍒)

   6. **Check payout conditions:**
      - If all 3 symbols match → calculate high payout
      - If 2 symbols match → calculate medium payout
      - Else → payout is 0

   7. Add any winnings to balance  
   8. Display result message ("You won...", or "You lost...")

   9. Ask the player: "Do you want to play again? (Y/N)"  
      - If answer is not "Y", exit the loop

4. **Game over:**
   - Show final balance and goodbye message
---

## 🔢 Payout Logic

- **Three matching symbols**:
  - 🍒 → `bet × 3`
  - 🍉 → `bet × 4`
  - 🍋 → `bet × 5`
  - 🔔 → `bet × 10`
  - ⭐ → `bet × 20`

- **Two matching symbols**:
  - 🍒 → `bet × 2`
  - 🍉 → `bet × 3`
  - 🍋 → `bet × 4`
  - 🔔 → `bet × 5`
  - ⭐ → `bet × 10`

- No matches → No payout

---

## Why I Created This Project

This project was developed as a way to revisit and reinforce my foundational knowledge of Java programming. By working on practical projects like this, I aim to solidify my understanding of core concepts and build a strong base for advancing further in Java development.

Although this is a simple project, it serves as an important exercise in applying fundamental programming principles, such as control flow, data handling, and user interaction.

### What I Learned and Gained

- **Strengthened Core Java Skills:** Practiced key concepts including variables, loops, conditionals, methods, and arrays.
- **Improved Problem-Solving:** Developed logical thinking by implementing game rules and validating user inputs.
- **Enhanced Code Organization:** Learned to modularize the program by breaking down tasks into separate methods for clarity and reusability.
- **User Interaction:** Gained experience handling console input/output and controlling program flow based on user responses.
- **Confidence Building:** Completed a functional project which increases readiness for more complex Java applications.

---

## 🧑‍💻 How to Run

### Prerequisites
- Java JDK 8 or above
- A terminal or IDE (e.g. IntelliJ IDEA, Eclipse, or VS Code)

### Steps
```bash
# Compile
javac Main.java

# Run
java Main

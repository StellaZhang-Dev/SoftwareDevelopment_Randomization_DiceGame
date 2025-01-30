# 🎲 SoftwareDevelopment_Randomization_DiceGame

## 📌 Project Overview
This project implements a simple **Dice Game** in Java, where the player rolls three dice to achieve a target sum of **12**. The game continues until the player chooses to quit.

## 🛠 Features
- **Random Dice Rolls:** Uses Java's `Random` class to generate dice values.
- **Win/Loss Conditions:**
  - If the sum of the three dice is exactly `12`, the player wins.
  - If the sum exceeds `12`, the player loses.
  - Otherwise, the game continues.
- **Input Validation:** Ensures valid user input (1, 2, 3, or 'q').
- **Game Statistics:** Tracks the number of wins and losses.
- **Replayable Game Loop:** The game runs in a loop until the player exits.

## 🚀 How to Run the Project

### **1️⃣ Clone the Repository**
```sh
 git clone git@github.com:StellaZhang-Dev/SoftwareDevelopment_Randomization_DiceGame.git
 cd SoftwareDevelopment_Randomization_DiceGame
```

### **2️⃣ Compile the Java File**
```sh
javac Main.java
```

### **3️⃣ Run the Game**
```sh
java Main
```

## 📜 Game Logic (Pseudocode)
```plaintext
Display welcome message
WHILE game is running:
    Ask the user which dice to roll (1, 2, or 3) OR type 'q' to quit
    Validate input
    Roll selected dice (random value between 1-6)
    Update total sum
    Check win conditions:
        - If sum == 12 → Player wins
        - If sum > 12 → Player loses
        - Otherwise, continue game
    Display game statistics
END
```

## 📂 Code Structure
```plaintext
📁 SoftwareDevelopment_Randomization_DiceGame/
│── 📄 Main.java  # Main program file
│── 📄 README.md  # Project documentation (this file)
```

## 📸 Example Gameplay Output
```plaintext
Welcome to dice game 12. You must roll 1-3 dice and try to get the sum of 12 ...

Enter which dice you want to roll [1,2,3] (exit with q): 1
5 0 0 sum: 5 #win: 0 #loss: 0

Enter which dice you want to roll [1,2,3] (exit with q): 2
5 5 0 sum: 10 #win: 0 #loss: 0

Enter which dice you want to roll [1,2,3] (exit with q): 3
5 5 3 sum: 13 #win: 0 #loss: 1
You lost!!
Next round!
```

## 🔮 Future Enhancements
- 🔄 **Multiple Difficulty Levels:** Adjust target sum dynamically.
- 🎨 **Graphical UI:** Convert to a Java GUI application.
- 💾 **Persistent Scoreboard:** Save game statistics across sessions.

## 📜 License
This project is licensed under the **MIT License**. Feel free to modify and use it while giving proper credit.

---
**Created by Stella Zhang** 🚀


